package Advance_Java.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        var result=li.stream()
                    .filter(n -> n%2==0)
                    .map(n -> n*2)
                    .reduce(0,(a,b)->a+b);
        System.out.println(result);

        List<Integer> li1=Arrays.asList(8,6,7,4,5,9,8,36,5,7,9,6,3);
        var result1=li1.stream()
                    .filter(n->n%2==0||n%3==0||n%5==0)
                    .reduce(0,(a,b)->a+b);
        System.out.println(result1);

        li.forEach(System.out::println);
    }
}