package application;

import entities.Comments;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        Comments c1 = new Comments("Have a nice trip");

        Comments c2 = new Comments("Wow that's awesome!");

        Date postDate = sdf.parse("21/06/2018 13:05:44");

        String title = "Traveling to New Zealand!";
        String content = "I will visit this wonderful country!";
        int likes = 12;

        Post p1 = new Post(postDate, title, content, likes);

        p1.addComment(c1);
        p1.addComment(c2);

        postDate = sdf.parse("28/07/2018 23:14:19");
        title = "Good night guys";
        content = "See you tomorrow";
        likes = 5;

        Post p2 = new Post (postDate, title, content, likes);

        Comments c3 = new Comments("Good night");
        Comments c4 = new Comments("May the force be with you!");

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }

}

