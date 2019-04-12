package com.Merging;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("1st word please:");
        String word = reader.nextLine();
        System.out.println("2nd word please");
        String word1 = reader.nextLine();

        StringMerge stringMerge = new StringMerge(word,word1);
        stringMerge.merge();
    }
}
