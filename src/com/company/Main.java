package com.company;

import javax.xml.bind.SchemaOutputResolver;

public class Main {

    public static void main(String[] args) {

        String[] words = {"bear", "beautiful", "believe", "cheesewizz", "kayle"};

        // startsWith
        for (String w : words)
            if (w.startsWith("be")) {
                System.out.println(w + " starts with be");
            }
        System.out.println("\n");

        //endsWith
        for (String w : words)
            if (w.endsWith("e")) {
                System.out.println(w + " ends with e");
            }


        String s = "jeremiahisawesome";
        // search for 'i' but ignore the first 5 chars
        System.out.println("There is an \"is\" at index  " + s.indexOf("is", 7));

        String a = "Bacon";
        String b = "        Cheese";
        System.out.println(a + b);
        System.out.println(a.replace("Ba", "Comic "));
        System.out.println(b.toUpperCase());
        //clear white space
        System.out.println(b.trim());

    }
}
