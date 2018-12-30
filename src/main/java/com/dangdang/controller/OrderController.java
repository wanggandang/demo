package com.dangdang.controller;

import com.dangdang.VO.ResultVO;
import com.dangdang.entity.OrderDetail;
import com.dangdang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    /*{"detailId":"007","orderId":"107","productId":"207","productName":"冰激凌","productPrice":1.0,"productQuantity":1,"productIcon":"http:www.****.com"}*/

    @PostMapping("save")
    public ResultVO creatOrder(@RequestBody OrderDetail orderDetail){
        ResultVO resultVO = new ResultVO();
        try{
            orderService.creatOrder(orderDetail);
            resultVO.setCode(0);
            resultVO.setMsg("添加成功");
        }
        catch (Exception e){
            resultVO.setCode(1);
            resultVO.setMsg("添加失败");
        }

        return resultVO;
    }


}

