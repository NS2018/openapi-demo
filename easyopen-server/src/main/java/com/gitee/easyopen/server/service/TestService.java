package com.gitee.easyopen.server.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author tjp
 */
@FeignClient("demo")
public interface TestService {

    @GetMapping("/v1")
    void test();
}
