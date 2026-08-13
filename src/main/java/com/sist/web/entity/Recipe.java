package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * NO              NUMBER         
TITLE  NOT NULL VARCHAR2(2000) 
POSTER NOT NULL VARCHAR2(300)  
CHEF   NOT NULL VARCHAR2(200)  
LINK            VARCHAR2(260)  
HIT             NUMBER 
 */
@Entity
@Data
public class Recipe {
	@Id
	private int no;
	private String title,poster,chef,link;
	private int hit;
}
