import org.junit.Test;
import se.addq.java4test.ITweet;
import se.addq.java4test.TwitterClient;

import static org.mockito.Mockito.*;

public class TwitterTest {

    @Test
    public void testSendingTweet() {
        TwitterClient twitterClient = new TwitterClient();

        ITweet iTweet = mock(ITweet.class);

        when(iTweet.getMessage()).thenReturn("Using mockito is great");

        twitterClient.sendTweet(iTweet);

        verify(iTweet, atLeastOnce()).getMessage();
    }
}
