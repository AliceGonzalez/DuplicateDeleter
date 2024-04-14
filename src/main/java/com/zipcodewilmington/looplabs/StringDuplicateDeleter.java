package com.zipcodewilmington.looplabs;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        //NEED TO COMPLETE
        Map<String, Integer> frequent = new HashMap<>();

        for(String str : array){
            frequent.put(str, frequent.getOrDefault(str, 0) + 1);
        }

        List<String> results = new ArrayList<>();
        for(String str : array){
            if(frequent.get(str) < maxNumberOfDuplications){
                results.add(str);
            }
        }

        return results.toArray(new String[0]);

    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        //NEED TO COMPLETE
        Map<String, Integer> frequent = new HashMap<>();
        for(String str : array){
            frequent.put(str, frequent.getOrDefault(str, 0) + 1);
        }

        List<String> results = new ArrayList<>();
        for(String str : array){
            if(frequent.get(str) != exactNumberOfDuplications){
                results.add(str);
            }
        }
        return results.toArray(new String[0]);
    }
}
