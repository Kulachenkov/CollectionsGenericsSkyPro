package com.company;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        exerciseOne(nums);
        exerciseTwo(nums);

        String string = "В этой строке строке могут встречаться дубли дубли";
        exerciseThree(string);
        exerciseFour(string);
    }

    public static void exerciseOne(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        print(result);
    }

    public static void exerciseTwo(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }
        result.sort(Integer::compareTo);
        print(result);
    }

    public static void exerciseThree(String text) {
        List<String> strings = new ArrayList<>(textToList(text));
        Set<String> newSet = new HashSet<>();
        for (String string : strings) {
            newSet.add(string);
        }
        System.out.println(newSet);
    }

    public static void exerciseFour(String text) {
        List<String> strings = new ArrayList<>(textToList(text));
        Set<String> newSet = new HashSet<>();
        for (String string : strings) {
            newSet.add(string);
        }
        int result = strings.size() - newSet.size();
        System.out.println(result);
    }

    public static void print(List<Integer> nums){
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static List<String> textToList(String text) {
        List<String> stringList = new ArrayList<>();
        for (String string : text.split(" ")) {
            stringList.add(string);
        }
        return stringList;
    }

}
