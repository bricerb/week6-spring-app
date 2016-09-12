package tiy.webapp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Brice on 9/12/16.
 */
public class WebChatClientTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void sendMessage() throws Exception {
        String message = "Test-String";
        WebChatClient myClient = new WebChatClient();

        String serverResponse = myClient.SendMessage(message);

        System.out.println(serverResponse);

        assertEquals("Echo:" + message, serverResponse);

    }

}