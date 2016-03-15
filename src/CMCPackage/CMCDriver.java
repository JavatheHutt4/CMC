package CMCPackage;
/**
 * 
 */

/**
 * @author tdrichmond
 *
 */
public class CMCDriver {

	public AdminUI adminUI;
	public UserUI userUI;
	public static DatabaseController db;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(db.getUsers());
	}
}
