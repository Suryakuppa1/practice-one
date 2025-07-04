package org.ArrayProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DupremovalArray {

    public static void main(String[] args) {
     int [] arr = {2,3,3,4,5,6,6};
     duplicateRemovalArray(arr);
     System.out.println();
     dupRemover(arr);


    }
    // using hashset
    private static void dupRemover(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        System.out.print(set + " ");

    }

    // using streams
    private static void duplicateRemovalArray(int[] arr) {
        int[] list = Arrays.stream(arr).distinct().toArray();
        for(int i : list){

            System.out.print(i + " ");
        }

    }



    }
