package com.test;  
  
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;  
import org.apache.cxf.interceptor.*;  
import com.service.HelloWorld;  
public  class Client {  
  
    public static void main(String args[]) throws Exception {  
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
        factory.getInInterceptors().add(new LoggingInInterceptor());  
        factory.getOutInterceptors().add(new LoggingOutInterceptor());  
        factory.setServiceClass(HelloWorld.class);  
        factory.setAddress("http://localhost:8080/myservice/services/HelloWorld");  
        HelloWorld client = (HelloWorld) factory.create();  

        String reply = client.sayHi("HI");  
        System.out.println("Server said: " + reply);  
    }  
//    http://localhost:8080/myservice/services/
//    http://localhost:8080/myservice/services/HelloWorld?wsdl
//    http://localhost:8080/myservice/services/HelloWorld/sayHi?text=dfdf
  
}  