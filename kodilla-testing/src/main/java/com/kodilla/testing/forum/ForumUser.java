package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {

    private String name;
    private String realName;
    private List<ForumPost> posts= new ArrayList<>();//pole będące kolekcją, kolekcją Postów + odrazu tworzymy obiekt
    private List<ForumComment> comments= new LinkedList<>();//pole będące kolekcją, kolekcją komentarzy + odrazu tworzymy obiekt

    public ForumUser(String name, String realName) { //konstruktor wygenerowany automatycznie dla pól name i realname
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody){ //metoda dodająca post do kolekcji
        //do nothing
    }

    public void addComment(ForumPost thePost, String author, String commentBody){//metoda dodająca komentarz która zawiera wswoim argumencie referencje na post którego dotyczy
        //do nothing
    }

    public int getPostQuantity(){//metoda zwracająca ilość postów
        return 100;
    }

    public int getCommentsQuantity(){//metoda zwracajaca ilosc postów
        return 100;
    }

    public ForumPost getPost(int postNumber){//metoda pozwalająca na pobranie z kolekcji obiektów posta
        return null;
    }

    public ForumComment getComment(int commentNumber){//metoda pozwalająca na pobranie z kolekcji obiektów komentarza
        return null;
    }

    public boolean removePost(ForumPost thePost){//metoda słuzy do usuwania postów
        return true;
    }

    public boolean removeComment (ForumComment theComment){//metoda słuzy do usuwania komentarzy
        return true;
    }

    public String getName(){
        return name;
    }
    public String getRealName(){
        return realName;
    }
}
