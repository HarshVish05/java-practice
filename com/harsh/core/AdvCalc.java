package com.harsh.core;

public class AdvCalc extends Calc {
    public int mul(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }

    public void display(){
        System.out.println("method inside AdvanceCalc");
    }
}
