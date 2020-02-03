package com.example.starter;
import java.util.Random;

public class Logic {
    public int random(int a, int b){ //a<=b
        Random obj = new Random();
        return (obj.nextInt(b-a)+a);
    }
}
