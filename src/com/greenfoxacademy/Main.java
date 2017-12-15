package com.greenfoxacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        List<Palindrome> palindromes = new ArrayList<>(Arrays.asList(
            new Palindrome("doggod"),
            new Palindrome("dog god"),
            new Palindrome("Markoka"),
            new Palindrome("indulagor"),
            new Palindrome("napi"),
            new Palindrome("nzpi")
        ));




        List<Palindrome> orderedBySecondndChar = palindromes.parallelStream()
                .sorted(new Comparator<Palindrome>() {
                    @Override
                    public int compare(Palindrome o1, Palindrome o2) {
                        return o1.getText().charAt(1) - o2.getText().charAt(1) ;
                    }
                }).collect(Collectors.toList());



            for (Palindrome p:orderedBySecondndChar
                 ) {
                System.out.println(p.getText());

            }
        }



    }






