package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaExp {
    // **NOTE** //
    /* Lambda can implement Functional Interface. It can only have a single that must be implemented. */
    public void testLambda() {
        //      Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for (String part: parts) {
//                    System.out.println(part);
//                }
//            }
//        };
        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(lambdaFunction.apply("1234567890"));
        System.out.println(everySecondCharacter(lambdaFunction, "123456789"));

        Supplier<String> supplierResult = ()->"I Love Java";
        System.out.println(supplierResult.get());
    }

    public String everySecondCharacter(Function<String,String> func, String source) {
        return func.apply(source);
    }

    public void challenge9(){
        List<String> topNames = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> names = topNames.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(names);

        ///Print names int Sorted Order
         topNames.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                 .peek(System.out::println)
                .sorted()
                .forEach(System.out::println);

        ////print names start with letter 'A'
        long count = topNames.stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();
        System.out.println("Number of names in alist that starts with 'A' " +count);

    }
}
