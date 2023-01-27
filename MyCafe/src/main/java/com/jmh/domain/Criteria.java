package com.jmh.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria {
	private int pageNum;
	private int amount;
	private int bgno;
	
	public Criteria ( ) {
		this(1,10,1);
	}

	public Criteria(int pageNum, int amount, int bgno) {
		this.pageNum = pageNum;
		this.amount = amount;
		this.bgno = bgno;
		
	}
	
	
}
