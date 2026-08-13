package com.sist.web.vo;

import lombok.Data;

@Data
public class FoodVO {
	private int no;
	private int likecount,replycount,jjimcount,hit;
	private String name,address,phone,parking,poster,time,content,price,type,theme;
	private double score;
}	
