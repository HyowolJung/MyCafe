package com.jmh.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.omg.CORBA.PUBLIC_MEMBER;

public interface BoardMapper {
	//@Select("select * from tb1_board where bno > 0")
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	public void insertSelectKey(BoardVO board);
	
}
