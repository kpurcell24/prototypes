import junit.framework.TestCase;
public class HelloWorldTest extends TestCase
{
  protected void setUp() throws Exception
  {
    super.setUp();
  }
  protected void tearDown() throws Exception
  {
    super.tearDown();
  }
  public void testmain()
  {
    String expected = "Nothing";
    assertEquals("Do nothing test", expected, "Nothing");
  }
}