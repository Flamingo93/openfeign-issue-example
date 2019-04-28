package com.sdg.dpd;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("client")
public class ClientController {

    private TestClient testClient;

    public ClientController(TestClient testClient) {
        this.testClient = testClient;
    }

    @GetMapping("get")
    public String getString(User user, @RequestHeader HttpHeaders headers) throws IOException {

        List<User> userList = new ArrayList<>();
        userList.add(new User("chang",58));
        userList.add(new User("zhi",59));

        UserList users = new UserList(userList);

        String returnString = testClient.getString(user.getName());
        System.out.println("returnString: " + returnString);

        String returnUserString = testClient.getUser(user);
        System.out.println("returnUserString" + returnUserString);

        String returnUserList = testClient.getUsers(users);
        System.out.println(returnUserList);

        return "success";
    }
}
