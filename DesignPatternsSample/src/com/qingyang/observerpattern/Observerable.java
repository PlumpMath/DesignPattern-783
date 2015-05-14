package com.qingyang.observerpattern;

import java.util.Observable;

public class Observerable extends Observable {
	public Observerable(){
      setChanged();	
    } 
}
