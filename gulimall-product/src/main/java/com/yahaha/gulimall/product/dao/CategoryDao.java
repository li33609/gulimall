package com.yahaha.gulimall.product.dao;

import com.yahaha.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yahaha
 * @email leifengyang@gmail.com
 * @date 2022-09-17 13:22:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
