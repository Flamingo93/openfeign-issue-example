package com.sdg.dpd;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cliet-feign", url = "http://localhost:8001/server")
public interface TestClient {

    @GetMapping("get")
    String getString();
}
