package com.jmh.mapper;

import static org.junit.Assert.assertNull;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jmh.domain.BoardVO;
import com.jmh.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.jmh.config.RootConfig.class})
public class BoardServiceTests {
	
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
	@Test
	public void testExist() {
		log.info(service);
		assertNull(service);
	}
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("새로새로 작성하는 글!");
		board.setContent("새로새로 작성하는 내용!");
		board.setWriter("newbie");
		
		service.register(board);
		
		log.info("생성된 게시물의 번호: " + board.getBno());
	}
}
