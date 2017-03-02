package cs.dal.csci3130.jprall.email_validator;

public class Validate {
	
	public static int Tests(String email) {
		int numErrors = 0;
		if (!atTest(email))
			numErrors++;
			
		if (!email.contains("."))
			numErrors++;
		return numErrors;
	}
	
	public static boolean atTest(String email) {
		char[] emailArray = email.toCharArray();
		int numHits = 0;
		
		for (int i = 0; i < email.length(); i++) {
			
			if (emailArray[i] == '@')
				numHits++;
		}
		System.out.print(numHits);
		if (numHits == 1)
			return true;
		return false;
	}
}