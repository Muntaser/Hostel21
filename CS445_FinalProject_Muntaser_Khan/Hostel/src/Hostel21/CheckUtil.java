package Hostel21;




public class CheckUtil {

	/**
	 * check a string is consisted of numbers and characters
	 * 
	 * @param checkText
	 * @return
	 */
	public static boolean checkBasicText(String checkText) {
		checkText = checkText.trim();
		if (checkText.length() > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * check numbers
	 * 
	 * @param checkText
	 * @return
	 */
	public static boolean checkNum(String checkText) {
		checkText = checkText.trim();
		if (checkText.matches("\\d+")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 2012-05-01 date like this
	 * 
	 * @param checkText
	 * @return
	 */
	public static boolean checkDate(String checkText) {
		checkText = checkText.trim();
		if (checkText.length() == 0) {
			return false;
		}
		String dateRegex = "\\d{4}-{1}\\d{2}-{1}\\d{2}";
		if (checkText.matches(dateRegex)) {
			return true;
		} else {
			return false;
		}
	}
}