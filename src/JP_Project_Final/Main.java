/**
 * Main class of JP Project Beta Contains tests for classes and print methods
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */

package JP_Project_Final;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    //AUDIO PLAYER TEST
    //AudioPlayerDriver.testAudioPlayer();

    //SCREEN TEST
    //ScreenDriver.testScreen();

    //MOVIE PLAYER TEST
    //MoviePlayerDriver.testMoviePlayer();

    //BOTH PLAYER TEST
    //PlayerDriver.testPlayer();

    //ArrayList of products
    ArrayList<Product> products = new ArrayList<>();

    //Assign testCollection results to products
    products = testCollection();

    //Sort the ArrayList
    Collections.sort(products);

    //Print method for ArrayList
    print(products);
  }

  public static ArrayList testCollection() {

    AudioPlayer a1 = new AudioPlayer("MP3 Player", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
    MoviePlayer m1 = new MoviePlayer("MVPL1", new Screen("1366x768",
        60, 12), MonitorType.LED);
    MoviePlayer m2 = new MoviePlayer("MVPL2", new Screen("720x480",
        60, 10), MonitorType.LCD);

    //Create the collection
    ArrayList<Product> products = new ArrayList<>();

    //Add products to the collection
    products.add(a1);
    products.add(a2);
    products.add(m1);
    products.add(m2);
    return products;
  }

  //Print method for ArrayList
  public static <T extends Iterable<E>, E> void print(T list) {

    //Loop through elements
    for (E element : list) {
      System.out.println(element);
    }
    System.out.println();
  }
}