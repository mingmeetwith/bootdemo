//package com.wm.demo.chapter4.main;
//
//import com.wm.demo.chapter4.aspect.service.impl.HelloServiceImpl;
//import com.wm.demo.chapter4.intercept.MyInterceptor;
//import com.wm.demo.chapter4.proxy.ProxyBean;
//import com.wm.demo.chapter4.service.HelloService;
//
//public class AopMain {
//
//	public static void main(String[] args) {
//		testProxy();
//	}
//
//	private static void testProxy() {
//		HelloService helloService = new HelloServiceImpl();
//		HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
//		proxy.sayHello("zhangsan");
//		System.out.println("\n###############name is null!!#############\n");
//		proxy.sayHello(null);
//	}
//
//}
