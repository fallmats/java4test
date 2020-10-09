package se.addq.java4test;

public class TwitterClient {
    public void sendTweet(ITweet tweet) {
        String message = tweet.getMessage();

        System.out.println("send the message to Twitter: "+ message);
    }
}
