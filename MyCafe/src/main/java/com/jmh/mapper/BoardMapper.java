package com.jmh.mapper;

import java.util.List;

import com.jmh.domain.BoardVO;
import com.jmh.domain.Criteria;

public interface BoardMapper {
	//@Select("select * from tb1_board where bno > 0")
	//게시글 등록
	public List<BoardVO> getList();
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	//게시글 등록
	public void insert(BoardVO board);
	public void insertSelectKey(BoardVO board);
	
	//게시글 내용
	public BoardVO read(Long bno);
	
	//게시글 삭제
	public int delete(Long bno);
	
	//게시글 수정
	public int update(BoardVO board);
	
	
}
