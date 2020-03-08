package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    private T[] test;

    public ArrayUtility(T[] array){
        this.test=array;
    }

    public T countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
    return null;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }

    public T getNumberOfOccurrences(T valueToEvaluate) {
        return null;
    }

    public T[] removeValue(T valueToRemove) {
     @SuppressWarnings("unchecked")
      T[] buffer = (T[]) Array.newInstance(valueToRemove.getClass(),test.length);
     int counter = 0;
        for (T element: buffer) {
            if(!element.equals(valueToRemove)){
                counter++;
            }
        }

        for (int i = 0; i < buffer.length; i++) {

        }
        return null;
    }
}
