package com.springbootdemo.config;

import static java.util.Collections.swap;

/*
  @author:cn
  @date:2024/9/30 13:47
*/
public class Example{
    public static void main(String args[]){
        int [] refToArray={10,11};
        int var = 1;
        refToArray[var-1] = 2;
        System.out.println(refToArray[0]+" "+refToArray[1]);
    }
}