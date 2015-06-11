package strageMode;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.qingyang.conditionpattern.GumballMachine;
import com.qingyang.dynamicproxy.DynamicProxy;
import com.qingyang.dynamicproxy.RealSubject;
import com.qingyang.dynamicproxy.Subject;
import com.qingyang.factorypattern.HangZhouIngredientFactory;
import com.qingyang.factorypattern.PizzIngredientFactory;
import com.qingyang.factorypattern.ShanghaiIngredientFactory;
import com.qingyang.observerpattern.ObserverOne;
import com.qingyang.observerpattern.ObserverTwo;
import com.qingyang.observerpattern.Observerable;
import com.qingyang.strategypattern.Duck;
import com.qingyang.strategypattern.MuteDuck;
import com.qingyang.wrappattern.Beverage;
import com.qingyang.wrappattern.Espresso;
import com.qingyang.wrappattern.IceCream;
import com.qingyang.wrappattern.Milk;

public class Main {
	/**
    public static void main(String[] args){
    	    System.out.println("策略模式");
    	    Duck duck = new MuteDuck();
    	    duck.fly();
    	    duck.swim();
    	    
    	    duck.quack();
    	    
    	    System.out.println("观察者模式");
    	    Observerable observer = new Observerable();
    	    ObserverOne observerOne = new ObserverOne();
    	    ObserverTwo observerTwo = new ObserverTwo();
    	   
    	    observer.addObserver(observerOne);
    	    observer.addObserver(observerTwo);
       
    	    observer.notifyObservers();
       
        observer.deleteObserver(observerOne);
        observer.deleteObserver(observerTwo);

	    System.out.println("装饰模式");
        
	    Beverage espresso = new Espresso();
        System.out.println("original price "+ espresso.cost());  

        espresso = new Milk(espresso);
        espresso = new IceCream(espresso);
        
        System.out.println("price with condiment "+espresso.cost());  
        System.out.println(espresso.getDescription());  
        
	    System.out.println("抽象工厂");
	    PizzIngredientFactory factory;
	    factory = new HangZhouIngredientFactory();
	    factory.createCheese().getCheese();
	    factory.createDough().getDough();
	    factory.createSauce().getSauce();
	   
	    factory = new ShanghaiIngredientFactory();
	    factory.createCheese().getCheese();
	    factory.createDough().getDough();
	    factory.createSauce().getSauce();
	    
	    System.out.println("动态代理");
	    Subject realSubject = new  RealSubject();
	    InvocationHandler handler  = new  DynamicProxy(realSubject);
	    Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
        subject.sayHello();
        
        System.out.println("状态模式");
        //就是给接口根据不同的状态设置不同的接口实现
        GumballMachine gumballMachine = new GumballMachine();
        gumballMachine.insertQuarter();
    }
    **/
	
}
