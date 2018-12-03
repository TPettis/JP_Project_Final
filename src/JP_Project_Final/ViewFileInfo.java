/**
 * A driver class that reads the information from the TestResults.txt file and displays the
 * contents to the console.
 *
 * @author Tim Pettis
 * @version 3.0
 * @since 11/27/2018
 */

package JP_Project_Final;

import java.io.*;
import java.nio.file.*;

public class ViewFileInfo {
  public ViewFileInfo(){
    ReadFile();
  }

  private static void ReadFile(){
    Path p = Paths.get("C:/LineTests");
    Path p2 = Paths.get("TestResults.txt");
    Path p3 = p.resolve(p2);

    String filepath = p3.toString();

    try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
      StringBuilder fileContents = new StringBuilder();
      String line = br.readLine();
      while (line != null){
        fileContents.append(line);
        fileContents.append(System.lineSeparator());
        line = br.readLine();
      }//end while loop
      String fileComplete = fileContents.toString();
      System.out.println(fileComplete);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
