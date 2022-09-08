package com.bct.java8features.streamsAPI;

import java.util.ArrayList;
import java.util.List;



public class Streamexample {
    public static void main(String[] args) {
//        create a collection
        List<String> name = new ArrayList<String>();
        
//        add the elements to the list
        name.add("hema");
        name.add("raka");
        name.add("hello");
        name.add("hii");
        
        
//        Create an integer based collection and check the even and odd numbers
//        using lambda and stream.
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(33);
        numbers.add(8);
        numbers.add(77);
        
        
//        numbers.stream().filter(num -> num%2==0){System.out.println("number is even")};
//        numbers.forEach((num)->{System.out.println("number is even");});
        numbers.stream().forEach(i -> {if (i.intValue() % 2 == 0) {System.out.println("number is even");;} else {System.out.println("number is odd");;}});
        
        
//        i would like to count the number of element present in the list
        int count =0;
        int a=0;
        for(String ele : name) {
            a++;
            
            if(ele.length()<6) {
                count++;
                System.out.println("there are : "+count+" string with length less than 6");
            }
        }System.out.println(a+" elements presents in name arraylist");
        
        
        
//        Lets apply stream now! - using lambda expression
        int number = (int) name.stream().filter(ele -> ele.length()<6).count();
        System.out.println("there are : "+number+" strings with length less than 6*");
    }
}