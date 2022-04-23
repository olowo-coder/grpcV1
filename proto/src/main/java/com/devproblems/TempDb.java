package com.devproblems;

import java.util.ArrayList;
import java.util.List;

public class TempDb {

    public static List<Author> getAuthorsFromTempDb(){
        return new ArrayList<>() {
            {
                add(Author.newBuilder().setAuthorId(1).setBookId(1).setFirstName("Charles")
                        .setLastName("Dickens").setGender("male").build());
                add(Author.newBuilder().setAuthorId(2).setFirstName("Williams")
                        .setLastName("Shakespeare").setGender("male").build());
                add(Author.newBuilder().setAuthorId(3).setFirstName("JK")
                        .setLastName("Rowling").setGender("female").build());
                add(Author.newBuilder().setAuthorId(4).setFirstName("Virginia")
                        .setLastName("Woolf").setGender("female").build());
            }
        };
    }


    public static List<Book> getBooksFromTempDb(){
        return new ArrayList<>(){
            {
                add(Book.newBuilder().setBookId(1).setAuthorId(1).setTitle("Oliver Twist")
                        .setPrice(123.3f).setPages(345).build());
                add(Book.newBuilder().setBookId(2).setAuthorId(1).setTitle("A Christmas Carol")
                        .setPrice(1345.3f).setPages(201).build());
                add(Book.newBuilder().setBookId(3).setAuthorId(2).setTitle("Hamlet")
                        .setPrice(453.6f).setPages(289).build());
                add(Book.newBuilder().setBookId(4).setAuthorId(3).setTitle("Harry Potter")
                        .setPrice(950.0f).setPages(367).build());
                add(Book.newBuilder().setBookId(5).setAuthorId(3).setTitle("The Casual Vacancy")
                        .setPrice(83.3f).setPages(156).build());
                add(Book.newBuilder().setBookId(6).setAuthorId(4).setTitle("Inception")
                        .setPrice(358.3f).setPages(981).build());
            }
        };
    }
}
