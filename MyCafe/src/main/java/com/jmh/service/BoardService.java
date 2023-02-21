package com.jmh.service;

import java.util.List;

import com.jmh.domain.BoardVO;
import com.jmh.domain.Criteria;

public interface BoardService {
	//1. 게시글 목록 페이지
	public List<BoardVO> getList();
	
//	public List<BoardVO> getList(Criteria cri);
	
	//2. 게시글 등록 페이지
	public void register(BoardVO board);
	
	//3. 게시글 내용 페이지
	public BoardVO get(Long bno);
	
	//4. 게시글 수정 페이지
	public boolean modify(BoardVO board);
	
	//6. 게시글 삭제 페이지
	public boolean remove(Long bno);
	

	

}
