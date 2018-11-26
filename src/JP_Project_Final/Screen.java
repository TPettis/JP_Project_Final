/**
 * A class that implements ScreenSpec and adds constructors
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */
package JP_Project_Final;

public class Screen implements ScreenSpec {

  //Fields of screen
  private String resolution;
  private int refreshRate;
  private int responseTime;

  //Default constructor
  public Screen() {
    this.resolution = "Default Resolution";
    this.refreshRate = 0;
    this.responseTime = 0;
  }

  //Overloaded constructor that passes resolution, refresh rate, and response time
  public Screen(String resolution, int refreshRate, int responseTime) {
    this.resolution = resolution;
    this.refreshRate = refreshRate;
    this.responseTime = responseTime;
  }

  //Implemented screen spec methods
  public String getResolution() {
    return this.resolution;
  }

  public int getRefreshRate() {
    return this.refreshRate;
  }

  public int getResponseTime() {
    return this.responseTime;
  }

  //To String method that returns screen information
  public String toString() {
    return "Resolution    : " + this.resolution + "\nRefresh Rate  : " + this.refreshRate
        + "\nResponse Time : " + this.responseTime + "\n";
  }
}
