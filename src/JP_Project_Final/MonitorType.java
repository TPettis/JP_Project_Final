/**
 * Enum that stores monitor types
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */
package JP_Project_Final;

public enum MonitorType {
  LCD("LCD"),
  LED("LED");

  private final String type;

  private MonitorType(String code) {
    this.type = code;
  }

  public String getCode() {
    return this.type;
  }
}
