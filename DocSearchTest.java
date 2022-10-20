import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DocSearchTest{
  @Test
  public void emptyTest() throws IOException, URISyntaxException{
    Handler handler = new Handler("technical");
    assertEquals("Don't know how to handle that path!", handler.handleRequest(new URI("")));
  }
}
