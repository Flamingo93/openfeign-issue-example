package com.sdg.dpd;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("server")
public class ServerController {

    @GetMapping("string")
    public String getString(@RequestParam String string, @RequestHeader HttpHeaders headers) {
        System.out.println("Got: " + string);
        System.out.println("Headers:" + headers.toString());
        return string;
    }

    @GetMapping("user")
    public String getUserString(User user, @RequestHeader HttpHeaders headers) {
        System.out.println("Got: " + user);
        System.out.println("Headers:" + headers.toString());
        return user.toString();
    }
}
