package com.jmh.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jmh.domain.BoardVO;
import com.jmh.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.jmh.config.RootConfig.class})
@Log4j
public class BoardMapperTests {
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
//	@Test
//	public void testGestList(){
//		mapper.getList().forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void testInsert(){
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 제목");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("새로운 글쓴이");
//		
//		log.info(board);
//	}
//	
//	@Test
//	public void insertSelectKey() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 제목Key ");
//		board.setContent("새로 작성하는 내용Key");
//		board.setWriter("새로운 글쓴이Key");
//		
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//	}
//	
//	@Test
//	public void testRead() {
//		BoardVO board  = mapper.read(5L);
//		log.info(board);
//	}
//	
//	@Test
//	public void testDelete() {
//		log.info("DELETE COUNT: " + mapper.delete(3L));
//	}
//	
//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
//		board.setBno(4L);
//		board.setTitle("수정된 제목");
//		board.setContent("수정된 내용");
//		board.setWriter("user00");
//		
//		int count = mapper.update(board);
//		log.info("UPDATE COUNT: " + count );
//	}
//	
	@Test
	public void testPaging() {
		Criteria cri = new Criteria();
		cri.setPageNum(1);
		cri.setAmount(10);
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board));
	}
	
	
	
	
	
	
	
}
