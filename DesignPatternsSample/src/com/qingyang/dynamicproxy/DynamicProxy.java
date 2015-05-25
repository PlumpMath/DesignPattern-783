package com.qingyang.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{

	private Object subject;
	
	public DynamicProxy(Object subject){
		this.subject =subject;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		
		 //�����ڴ�����ʵ����ǰ���ǿ������һЩ�Լ��Ĳ���
        System.out.println("before sayHello");
        
        System.out.println("Method:" + method);
        
        //    ��������������ʵ����ķ���ʱ������Զ�����ת��������������handler�����invoke���������е���
        method.invoke(subject, args);
        
        //�����ڴ�����ʵ���������Ҳ�������һЩ�Լ��Ĳ���
        System.out.println("after sayHello");
        
		return null;
	}

}
