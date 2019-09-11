package com.example.eurekaclient.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eureka-demo
 * @author: xuan
 * @create: 2019-08-08 17:26
 **/
@RestController
public class HelloEurekaClient {

    //    @Value("${server.port}")
//    String port;
//
//    @RequestMapping("/hi")
//    public String home(@RequestParam(value = "name", defaultValue = "xuan") String name) {
//        return "hi " + name + " ,i am from port:" + port;
//
//    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }


    public static void main(String[] args) {
        System.out.println(String.valueOf(1) instanceof String);
        int n = 7, m = 2;
//        double d = 7;
        n = n / m;
//        d /= m;
        n--;
        int a = 2 * n++;
//        int b = 2 * ++m;
        System.out.println(a);


    }
}
