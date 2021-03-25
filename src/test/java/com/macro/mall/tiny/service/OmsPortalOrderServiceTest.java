package com.macro.mall.tiny.service;

import com.macro.mall.tiny.dto.OrderParam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: qianyong
 * Date: 2021/3/25
 * Time: 16:34
 * Description: No Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//配置mock
@AutoConfigureMockMvc
public class OmsPortalOrderServiceTest {
    @Autowired
    OmsPortalOrderService omsPortalOrderService;

    @Test
    public void getLearn() {
        OrderParam orderParam =new  OrderParam();
        orderParam.setCouponId(1l);
        orderParam.setMemberReceiveAddressId(2L);
        orderParam.setPayType(16);
        orderParam.setUseIntegration(23);
        omsPortalOrderService.generateOrder(orderParam);
    }
}