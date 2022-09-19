package com.yahaha.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yahaha.common.utils.PageUtils;
import com.yahaha.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author yahaha
 * @email leifengyang@gmail.com
 * @date 2022-09-19 09:03:21
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

