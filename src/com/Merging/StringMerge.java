package com.Merging;

import java.util.ArrayList;

public class StringMerge {

    private String word;
    private String word1;

    public StringMerge(String word, String word1){
        this.word=word;
        this.word1=word1;
    }

    public void merge() {
        ArrayList<String> mergedStrings = new ArrayList<>();
        String shorter = "";

        if (word.length() > word1.length()){
            shorter = word1;
        }

        else if (word.length() < word1.length()) {
            shorter = word;
        }

        for (int i=0; i<shorter.length(); i++){
            mergedStrings.add(word.substring(i,++i));
            mergedStrings.add(word1.substring(--i,++i));
        }

        for (String s : mergedStrings)
            System.out.print(s);
    }
}
