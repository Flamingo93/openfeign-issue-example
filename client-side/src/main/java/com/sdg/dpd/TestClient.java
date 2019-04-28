package com.sdg.dpd;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "cliet-feign", url = "http://localhost:8001/server")
public interface TestClient {

    @GetMapping("string")
    String getString(@RequestParam("string") String string);

    @GetMapping("user")
    String getUser(@SpringQueryMap User user);

    @GetMapping("users")
    String getUsers(@SpringQueryMap UserList users);
}
