package com.cpp.quiz2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // book shallow copy
        List<String> chapters = new ArrayList<>(Arrays.asList("What is Mobile Apps", "Learning the basics", "Types of Mobile Apps"));

        BookShallowCopy book = new BookShallowCopy("Mobile Application", "Yu Sun", chapters);
        BookShallowCopy bookShallowCopy = book.clone();

        book.getChapters().set(0, "Mobile Apps the right way");
        book.getChapters().set(1, "Just do it");
        book.getChapters().add("How to start making mobile apps");
        book.getChapters().add("Imagine a mobile apps quiz");


        System.out.println("SHALLOW COPY EXAMPLE:");
        System.out.println("Original Book " + book);
        System.out.println("Shallow Copied Book " + bookShallowCopy);
        System.out.println("-----------");


        // book deep copy
        List<String> chapters1 = new ArrayList<>(Arrays.asList("What is Mobile Apps", "Learning the basics", "Types of Mobile Apps"));

        BookDeepCopy book1 = new BookDeepCopy("Mobile Application", "Yu Sun", chapters1);
        BookDeepCopy bookDeepCopy = book1.clone();

        book1.getChapters().set(0, "Mobile Apps the right way");
        book1.getChapters().set(1, "Just do it");
        book1.getChapters().add("How to start making mobile apps");
        book1.getChapters().add("Imagine a mobile apps quiz");

        
        System.out.println("DEEP COPY EXAMPLE:");
        System.out.println("Original Book " + book1);
        System.out.println("Deep Copied Book " + bookDeepCopy);
        System.out.println("-----------");

    }
}