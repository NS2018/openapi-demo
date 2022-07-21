package com.gitee.easyopen.server.api;

import com.gitee.easyopen.annotation.Api;
import com.gitee.easyopen.annotation.ApiService;
import com.gitee.easyopen.doc.annotation.ApiDoc;
import com.gitee.easyopen.doc.annotation.ApiDocMethod;
import com.gitee.easyopen.server.api.param.GoodsParam;
import com.gitee.easyopen.server.api.result.Goods;
import com.gitee.easyopen.server.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * 业务类
 *
 * @author tanghc
 */
@ApiService
@ApiDoc("商品模块")
public class GoodsApi {

    @Autowired
    private TestService testService;

    @Api(name = "goods.get")
    @ApiDocMethod(description = "获取商品")
    Goods getGoods(GoodsParam param) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        testService.test();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        Goods goods = new Goods();
        goods.setId(1L);
        goods.setGoods_name("苹果iPhoneX");
        goods.setPrice(new BigDecimal(8000));
        return goods;
    }

}
