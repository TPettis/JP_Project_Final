/**
 * Driver class that tests functionality of audio and movie player controls
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */
package JP_Project_Final;

public class PlayerDriver {

  //Method to test audio and movie player controls
  public static void testPlayer() {

    //Initialize audio player and movie player
    AudioPlayer AudioP = new AudioPlayer();
    MoviePlayer MovieP = new MoviePlayer();

    //Multimedia controls
    AudioP.next();
    AudioP.play();
    AudioP.previous();
    AudioP.stop();
    MovieP.next();
    MovieP.play();
    MovieP.previous();
    MovieP.stop();

  }

}
