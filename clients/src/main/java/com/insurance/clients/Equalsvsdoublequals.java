package com.insurance.clients;

public class Equalsvsdoublequals {
public static void main(String args[]) {
    String s1 = "Hello world"; 
    String s2 = "Hello world"; 
    String s3 =  new String("Hello world"); 
    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s2)); 
    System.out.println(s1.equals(s3)); 
}
}
