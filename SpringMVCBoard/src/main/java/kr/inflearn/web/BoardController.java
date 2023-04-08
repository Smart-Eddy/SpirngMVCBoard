package kr.inflearn.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.inflearn.model.BoardVO;
import kr.inflearn.service.BoardService;

/**
 * @author Smart-Eddy
 *  /list.do ------> GET  ---> list()
 *  /register.do --> POST ---> register()
 *  /read.do ------> GET  ---> read()
 *  /remove.do ----> GET  ---> remove()
 *  /modify.do ----> POST ---> modify() 
 */
@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	//게시글 목록보기
	@RequestMapping("/list.do")
	public String list(Model model) {
		List<BoardVO> list = service.getList();
		model.addAttribute("list", list);
		return "boardList"; //boardList.jsp
	}
	//게시글등록 화면
	@RequestMapping(value= "/register.do", method=RequestMethod.GET)
	public String registerGET() {
		return "register"; 
	}
	//게시글등록
	@RequestMapping(value= "/register.do", method=RequestMethod.POST)
	public String registerPOST(BoardVO board) {
		service.register(board);
		return "redirect:/list.do"; 
	}
	//게시글 상세조회
	@RequestMapping("/get.do")
	public String get(@RequestParam("bno")int bno, Model model) {
		BoardVO board = service.get(bno, "get");
		model.addAttribute("board",board);
		return "get";
	}
	//게시글 수정페이지
	@RequestMapping(value="/modify.do", method=RequestMethod.GET)
	public String modifyGET(@RequestParam("bno") int bno, Model model) {
		BoardVO board = service.get(bno, "modify");
		model.addAttribute("board", board);
		return "modify";
	}
	//게시글 수정
	@RequestMapping(value="/modify.do", method=RequestMethod.POST)
		public String modifyPOST(BoardVO board) {
		service.modify(board);
		return "redirect:/list.do";	
		}
	//게시글 삭제
	@RequestMapping("/remove.do")
	public String remove(@RequestParam("bno")int bno) {
		service.remove(bno);
		return "redirect:/list.do";
		
	}


}
