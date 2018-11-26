/**
 * An enum that stores the 4 pre-set types.
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */
package JP_Project_Final;

public enum ItemType {
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");

  final String code;

  private ItemType(String code) {
    this.code = code;
  }

  public String getCode() {
    return this.code;
  }
}
