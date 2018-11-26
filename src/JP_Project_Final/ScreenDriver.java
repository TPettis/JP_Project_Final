/**
 * Driver class that tests screen
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */
package JP_Project_Final;

public class ScreenDriver {

  //Method to test screen
  public static void testScreen() {
    Screen s = new Screen("1024x768", 60, 5);
    System.out.println(s);
  }
}
