package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {
    private T[] test;

    public ArrayUtility(T[] array){
        this.test=array;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        int counter = 0;
        for (T element:test) {
            if(element.equals(valueToEvaluate)){
                counter++;
            }
        }
        for (T elem: arrayToMerge) {
            if(elem.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        ArrayList<T> merged = new ArrayList<>(Arrays.asList(arrayToMerge));
        merged.addAll(Arrays.asList(test));
        int counter = 0;
        int mostCommon = 0;
        for (int i = 0; i < merged.size(); i++) {
            for (int j = 0; j < merged.size(); j++) {
            if(merged.get(i) == merged.get(j)){
                counter++;
                if(counter > mostCommon){
                    mostCommon = i;
                }

            }
            }
        }
        return merged.get(mostCommon);
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
       int counter = 0;
        for (T element:test) {
            if (element.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    public T[] removeValue(T valueToRemove) {
        ArrayList<T> tester = new ArrayList<>();
        for (T element: test) {
            if(!(element).equals(valueToRemove)){
                tester.add(element);

            }
        }
        return tester.toArray(Arrays.copyOf(this.test,tester.size()));
    }
}
