package com.yahaha.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yahaha.common.utils.PageUtils;
import com.yahaha.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author yahaha
 * @email leifengyang@gmail.com
 * @date 2022-09-19 09:03:21
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

