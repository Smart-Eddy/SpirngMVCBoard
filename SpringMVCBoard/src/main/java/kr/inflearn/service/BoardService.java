package kr.inflearn.service;

import java.util.List;

import kr.inflearn.model.BoardVO;

public interface BoardService {
	
		//게시물 리스트 가져오기
		public List<BoardVO> getList();
		
		//게시물 등록
		public void register(BoardVO board);
		
		//게시글 상세보기
		public BoardVO get(int bno, String mode);
		
		//게시물삭제
		public int remove(int bno);
		
		//게시물수정
		public int modify(BoardVO board);
}
