package com.example.examplestatemachine;

public abstract class State {
	
    protected StateContext sc;
    protected boolean accept = false;
    protected boolean isActionA= false;
    
    public void actionA() {
        isActionA= true;
    }
    
    public void actionB() {
        isActionA= false;
    }
    
    public boolean isAccept() {
        return this.accept;
    }
}
