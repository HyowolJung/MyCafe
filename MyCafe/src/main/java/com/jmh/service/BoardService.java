package com.jmh.service;

import java.util.List;

import com.jmh.domain.BoardVO;
import com.jmh.domain.Criteria;

public interface BoardService {
	//게시글 등록
	public void register(BoardVO board);
	
	//게시글 번호 목록
	public BoardVO get(Long bno, Long bgno);
	
	//게시글 수정
	public boolean modify(BoardVO board);
	
	//게시글 삭제
	public boolean remove(Long bno);
	
	//게시글 목록
	public List<BoardVO> getList();
	
//	public List<BoardVO> getList(Criteria cri);
}
