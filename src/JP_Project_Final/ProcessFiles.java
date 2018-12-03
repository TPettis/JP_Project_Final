/**
 * A directory and file structure by that combines the path and file name.
 *
 * @author Tim Pettis
 * @version 3.0
 * @since 11/27/2018
 */

package JP_Project_Final;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ProcessFiles extends Exception {

  //The class will have three fields
  private Path p = Paths.get("C:/LineTests");
  private Path p2 = Paths.get("TestResults.txt");
  private Path p3 = p.resolve(p2);

  public ProcessFiles(Object obj) {
    try {
      WriteFile(obj);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  private void CreateDirectory() {
    try {
      if (Files.notExists(p)) {
        Files.createDirectories(p);
      }
      if (Files.notExists(p3)) {
        Files.createFile(p3);
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public void WriteFile(EmployeeInfo objName) throws IOException {
    WriteFile(objName);
  }

  public void WriteFile(ArrayList<Product> products) throws IOException {
    WriteFile(products);
  }

  public void WriteFile(Object objName) throws IOException {
    CreateDirectory();
    String filepath = p3.toString();
    PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filepath, true)));
    writer.println(objName);
    writer.close();
  }
}
