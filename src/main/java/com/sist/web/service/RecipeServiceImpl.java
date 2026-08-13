package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.RecipeMapper;
import com.sist.web.vo.RecipeDetailVO;
import com.sist.web.vo.RecipeVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService{
	
	private final RecipeMapper mapper;
	
	@Override
	public List<RecipeVO> recipeListData(int page) {
		// TODO Auto-generated method stub
		
		int start = (page*12)-12;
		
		
		return mapper.recipeListData(start);
	}

	@Override
	public int recipeCount() {
		// TODO Auto-generated method stub
		return mapper.recipeCount();
	}

	@Override
	public RecipeDetailVO recipeDetailData(int no) {
		// TODO Auto-generated method stub
		return mapper.recipeDetailData(no);
	}

	@Override
	public int[] recipePages(int page) {
		// TODO Auto-generated method stub
		
		int totalpage = recipeTotalPage();
		int curpage = page;
		final int BLOCK = 10;
		int startpage = (curpage*BLOCK/BLOCK)+1;
		int endpage = (curpage*BLOCK/BLOCK)+BLOCK;
		
		int[] pages = {curpage, totalpage, startpage, endpage}; 
		
		return pages;
	}

	@Override
	public int recipeTotalPage() {
		// TODO Auto-generated method stub
		int totalpage = (int)(Math.ceil(recipeCount()/12.0));
		return totalpage;
	}
	
}
