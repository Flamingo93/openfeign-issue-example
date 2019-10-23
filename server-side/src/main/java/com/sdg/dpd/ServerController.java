package com.sdg.dpd;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("server")
public class ServerController {

    @GetMapping("get")
    public String getString(@RequestHeader HttpHeaders headers){
        System.out.println("Headers:" + headers.toString());
        return "String from server";
    }

    @GetMapping("string")
    public String getString(@RequestParam String string, @RequestHeader HttpHeaders headers) {
        System.out.println("Got: " + string);
        System.out.println("Headers:" + headers.toString());
        return string;
    }
}
