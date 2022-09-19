package com.yahaha.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yahaha.common.utils.PageUtils;
import com.yahaha.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author yahaha
 * @email leifengyang@gmail.com
 * @date 2022-09-17 13:22:13
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

