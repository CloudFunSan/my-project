import com.example.App;
import org.junit.Test;
import static org.junit.Assert.*;

#basic unit test

public class AppTest {

    @Test
    public void testApp() {
        App myApp = new App();

        String result = myApp.getStatus();

        assertEquals("OK", result);
    }

}
