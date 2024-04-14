package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        //NEED TO COMPLETE
        Map<Integer, Integer> frequent = new HashMap<>();

        for( int num : array){
            frequent.put(num, frequent.getOrDefault(num, 0) + 1);
        }

        List<Integer> results = new ArrayList<>();
        for(int num : array){
            if(frequent.get(num) < maxNumberOfDuplications){
                results.add(num);
            }
        }

        return results.toArray(new Integer[0]);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        //NEED TO COMPLETE
        Map<Integer, Integer> frequent = new HashMap<>();
        for(int num : array){
            frequent.put(num, frequent.getOrDefault(num, 0) + 1);
        }

        List<Integer> results = new ArrayList<>();
        for(int num : array){
            if(frequent.get(num) != exactNumberOfDuplications){
                results.add(num);
            }
        }
        return results.toArray(new Integer[0]);
    }
}
