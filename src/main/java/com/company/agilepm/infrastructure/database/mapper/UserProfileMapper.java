package com.company.agilepm.infrastructure.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.company.agilepm.infrastructure.database.dataobject.UserProfileDO;


/**
 * UserProfileMapper
 *
 * @author Frank Zhang
 * @date 2019-02-27 5:03 PM
 */
@Mapper
public interface UserProfileMapper {
    int create(UserProfileDO userProfileDO);

    int update(UserProfileDO userProfileDO);

    int delete(@Param("userId") String userId);

    UserProfileDO getByUserId(@Param("userId") String userId);

    List<UserProfileDO> listByDep(@Param("dep") String dep);
}
