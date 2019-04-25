package com.sdg.dpd;

import feign.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "cliet-feign", url = "http://localhost:8001/server")
public interface TestClient {

    @GetMapping("string")
    String getString(@RequestParam("string") String string);

    @GetMapping("user")
    String getUser(@Param(value = "user") User user);
}
