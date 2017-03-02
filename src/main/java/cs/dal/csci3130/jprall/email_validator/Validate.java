package cs.dal.csci3130.jprall.email_validator;

public class Validate {
	
	public int Tests(String email) {
		int numErrors = 0;
		if (!atTest(email));
			numErrors++;
			
		if (!email.contains("."))
			numErrors++;
		return numErrors;
	}
	
	public boolean atTest(String email) {
		char[] emailArray = email.toCharArray();
		int numHits = 0;
		
		for (int i = 0; i < email.length(); i++) {
			
			if (emailArray[i] == '@')
				numHits++;
		}
		
		if (numHits == 0)
			return true;
		return false;
	}
}