package org.example;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,8,9,1,2,3,4,5,6,1,2,3);

        // AVERAGE
        double avg = list.stream()
                    .mapToDouble(Integer :: doubleValue)
                    .average()
                    .orElse(0.0);


        // Convert UpperCase OR LowerCase
        List<String> str = new ArrayList<>();
        str.add("Arjun");
        str.add("Raghav");
        str.add("Arvind");
        str.add("Pinky");
        str.add("Surya");
        str.add("Ajay");

        List<String> sU = str.stream().map(String :: toUpperCase).collect(Collectors.toList());
        List<String> sL = str.stream().map(String :: toLowerCase).collect(Collectors.toList());



        //SUM of ODD and EVEN
        Integer evenSum = list.stream().filter(i->i%2==0).mapToInt(Integer :: intValue).sum();
        Integer oddSum = list.stream().filter(i->i%2!=0).mapToInt(Integer :: intValue).sum();



        //REMOVE DUPLICATE
        List<Integer> dupli = list.stream().distinct().collect(Collectors.toList());


        //COUNT STRING STARTS WITH SOME LETTER
        Long count = str.stream().filter(s->s.startsWith(String.valueOf('A'))).count();



        //SORT A STRING IN ALPHABETICAL ORDER, ASCENDING OR DESCENDING
        List<String> sAscending = str.stream().sorted().collect(Collectors.toList());
        List<String> sDescending = str.stream().sorted((s1,s2) -> s2.compareTo(s1)).collect(Collectors.toList());



        // MAXIMUM AND MINIMUM INTEGER
        Integer iMax = list.stream().max((i1,i2) -> i1.compareTo(i2)).get();
        Integer iMin = list.stream().min((i1,i2) -> i1.compareTo(i2)).get();



        //FIND SECOND SMALLEST AND LARGEST
        Integer secSmall = list.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        Integer secLargest = list.stream().distinct().sorted((i1,i2)->i2.compareTo(i1))
                            .skip(1).findFirst().orElse(null);


//        System.out.println(avg);
//        System.out.println(sU);
//        System.out.println(sL);
//        System.out.println(evenSum);
//        System.out.println(oddSum);
//        System.out.println(dupli);
//        System.out.println(count);
//        System.out.println(sAscending);
//        System.out.println(sDescending);
//        System.out.println(iMin);
//        System.out.println(iMax);
//        System.out.println(secLargest);
//        System.out.println(secSmall);
    }
}