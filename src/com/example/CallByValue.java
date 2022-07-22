package com.example;

import java.util.Arrays;

public class CallByValue {

     public String[] str;  // one Object attribute using Arrays

    public CallByValue(String[] strs) {         // Constructor
//        this.str = strs;                     // normal value initialized
        this.str = strs.clone();              //.clone() added to call by values
    }


    public String[] getStr() {                    // getter
//        return this.str;                       // normal value initialized
        return this.str.clone();                //.clone() method to the getter
    }

    public void setStr(String[] strs) {             // setter
//        this.str = strs;                         // normal value initialized
        this.str = strs.clone();                  //.clone() method to the setter
    }

    @Override
    public String toString() {
        return Arrays.toString(str);
    }
}
