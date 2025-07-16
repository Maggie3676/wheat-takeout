package com.sky.service;

<<<<<<< HEAD
import com.sky.dto.OrdersPaymentDTO;
import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderPaymentVO;
=======
import com.sky.dto.OrdersSubmitDTO;
>>>>>>> 4eb507dcf3af3f4a976f145fb35376f973ff6f76
import com.sky.vo.OrderSubmitVO;

public interface OrderService {

    /**
     * 用户下单
     * @param ordersSubmitDTO
     * @return
     */
    OrderSubmitVO orderSubmit(OrdersSubmitDTO ordersSubmitDTO);
<<<<<<< HEAD

    /**
     * 订单支付
     * @param ordersPaymentDTO
     * @return
     */
    OrderPaymentVO payment(OrdersPaymentDTO ordersPaymentDTO) throws Exception;

    /**
     * 支付成功，修改订单状态
     * @param outTradeNo
     */
    void paySuccess(String outTradeNo);
=======
>>>>>>> 4eb507dcf3af3f4a976f145fb35376f973ff6f76
}
