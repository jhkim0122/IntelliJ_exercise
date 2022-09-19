package com.juhyun.inflearn.intellij;

public class Rename {

    public void renaming() {
        String name = "a";
        Integer num = calculate();

        for (int i=0; i<10; i++){
            System.out.println(name);
        }
        System.out.println("변수값: "+name);
    }

    private Integer calculate() {return 10;}
}
