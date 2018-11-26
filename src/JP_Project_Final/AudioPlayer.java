/**
 * A class that captures the details of an audio player. AudioPlayer is a subclass of Product and
 * implements the MultimediaControl interface.
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */
package JP_Project_Final;

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;

  //Default constructor
  public AudioPlayer() {
    this.audioSpecification = audioSpecification;
    mediaType = ItemType.AUDIO;
  }

  //Overloaded constructor passing name and audio spec
  AudioPlayer(String name, String audioSpecification) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = ItemType.AUDIO;
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

  //To String method that returns audio player information
  public String toString() {
    return super.toString() + "Audio Spec    : " + this.audioSpecification + "\nItem Type     : "
        + this.mediaType + "\n";
  }
}
