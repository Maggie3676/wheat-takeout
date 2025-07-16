package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
<<<<<<< HEAD
import org.apache.ibatis.annotations.Select;
=======
>>>>>>> 4eb507dcf3af3f4a976f145fb35376f973ff6f76

@Mapper
public interface OrderMapper {
    /**
     * 向订单表插入1条数据
     * @param orders
     */
    void insert(Orders orders);
<<<<<<< HEAD

    /**
     * 根据订单号查询订单
     * @param orderNumber
     */
    @Select("select * from orders where number = #{orderNumber}")
    Orders getByNumber(String orderNumber);

    /**
     * 修改订单信息
     * @param orders
     */
    void update(Orders orders);
=======
>>>>>>> 4eb507dcf3af3f4a976f145fb35376f973ff6f76
}
