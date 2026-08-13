package com.sist.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sist.web.service.RecipeService;
import com.sist.web.vo.RecipeVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RecipeController {
	private final RecipeService recipeService;
	
	@GetMapping("/recipe/list")
	public ResponseEntity<Map> recipeListData(@RequestParam(value="page",defaultValue = "1")int page) {
		Map map = new HashMap();
		try {
			List<RecipeVO> list = recipeService.recipeListData(page);
			int[] pages = recipeService.recipePages(page);
			int count = recipeService.recipeCount();
			map.put("list",list);
			map.put("pages",pages);
			map.put("count", count);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(map);
	}
}
