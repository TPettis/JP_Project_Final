/**
 * Driver class to test movie player
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */
package JP_Project_Final;

public class MoviePlayerDriver {

  //Method to test movie player
  public static void testMoviePlayer() {
    MoviePlayer m1 = new MoviePlayer("MVPL1", new Screen("1366x768",
        60, 12), MonitorType.LED);
    MoviePlayer m2 = new MoviePlayer("MVPL2", new Screen("720x480",
        60, 10), MonitorType.LCD);
    System.out.println(m1);
    System.out.println(m2);
  }

}
