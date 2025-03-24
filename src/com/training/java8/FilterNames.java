//create array list of 6 names then filter out with value start with S

package com.training.java8;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNames {
    public static void main(String[] args) {
        // Create an ArrayList of 6 names
        List<String> names = new ArrayList<>();
        names.add("Salim");
        names.add("Eman");
        names.add("Anwaar");
        names.add("Abear");
        names.add("Suleimaan");
        names.add("Ahmed");

        // Filter out names that start with 'S' //Stream
        List<String> filteredNames = names.stream().filter(n -> n.startsWith("S")).collect(Collectors.toList());

        // Print the filtered list
        System.out.println(filteredNames);
    }
}








