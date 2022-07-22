package com.example;

import java.util.Arrays;

public class NumberObject {         //create the class
    int[] num;                  //attribute of the class

    public NumberObject(int[] number) {         //Constructor
 // clone() method is added in constructor , getter and setter
        this.num = number.clone();
    }

    public int[] getNum() {                     //getter
        return this.num.clone();
    }

    public void setNum(int[] numbers) {         //setter
        this.num = numbers.clone();
    }

    public String toString() {                    //return the string of Arrays
        return "it is: " + Arrays.toString(num);
    }

}
