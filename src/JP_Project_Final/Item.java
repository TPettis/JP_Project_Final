/**
 * Item interface with methods to be implemented for every item in production.
 *
 * @author Tim Pettis
 * @version 2.0
 * @since 10/27/2018
 */
package JP_Project_Final;

import java.util.Date;

public interface Item {

  String manufacturer = "OracleProduction";

  void setProductionNumber(int pn);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();
}
