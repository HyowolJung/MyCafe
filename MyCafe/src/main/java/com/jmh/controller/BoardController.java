package com.jmh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jmh.domain.BoardVO;
import com.jmh.domain.Criteria;
import com.jmh.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {

	private BoardService service;

//	 게시글 목록
//	@GetMapping("/list")
//	public void list(Model model) {
//		log.info("list");
//		model.addAttribute("list", service.getList());
//	}

	// 1. 게시글 목록페이지 (/board/list)
		@GetMapping("/list")
	public void list(@RequestParam(value="bgno") Model model, Long bgno) { // Criteria cri,
		log.info("list");
		model.addAttribute("list", service.getList(bgno)); // cri
		model.addAttribute("bgno", bgno);
		log.info("bgno값입니다." + bgno);
		
		//bgno의 값에 따라서 게시판이 출력해야할 데이터를 구분해야함.
		if (bgno == 1) {
			model.addAttribute("list", service.getList(bgno)); 	
		}else {
			log.info("bgno 체크");
		}
		
	}

	// 2-1. 게시글 등록 페이지(board/list-글쓰기)
	@GetMapping("/register")
	public void register() {

	}

	// 2-2. 게시글 등록페이지 (board/list/register-등록 완료)
	@PostMapping("/register")
	public String register(BoardVO board, RedirectAttributes rttr) {

		log.info("register: " + board);
		service.register(board);
		rttr.addFlashAttribute("result", board.getBno());
		return "redirect:/board/list";
	}

	// 3. 게시글 내용 페이지 (board/list/get)
	@GetMapping("/get")
	public void get(@RequestParam("bno") Long bno, Model model) {
		log.info("/get");
		model.addAttribute("board", service.get(bno));
	}

	// 4-1. 게시글 수정페이지 (/board/list/get-수정)
	@GetMapping("/modify")
	public void modify(@RequestParam("bno") Long bno, Model model) {
		log.info("/get");
		model.addAttribute("board", service.get(bno));
	}

	// 4-2. 게시글 수정 페이지 (/board/list/get/modify-수정 완료)
	@PostMapping("/modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		log.info("modify: " + board);
		if (service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";
	}

	// 5. 게시글 삭제 페이지(/board/list/get/modify-삭제 완료)
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		log.info("remove..." + bno);
		if (service.remove(bno)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";

	}
//	// 게시글 수정페이지 이동 &게시글 번호
//	@GetMapping({"/get", "/modify"})
//	public void get(@RequestParam("bno") Long bno,@RequestParam("bgno") Long bgno, Model model) {
//		log.info("/get or modify");
//		model.addAttribute("board", service.get(bno, bgno));
//	}

}
