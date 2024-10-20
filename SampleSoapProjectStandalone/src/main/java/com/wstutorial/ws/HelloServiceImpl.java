package com.wstutorial.ws;
import javax.jws.WebService;

@WebService(endpointInterface = "com.wstutorial.ws.HelloService")
public class HelloServiceImpl implements HelloService {

	public String sayHello(String content) {
		return "Hello " + content + " !";
	}

}