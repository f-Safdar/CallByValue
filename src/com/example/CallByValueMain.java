package com.example;

public class CallByValueMain {
    public static void main(String[] args) {
        String[] str1 = {"Hello", "Hi", "Welcome", ""};

        CallByValue string = new CallByValue(str1);
        System.out.println("The string Before is : " + string);

        str1[2] = "Hi";
        System.out.println("The string After is : " + string);

    }
}
