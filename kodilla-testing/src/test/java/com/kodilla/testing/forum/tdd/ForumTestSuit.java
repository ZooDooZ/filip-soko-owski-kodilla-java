package com.kodilla.testing.forum.tdd;


import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum TestSuite \uD83D\uDE31")
public class ForumTestSuit {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of test");
    }

    @AfterAll
    public static void afterAllTests(){
        System.out.println("All test are finished");
    }

    @BeforeEach
    public void beforeEveryTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test//TEST1
    void testAddPost(){
        //Given
        ForumUser forumUser = new ForumUser("FSokolowski", "Filip Sokołowski");
        //When
        forumUser.addPost("FSokolowski", "Hello Guys! What a beautiful day!");
        //Then
        Assertions.assertEquals(1,forumUser.getPostQuantity());
    }

    @Test//TEST2
    void testAddComment(){
        //Given (ForumPost thePost, String author, String commentBody)
        ForumUser forumUser = new ForumUser("FSokolowski" ,"Filip Sokołowski");
        ForumPost thePost = new ForumPost("Hello Guys! What a beautiful day!", "FSokolowski");
        //When
        forumUser.addComment(thePost,"FSokolowski", "Thank you for your post!");
        //Then
        Assertions.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test//TEST3
    void testGetPost(){
        //Give
        ForumUser forumUser = new ForumUser("FSokolowski", "Filip Sokołowski");
        ForumPost thePost = new ForumPost("Hello Guys! What a beautiful day!", "FSokolowski");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        ForumPost retrieviedPost;
        retrieviedPost = forumUser.getPost(0);
        //Then
        Assertions.assertEquals(thePost, retrieviedPost);
    }

    @Test//TEST4
    void testGetComment(){
        //Given
        ForumUser forumUser = new ForumUser("FSokolowski", "Filip Sokołowski");
        ForumPost thePost = new ForumPost("Hello Guys! What a beautiful day!", "FSokolowski");
        ForumComment theComment = new ForumComment(thePost,"Thank you for your post!","FSokolowski");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        ForumComment retrieviedComment = forumUser.getComment(0);
        //Then
        Assertions.assertEquals(theComment,retrieviedComment);
    }

    @Test//TEST5
    void testRemovePostNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("FSokolowski", "Filip Sokołowski");
        ForumPost thePost = new ForumPost("Hello Guys! What a beautiful day!", "FSokolowski");
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assertions.assertFalse(result);
    }

    @Test//TEST6
    void testRemoveCommentNotExisting(){
        //Given
        ForumUser forumUser = new ForumUser("FSokolowski", "Filip Sokołowski");
        ForumPost thePost = new ForumPost("Hello Guys! What a beautiful day!", "FSokolowski");
        ForumComment theComment = new ForumComment(thePost, "Thank you for your post!", "FSokolowski");
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assertions.assertFalse(result);
    }

    @Test//TEST7
    void testRemovePost(){
        //Given
        ForumUser forumUser = new ForumUser("FSokolowski","Filip Sokołowski");
        ForumPost thePost = new ForumPost("Hello Guys! What a beautiful day!", "FSokolowski");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());
        //When
        boolean result = forumUser.removePost(thePost);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getPostQuantity());
    }

    @Test//TEST8
    void testRemoveComment(){
        //Given
        ForumUser forumUser = new ForumUser("FSokolowski", "Filip Sokołowski");
        ForumPost thePost = new ForumPost("Hello Guys! What a beautiful day!", "FSokolowski");
        ForumComment theComment = new ForumComment(thePost, "Thank you for your post!", "FSokolowski");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());
        //When
        boolean result = forumUser.removeComment(theComment);
        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getCommentsQuantity());
    }
}
