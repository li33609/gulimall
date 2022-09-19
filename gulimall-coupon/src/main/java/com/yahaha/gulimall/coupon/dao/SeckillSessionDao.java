package com.yahaha.gulimall.coupon.dao;

import com.yahaha.gulimall.coupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author yahaha
 * @email leifengyang@gmail.com
 * @date 2022-09-19 08:40:01
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
