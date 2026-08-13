package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * NO                                        NOT NULL NUMBER
 POSTER                                             VARCHAR2(260)
 PRICE                                              VARCHAR2(100)
 CNO                                                NUMBER
 NAME                                      NOT NULL VARCHAR2(100)
 TYPE                                      NOT NULL VARCHAR2(200)
 PHONE                                     NOT NULL VARCHAR2(20)
 ADDRESS                                   NOT NULL VARCHAR2(500)
 SCORE                                              NUMBER(2,1)
 THEME                                     NOT NULL CLOB
 TIME                                               VARCHAR2(50)
 RESERVE                                            VARCHAR2(100)
 PARKING                                            VARCHAR2(100)
 CONTENT                                   NOT NULL CLOB
 IMAGES                                             CLOB
 LIKECOUNT                                          NUMBER
 REPLYCOUNT                                         NUMBER
 JJIMCOUNT                                          NUMBER
 HIT                                                NUMBER
 */

@Entity
@Table(name="food2")
@Data
public class FoodEntity {
	@Id
	private int no;
	private int likecount,replycount,jjimcount,hit;
	private String name,address,phone,parking,poster,time,content,price,type,theme;
	private double score;
}	
