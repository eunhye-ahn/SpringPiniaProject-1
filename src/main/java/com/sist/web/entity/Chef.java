package com.sist.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * POSTER    NOT NULL VARCHAR2(300) 
CHEF      NOT NULL VARCHAR2(150) 
MEM_CONT1          VARCHAR2(20)  
MEM_CONT3          VARCHAR2(20)  
MEM_CONT7          VARCHAR2(20)  
MEM_CONT2          VARCHAR2(20) 
 */
@Entity
@Data
public class Chef {
	@Id
	private String chef;
	private String poster;
	private String mem_cont1,mem_cont3,mem_cont7,mem_cont2;
}
