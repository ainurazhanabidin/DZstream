package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.

        Integer []array= {1,2,3,4,5,6,7,8,9,10};


        Arrays.stream(array).filter(a -> a % 2 != 1 ).map(a-> a*a).max(Integer::compareTo).ifPresent(System.out::println);










    }
}
