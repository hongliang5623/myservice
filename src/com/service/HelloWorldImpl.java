package com.service;
import javax.jws.WebService;  

import com.service.HelloWorld;  
@WebService(endpointInterface = "com.service.HelloWorld",  
            serviceName = "HelloWorld")  
public class HelloWorldImpl implements HelloWorld {  
   
    public String sayHi(String text) {  
        return "Hello " + text;  
    }  
}  