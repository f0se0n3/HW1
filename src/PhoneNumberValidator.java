public class PhoneNumberValidator {
		public boolean isValid(String input) {
		return checkLength(input) && checkCharacters(input);
	}

	public static void validate() {
		NumAddition add = new NumAddition();
		add.addition();
	}

	private boolean checkCharacters(String input) {
		System.out.println("checking chars");
		for (Character c : input.toCharArray()) {
			if (!Character.isDigit(c)) {
				System.out.println("Character: " + c.toString() + " is not a number");
				return false;
			}
		}
		
		System.out.println("All characters checked");
		validate();
		return true;
	}

	private boolean checkLength(String input) {
		System.out.println("checking length");
		if (input.length() < 10) {
			System.out.println("Your phone number contains less then 10 digits. Check it and try again.");
			return false;
		} else if (input.length() > 10) {
			System.out.println("your phone number contains more then 10 digits. Check it and try again.");
			return false;
		}
		validate();
		return true;
	}
}
