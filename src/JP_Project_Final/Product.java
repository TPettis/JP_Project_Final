/**
 * An abstract class that implements the Item interface. Product implements the basic functionality
 * that all items on a production line should have.
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */
package JP_Project_Final;

import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

  //Product fields
  protected int serialNumber;
  protected String manufacturer;
  protected Date manufacuredOn;
  protected String name;
  private static int currentProductionNumber = 1;

  //Default constructor
  public Product() {
    this.name = "Default Name";
    this.manufacturer = "OracleProduction";
    this.serialNumber = currentProductionNumber++;
    this.manufacuredOn = new Date();
  }

  //Constructor that passes a name
  public Product(String n) {
    this.manufacturer = "OracleProduction";
    this.name = n;
    this.serialNumber = currentProductionNumber++;
    this.manufacuredOn = new Date();
  }

  //Getters and setters
  public void setProductionNumber(int proNum) {
    proNum = currentProductionNumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public Date getManufactureDate() {
    return this.manufacuredOn;
  }

  public int getSerialNumber() {
    return this.serialNumber;
  }

  //Allows classes to be sorted by name with Collections.sort
  //@Override
  public int compareTo(Product prod) {
    this.name.compareTo(prod.getName());
    int answer;
    answer = this.name.compareTo(prod.getName());
    return answer;
  }

  //To String method that returns product information
  public String toString() {
    return "Manufacturer  : " + this.manufacturer + "\nSerial Number : " + this.serialNumber
        + "\nDate          : " + this.manufacuredOn + "\nName          : " + this.name + "\n";
  }
}