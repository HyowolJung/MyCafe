package com.jmh.mapper;

import java.util.List;

import com.jmh.domain.BoardVO;
import com.jmh.domain.Criteria;

public interface BoardMapper {
	//@Select("select * from tb1_board where bno > 0")
	public List<BoardVO> getList();
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	
	public void insert(BoardVO board);
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
	
}
