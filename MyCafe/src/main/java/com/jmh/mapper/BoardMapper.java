package com.jmh.mapper;

import java.util.List;

import com.jmh.domain.BoardVO;
import com.jmh.domain.Criteria;

public interface BoardMapper {
	//@Select("select * from tb1_board where bno > 0")
	//1. 게시글 목록 페이지
	public List<BoardVO> getList();
	
	//public List<BoardVO> getListWithPaging(Criteria cri);
	
	//2. 게시글 등록 페이지
	public void insert(BoardVO board);
	public void insertSelectKey(BoardVO board);
	
	//3. 게시글 내용 페이지
	public BoardVO read(Long bno);
	
	//4. 게시글 수정 페이지
	public int update(BoardVO board);
	
	//6. 게시글 삭제 페이지
	public int delete(Long bno);
	
}
