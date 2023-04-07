package kr.inflearn.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.inflearn.model.BoardVO;

//영속계층
@Mapper
public interface BoardMapper {
	
	//게시물 리스트 가져오기
	public List<BoardVO> getList();
	
	//게시물 등록
	public void insert(BoardVO board);
	
	//게시글 상세보기
	public BoardVO read(int bno);
	
	//게시물삭제
	public int delete(int bno);
	
	//게시물수정
	public int update(BoardVO board);
}
