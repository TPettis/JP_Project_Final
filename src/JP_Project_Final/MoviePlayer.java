/**
 * A movie player class that extends Product and implements MultimediaControl.
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */
package JP_Project_Final;

public class MoviePlayer extends Product implements MultimediaControl {

  //Class variables
  private Screen screen;
  private MonitorType monitorType;

  //Default constructor
  MoviePlayer() {
    this.screen = new Screen();
    this.monitorType = MonitorType.LCD;
  }

  //Overloaded constructor that passes name, screen fields, and monitor type
  MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super.name = name;
    this.screen = screen;
    this.monitorType = monitorType;
  }

  //Multimedia control methods
  public void play() {
    System.out.println("Playing");
  }

  public void stop() {
    System.out.println("Stop");
  }

  public void previous() {
    System.out.println("Previous");
  }

  public void next() {
    System.out.println("Next");
  }

  //To String that returns movie player information
  public String toString() {
    return
        super.toString() + screen.toString() + "Monitor Type  : " + monitorType + "\n";
  }
}
