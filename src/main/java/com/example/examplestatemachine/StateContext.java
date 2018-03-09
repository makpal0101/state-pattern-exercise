package com.example.examplestatemachine;

import java.util.*;
public class StateContext {
	
	ArrayList<Boolean> sc = new ArrayList<Boolean>();
    protected boolean accept = false;
    protected boolean isActionA= false;

	public void actionA() {
        isActionA= true;
        sc.add(isActionA);
	}
	public void actionB() {
        isActionA= false;
        sc.add(isActionA);
		
	}
	public boolean isAccept() {
		int l=sc.size();
		if(l==1) {
			accept=true;
		}
		for(int i=0; i<l; i++) {
			if(sc.get(0)==sc.get(l-1) ) {
				accept=true;
			}
			else {accept=false;}
		}
		return accept;
	}



}
