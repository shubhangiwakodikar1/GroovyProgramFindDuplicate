package org.example

import java.util.stream.Stream

static void main(String[] args) {
    String[] stringArray = ["abc", "bcd", "cde", "bcd"];
    if (Stream.of(stringArray).distinct().count() < stringArray.length) {
        println("duplicate exists");
        HashMap countsMap = new HashMap<String, Integer>();
        Set keySet = new HashSet<String>(Arrays.asList(stringArray));
        println("print out keySet");
        for (String keySetString : keySet) {
            println(keySetString);
        }
        for (String stringElement : stringArray) {
            println("stringElement: " + stringElement);

            if (keySet.contains(stringElement)) {
                int count = (countsMap.get(stringElement) != null) ? countsMap.get(stringElement) : 0;
                count++;
                countsMap.put(stringElement, count);

                if (count > 1) {
                    println("duplicate found: " + stringElement);
                    break;
                }
            }
        }
    }
    println "Hello world!"
}