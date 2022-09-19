package com.yahaha.gulimall.order.dao;

import com.yahaha.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author order
 * @email leifengyang@gmail.com
 * @date 2022-09-19 10:11:38
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
