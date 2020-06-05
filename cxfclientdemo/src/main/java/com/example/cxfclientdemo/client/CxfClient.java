package com.example.cxfclientdemo.client;

import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.jaxrs.client.WebClient;
import sun.nio.ch.IOUtil;

import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.InputStream;

public class CxfClient {

    public static void main(String[] args) throws IOException {
        // 创建WebClient
        WebClient client = WebClient.create("http://localhost:8081/user/users");

        // 获取响应
        Response response = (Response) client.get();

        // 获取响应内容
        InputStream input = (InputStream) response.getEntity();
        String content = IOUtils.readStringFromStream(input);

        // 打印结果
        System.out.println(content);
    }
}
