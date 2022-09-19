package com.yahaha.gulimall.coupon.dao;

import com.yahaha.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yahaha
 * @email leifengyang@gmail.com
 * @date 2022-09-19 08:40:01
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
