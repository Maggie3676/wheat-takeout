package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询所关联套餐
     * @param dishIds
     * @return
     */
    List<Long> getSetmealByDishId(List<Long> dishIds);
}
