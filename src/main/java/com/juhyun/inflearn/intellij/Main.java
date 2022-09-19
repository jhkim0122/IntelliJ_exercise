package com.juhyun.inflearn.intellij;

public class Main {
    static String s;
    public static void main(String[] args) {
        s = "Hello. Nice to meet you. IntelliJ IDEA Community Edition";
        System.out.println(s);
        name(s);
    }

    public static void name(String str) {
        System.out.println("name");
    }
}