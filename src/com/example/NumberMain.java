package com.example;

public class NumberMain {

    public static void main(String[] args) {
        int[] num1 = {2, 4, 6, 8, 10};                                      // initialize the values to the array
        NumberObject useObj = new NumberObject(num1);                      //create an instance of the Object
        System.out.println("Before " + useObj);                          //print the object to the console
// change the values at specified index 0; that's the first value in the array
        num1[0] = 3;
        //check the result after changing the values and print the object
        System.out.println("After " + useObj);
//change the index 4, the fifth value in the array and print the object again
        num1[4] = 11;
        //again change the result and run to see the result
        System.out.println("Again " + useObj);
    }

}
