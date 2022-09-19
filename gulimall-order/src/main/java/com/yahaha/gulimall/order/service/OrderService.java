package com.yahaha.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yahaha.common.utils.PageUtils;
import com.yahaha.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author order
 * @email leifengyang@gmail.com
 * @date 2022-09-19 10:11:38
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

