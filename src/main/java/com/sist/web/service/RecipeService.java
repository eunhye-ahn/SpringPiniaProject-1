package com.sist.web.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.sist.web.vo.RecipeDetailVO;
import com.sist.web.vo.RecipeVO;


public interface RecipeService {
	public List<RecipeVO> recipeListData(@Param("start")int start);
	
	public int recipeCount();
	
	public RecipeDetailVO recipeDetailData(int no);
	
	public int[] recipePages(int page);
	
	public int recipeTotalPage();
}
