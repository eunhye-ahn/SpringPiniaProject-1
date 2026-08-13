package com.sist.web.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.repository.query.Param;

import com.sist.web.vo.RecipeDetailVO;
import com.sist.web.vo.RecipeVO;

@Mapper
public interface RecipeMapper {

	public List<RecipeVO> recipeListData(@Param("start")int start);
	
	public int recipeCount();
	
	@Select("SELECT * FROM recipeDetail "
			+ "WHERE no=#{no}")
	public RecipeDetailVO recipeDetailData(int no);
	
	@Update("UPDATE recipe SET hit=hit+1 "
			+ "WHERE no=#{no}")
	public void hitIncrement(int no);
}
