package com.sdg.dpd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class ClientController {

    private TestClient testClient;

    public ClientController(TestClient testClient) {
        this.testClient = testClient;
    }

    @GetMapping("get")
    public String getString() {
        return testClient.getString();
    }

    @GetMapping("print")
    public void decodeAndPrint() throws Exception {
        System.out.println(GZIPCompression.isCompressed(testClient.getBytes()));
        System.out.println(GZIPCompression.decompress(testClient.getBytes()));
    }
}
