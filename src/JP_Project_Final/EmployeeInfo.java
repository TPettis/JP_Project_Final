/**
 * A class that will allow the user to input their full name and then creates a user id.
 *
 * @author Tim Pettis
 * @version 3.0
 * @since 11/27/2018
 */
package JP_Project_Final;

import java.util.Scanner;
import java.util.regex.*;

public class EmployeeInfo {

  //The class fields
  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p = Pattern.compile("^[A-Z][a-z]{3}[0-9]{2}$");
  private Scanner in;

  //Default constructor
  public EmployeeInfo() {
    in = new Scanner(System.in);
    setName();
    setDeptId();
    in.close();
  }

  //The class has the following methods defined:
  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) { //valid, includes space
      code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    } else {
      code = "Guest";
    }
  }

  private String inputName() {
    System.out.print("Please enter your first and last name: ");
    String nameString = in.nextLine();
    return nameString;
  }

  private boolean checkName(StringBuilder name) {
    if (name.indexOf(" ") > 0) {
      return true;
    } else {
      return false;
    }
  }

  public String getDeptId() {
    System.out.print("Please enter the department ID: ");
    String id = in.nextLine();
    return id;
  }

  private void setDeptId() {
    String id = getDeptId();
    if (validId(id)) {
      this.deptId = reverseString(id);
    } else {
      this.deptId = "None01";
    }
  }

  private String getId() {
    return this.deptId;
  }

  private boolean validId(String id) {
    Matcher matcher = p.matcher(id);
    return matcher.matches();
  }

  //Method that will reverse the order of the text stored for the department id
  public String reverseString(String id) {
    byte[] strAsByteArray = id.getBytes();
    byte[] result = new byte[strAsByteArray.length];

    for (int i = 0; i < strAsByteArray.length; i++) {
      result[i] = strAsByteArray[strAsByteArray.length - i - 1];
    }

    return new String(result);
  }

  //To String method that returns employee information
  public String toString() {
    return "Employee Code : " + this.code + "\nDepartment Number : " + this.deptId;
  }
}
