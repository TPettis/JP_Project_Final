/**
 * Driver class that tests audio player
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */
package JP_Project_Final;

public class AudioPlayerDriver {

  //Method to test audio player
  public static void testAudioPlayer() {
    AudioPlayer a1 = new AudioPlayer("MP3 Player", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
    a1.play();
    a1.stop();
    a1.next();
    a1.previous();
    System.out.println(a1);
    System.out.println(a2);
  }
}

