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
	private int cribgno;
	
	public Criteria ( ) {
		this(1,10);
	}

	public Criteria(int pageNum, int amount) { //,int cribgno
		this.pageNum = pageNum;
		this.amount = amount;
		this.cribgno = cribgno;
		
	}
	
	
}
