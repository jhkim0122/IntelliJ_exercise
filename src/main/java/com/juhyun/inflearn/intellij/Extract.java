package com.juhyun.inflearn.intellij;

import java.util.List;

public class Extract {

    public void extractMethod(List<Book> books){
        for (Book book : books) {
            loopAuthors(book);
        }
    }

    private static void loopAuthors(Book book) {
        for(String s : book.getAuthors()){
            printAuthor(s);
        }
    }

    private static void printAuthor(String s) {
        if("jojoldu".equals(s)) {
            System.out.println("담당자가 맞습니다.");
        }
    }

    public static class Book {
        private String title;
        private long price;
        private List<String> authors;

        public List<String> getAuthors() {return authors;}
    }


}
