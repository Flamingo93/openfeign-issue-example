package com.sdg.dpd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("server")
public class ServerController {


    @Autowired
    private HttpServletRequest request;

    @GetMapping("string")
    public String getString(@RequestParam String string, @RequestHeader HttpHeaders headers) {
        System.out.println((operation()));
        System.out.println("Got: " + string);
        System.out.println("Headers:" + headers.toString());
        return string;
    }

    @GetMapping("user")
    public String getUserString(User user, @RequestHeader HttpHeaders headers) {
        System.out.println((operation()));
        System.out.println("Got: " + user);
        System.out.println("Headers:" + headers.toString());
        return user.toString();
    }


    @GetMapping("users")
    public String getUserString(UserList users, @RequestHeader HttpHeaders headers) {
        System.out.println((operation()));
        System.out.println("Got: " + users);
        System.out.println("Headers:" + headers.toString());
        return users.toString();
    }


    @GetMapping("url")
    public String operation(){

        String url = "";
        url = request.getScheme() +"://" + request.getServerName()
                + ":" +request.getServerPort()
                + request.getServletPath();
        if (request.getQueryString() != null){
            url += "?" + request.getQueryString();
        }
        return url;
    }
}
