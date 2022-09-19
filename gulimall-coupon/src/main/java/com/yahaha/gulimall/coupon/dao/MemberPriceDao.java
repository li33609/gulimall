package com.yahaha.gulimall.coupon.dao;

import com.yahaha.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author yahaha
 * @email leifengyang@gmail.com
 * @date 2022-09-19 08:40:00
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
