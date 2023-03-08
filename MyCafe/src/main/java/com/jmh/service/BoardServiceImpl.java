package com.jmh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmh.domain.BoardVO;
import com.jmh.domain.Criteria;
import com.jmh.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	// 1. 게시글 목록 페이지
	@Override
	public List<BoardVO> getList(long bgno) {
		log.info("getList...............");
		return mapper.getList(bgno);
	}

	// 게시글 페이징
//		@Override
//		public List<BoardVO> getList(Criteria cri) {
//			log.info("get List with criteria: " + cri);
//			return mapper.getListWithPaging(cri);
//		}

	// 2. 게시글 등록 페이지
	@Override
	public void register(BoardVO board) {
		log.info("register....." + board);
		mapper.insertSelectKey(board);
	}

	// 3. 게시글 내용 페이지
	@Override
	public BoardVO get(Long bno) {
		log.info("get......" + bno);
		return mapper.read(bno);
	}

	// 4. 게시글 수정 페이지
	@Override
	public boolean modify(BoardVO board) {
		log.info("modify......" + board);
		return mapper.update(board) == 1;
	}

	// 5. 게시글 삭제 페이지
	@Override
	public boolean remove(Long bno) {
		log.info("remove....." + bno);
		return mapper.delete(bno) == 1;
	}

}
