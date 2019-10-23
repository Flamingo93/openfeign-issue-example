package com.sdg.dpd;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "client-feign", url = "http://localhost:8001/server")
public interface TestClient {

    @GetMapping("get")
    String getString();

    @GetMapping("get")
    byte[] getBytes();
}
