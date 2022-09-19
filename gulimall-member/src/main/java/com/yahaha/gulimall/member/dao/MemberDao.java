package com.yahaha.gulimall.member.dao;

import com.yahaha.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yahaha
 * @email leifengyang@gmail.com
 * @date 2022-09-19 09:03:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
