package com.TheTallestOfMidgets.UTIL;

import java.util.ArrayList;

public class ArrayList2String {
    public static String IntArray(ArrayList<Integer> arrayList){
        StringBuilder str = new StringBuilder();
        for (Integer integer : arrayList) {
            str.append((char) (int) integer); // i know this looks dumb but java will get mad otherwise
        }
        return str.toString();
    }

    public static String byteArray(ArrayList<Byte> arrayList ){
        StringBuilder str = new StringBuilder();
        for(Byte _byte : arrayList){
            str.append((char) (int) _byte);
        }
        return str.toString();
    }
}
