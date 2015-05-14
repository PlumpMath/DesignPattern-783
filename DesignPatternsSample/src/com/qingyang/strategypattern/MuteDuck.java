package com.qingyang.strategypattern;

public class MuteDuck extends Duck {
     public MuteDuck(){
    	     setFlyBehavior(new FlyWithWing());
    	     setQuackBehavior(new NoQuack());
     }
}
