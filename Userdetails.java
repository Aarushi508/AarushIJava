package banksystem;

/**
 * @author AarushiAggarwalC0822508, DivyaVickyMattaC0818006, HarpreetKaurC0817440,HarshdeepKaurC0821282,LovikaC0812568
 * Bank System Application
 */

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class Userdetails extends Users {
	/**
	 * @param args 
	 * Take Input from User 
	 */
	public static final String TITLE = "ADHHL Bank";
	static ArrayList<Users> users = new ArrayList<>();
	static String USER_TEXT_FILE = "Users.txt";

	public static void main(String[] args) throws IOException {
		menu();
	}

	public static int accNo = 10000000 + new Random().nextInt(90000000);

	/**
	 * Display the menu and loops until user selects exit
	 */
	public static void menu() throws IOException {
		String input;
		label: while (true) {
			// Compose the prompt menu and get the input
			input = JOptionPane.showInputDialog("Welcome To ADHHL Bank! \n\n" + "[1] User Registration \n"
					+ "[2] User Login \n" + "[3] Exit \n\n" + "Enter no. of selection below");

			// Validate user input
			// Add the user from the registration method to the users array
			// login and edit the user
			// Show message ten exit
			// Show error dialog box if input is invalid
			// Show message to give response again if value is not an integer
			if (!isInteger(input)) {
				JOptionPane.showMessageDialog(null, "Please select a valid input.");
			} else if (Integer.parseInt(input) != 1 && Integer.parseInt(input) != 2 && Integer.parseInt(input) != 3) {
				JOptionPane.showMessageDialog(null, "Response should be from given options.");
			}
			switch (input) {
			case "1" -> users.add(registration());
			case "2" -> loginExistingUser();
			case "3" -> {
				showDialogBox("Thank you for using the application.", "Exiting");
				break label;
			}
			}
		}
	}

	/**
	 * Returns a User after filling up the information
	 */
	public static Users registration() {
		// Initialize a User object
		String firstName = "", lastName = "", birthDate = "", gender = "", email = "", mobileNumber = "", address = "",
				Addresscity = "", state = "", code = "";
		Users user = new Users();

		// Get First Name
		while (firstName.isEmpty()) {
			firstName = JOptionPane.showInputDialog("Enter First Name: ");
			if (!validateInput("first_name", firstName)) {
				JOptionPane.showMessageDialog(null, "First name cannot be empty.");
				firstName = "";
			}
		}
		user.setFirstName(firstName);
		// Get Last Name

		while (lastName.isEmpty()) {
			lastName = JOptionPane.showInputDialog("Enter Last Name: ");
			if (!validateInput("last_name", lastName)) {
				JOptionPane.showMessageDialog(null,
						"Last name cannot be empty. If you do not have a last name enter NA.");
				lastName = "";
			}
		}
		user.setLastName(lastName);
		// Get Birth Date
		while (birthDate.isEmpty()) {
			birthDate = JOptionPane.showInputDialog("Enter Birth Date (YYYY-MM-DD): ");
			if (!validateInput("DOB", birthDate)) {
				JOptionPane.showMessageDialog(null, "DOB is not in corect format.");
				birthDate = "";
			}
		}
		user.setBirthDate(birthDate);
		// Get Gender
		while (gender.isEmpty()) {
			gender = JOptionPane.showInputDialog("Enter Gender (Male or Female): ");
			if (!validateInput("gender", gender)) {
				JOptionPane.showMessageDialog(null, "Gender can be Male/Female.");
				gender = "";
			}
		}
		user.setGender(gender);
		// Get Email
		while (email.isEmpty()) {
			email = JOptionPane.showInputDialog("Enter Email: ");

			if (!validateInput("email", email)) {
				JOptionPane.showMessageDialog(null, "Email is not in correct format.");
				email = "";
			}
		}
		user.setEmail(email);
		// Get Contact Mobile Number
		while (mobileNumber.isEmpty()) {
			mobileNumber = JOptionPane.showInputDialog("Enter Contact Mobile Number: ");
			if (!validateInput("mobile_number", mobileNumber)) {
				JOptionPane.showMessageDialog(null, "Contact Number is invalid");
				mobileNumber = "";
			}
		}
		user.setMobileNumber(mobileNumber);
		// Get Address
		while (address.isEmpty()) {
			address = JOptionPane.showInputDialog("Enter Address");
			if (!validateInput("address", address)) {
				JOptionPane.showMessageDialog(null, "Address cannot be empty.");
				address = "";
			}
		}
		user.setAddress(address);
		// Get Address City
		while (Addresscity.isEmpty()) {
			Addresscity = JOptionPane.showInputDialog("Enter City");
			if (!validateInput("Addresscity", Addresscity)) {
				JOptionPane.showMessageDialog(null, "City cannot be empty.");
				Addresscity = "";
			}
		}
		user.setAddresscity(Addresscity);
		// Get Address State
		while (state.isEmpty()) {
			state = JOptionPane.showInputDialog("Enter State");
			if (!validateInput("state", state)) {
				JOptionPane.showMessageDialog(null, "State cannot be empty.");
				state = "";
			}
		}
		user.setcode(state);
		// Get Postal Code
		while (code.isEmpty()) {
			code = JOptionPane.showInputDialog("Enter Postal Code");
			if (!validateInput("code", code)) {
				JOptionPane.showMessageDialog(null, "Postal Code cannot be empty.");
				code = "";
			}
		}
		user.setcode(code);

		// Get the Identification Details
		String input = "", Id = "";
		label: while (true) {
			// Compose the selection menu and get the input
			input = JOptionPane.showInputDialog("Choose an ID below: \n\n" + "[1] Driver's License \n"
					+ "[2] Voter's ID \n" + "[3] Passport \n\n" + "Enter no. of selection:");

			// Validate selection, if equal to 1, 2 or 3 then assign corresponding id then
			// break the loop
			// otherwise show error message then loop again
			switch (input) {
			case "1" -> {
				while (Id.isEmpty()) {
					Id = JOptionPane.showInputDialog("Enter Identification Number");
					if (!validateInput("Id", Id)) {
						JOptionPane.showMessageDialog(null, "Identification Number cannot be empty.");
						Id = "";
					}
				}
				user.setId(Id);
				user.setIdentificationDetails("Driver's License");
				break label;
			}
			case "2" -> {
				while (Id.isEmpty()) {
					Id = JOptionPane.showInputDialog("Enter Identification Number");
					if (!validateInput("Id", Id)) {
						JOptionPane.showMessageDialog(null, "Identification Number cannot be empty.");
						Id = "";
					}
				}
				user.setId(Id);
				user.setIdentificationDetails("Voter's ID");
				break label;
			}
			case "3" -> {
				while (Id.isEmpty()) {
					Id = JOptionPane.showInputDialog("Enter Identification Number");
					if (!validateInput("Id", Id)) {
						JOptionPane.showMessageDialog(null, "Identification Number cannot be empty.");
						Id = "";
					}
				}
				user.setId(Id);
				user.setIdentificationDetails("Passport");
				break label;
			}
			default -> showErrorDialogBox("Invalid ID selection. Try Again", "Input Error");
			}
		}

		// Get the Account type
		while (true) {
			// Compose the selection menu and get the input
			input = JOptionPane.showInputDialog("Choose an account type below: \n\n" + "[1] Savings Account \n"
					+ "[2] Checking Account \n\n" + "Enter no. of selection:");

			// Validate input, if equal to 1 or 2then assign corresponding id then break the
			// loop
			// otherwise show error and loop again
			if (input.equals("1")) {
				user.setAccountType("Savings Account");
				break;
			} else if (input.equals("2")) {
				user.setAccountType("Checking Account");
				break;
			} else {
				showErrorDialogBox("Invalid account selection. Try Again", "Input Error");
			}
		}
		// Setting Account Balance
		while (true) {
			String amount = JOptionPane.showInputDialog("Enter amount to deposit: ");
			try {
				float v = Float.parseFloat(amount);
				user.setAccBalance(user.getAccBalance() + v);
			} catch (Exception e) {
				showErrorDialogBox(e.getMessage(), "Input Error");
			}
			break;
		}

		// Get the User Name
		while (true) {
			String userName = JOptionPane.showInputDialog("Enter Username: ");

			// Validate if user is already existing, if true show error message
			// otherwise assign the username to the user then break the loop
			if (searchUser(userName) != null) {
				showErrorDialogBox("Username is already existing. Try again.", "Username already exists");
			} else {
				user.setUsername(userName);
				break;
			}
		}
		// Get the password
		String password = JOptionPane.showInputDialog("Enter Password: ");
		user.setPassword(password);
		saveToTextFile(user, USER_TEXT_FILE);
		// Show message
		showDialogBox("Register Successful!.", "Success");
		// Return the user after setting all information
		return user;
	}

	// }
	/**
	 * Displays the user current information and prompts to select information for
	 * modification
	 **/

	public static void loginExistingUser() {
		// Get the user by logging in username and password
		Users user = loginUser();
		if (user == null)
			return;

		Label: while (true) {
			String input = JOptionPane.showInputDialog("Choose any one option: \n\n" + "[1] Edit personal details \n"
					+ "[2] Show personal details \n" + "[3] Display balance \n" + "[4] Deposit money \n"
					+ "[5] Withdraw money \n" + "[6] Utility Bills \n" + "[7]Account number \n"
					+ "[8] Amount Transfer \n" + "[9] Exit \n\n" + "Enter no. of selection:");
			if (input == null)
				return;
			switch (input) {
			case "1":
				editUser(user);
				break;
			case "2":
				showDialogBox(user.toString(), "Personal Details");
				break;
			case "3":
				String msg = "Current Account Balance: " + user.getAccBalance();
				showDialogBox(msg, "Account Balance");
				break;
			case "4":
				String amount = JOptionPane.showInputDialog("Enter amount to deposit: ");
				try {
					float v = Float.parseFloat(amount);
					user.setAccBalance(user.getAccBalance() + v);
				} catch (Exception e) {
					showErrorDialogBox(e.getMessage(), "Input Error");
				}
				break;
			case "5":
				String bal = JOptionPane.showInputDialog("Enter amount to withdraw: ");
				try {
					float v = Float.parseFloat(bal);
					user.setAccBalance(user.getAccBalance() - v);
				} catch (Exception e) {
					showErrorDialogBox(e.getMessage(), "Input Error");
				}
				break;
			case "6": {
				String option = JOptionPane.showInputDialog("Choose any one option: \n\n" + "[1] Electricity Bill \n"
						+ "[2] Water Bill \n" + "[3] Gas Bill \n" + "[4] Exit \n\n" + "Enter no. of selection:");
				if (option == null)
					return;
				switch (option) {
				case "1":
					String ElectricityBill = JOptionPane.showInputDialog("Enter amount to pay electricity bill: ");
					try {
						float v = Float.parseFloat(ElectricityBill);
						user.setAccBalance(user.getAccBalance() - v);
						String msgs = "Transaction Successful. Current Account Balance: " + user.getAccBalance();
						showDialogBox(msgs, "Account Balance");
					} catch (Exception e) {
						showErrorDialogBox(e.getMessage(), "Input Error");
					}
					break;
				case "2":
					String WaterBill = JOptionPane.showInputDialog("Enter amount to pay water bill: ");
					try {
						float v = Float.parseFloat(WaterBill);
						user.setAccBalance(user.getAccBalance() - v);
						String msgs = "Transaction Successful. Current Account Balance: " + user.getAccBalance();
						showDialogBox(msgs, "Account Balance");
					} catch (Exception e) {
						showErrorDialogBox(e.getMessage(), "Input Error");
					}
					break;
				case "3":
					String GasBill = JOptionPane.showInputDialog("Enter amount to pay gas bill: ");
					try {
						float v = Float.parseFloat(GasBill);
						user.setAccBalance(user.getAccBalance() - v);
						String msgs = "Transaction Successful. Current Account Balance: " + user.getAccBalance();
						showDialogBox(msgs, "Account Balance");
					} catch (Exception e) {
						showErrorDialogBox(e.getMessage(), "Input Error");
					}
					break;
				}
			}
			case "7":
				String msgs = "Your account number is: " + accNo;
				showDialogBox(msgs, "Account Number");
				break;
			case "8":
				String accountNumber = JOptionPane.showInputDialog("Enter account number you to make transfer to");
				String Payee = JOptionPane
						.showInputDialog("Enter the name of person you would like to transfer the amount");
				String amountToTransfer = JOptionPane.showInputDialog("Enter the amount");
				String Remarks = JOptionPane.showInputDialog("Provide reason for transfer");
				try {
					float v = Float.parseFloat(amountToTransfer);
					user.setAccBalance(user.getAccBalance() - v);
					String show = "Amount transferred Successfully. Current Account Balance: " + user.getAccBalance();
					showDialogBox(show, "Account Balance");
				} catch (Exception e) {
					showErrorDialogBox(e.getMessage(), "Input Error");
				}
				break;
			case "9":
				break Label;
			default:
				break;
			}
		}
	}

	private static void editUser(Users user) {
		String birthDate = "", email = "", mobileNumber = "", address = "", Addresscity = "", state = "", code = "",
				password = "";
		// If user is existing proceed
		if (user != null) {
			while (true) {
				// Compose display message
				String input = JOptionPane.showInputDialog("Choose information to edit below: \n\n"
						+ "[1] Birth Date \n" + "[2] Email \n" + "[3] Contact Mobile Number \n" + "[4] Address \n"
						+ "[5] City \n" + "[6] State \n" + "[7] Postal Code \n" + "[8] Password \n" + "[9] Exit \n\n"
						+ "Enter no. of selection:");

				// Validate input based on selection
				if (input.equals("1")) {
					// Get Birth Date
					birthDate = JOptionPane.showInputDialog("Enter new Birth Date (MM/DD/YYYY): ");
					user.setBirthDate(birthDate);

					// Show message
					showDialogBox("Update Successful!.", "Success");
				} else if (input.equals("2")) {
					// Get Email Date
					email = JOptionPane.showInputDialog("Enter new Email: ");
					user.setEmail(email);

					// Show message
					showDialogBox("Update Successful!.", "Success");
				} else if (input.equals("3")) {
					// Get Contact Mobile Number
					mobileNumber = JOptionPane.showInputDialog("Enter new Contact Mobile Number: ");
					user.setMobileNumber(mobileNumber);
					// Show message
					showDialogBox("Update Successful!.", "Success");

				} else if (input.equals("4")) {
					// Get Address
					address = JOptionPane.showInputDialog("Enter new Address");
					user.setAddress(address);

					// Show message
					showDialogBox("Update Successful!.", "Success");
				} else if (input.equals("5")) {
					// Get Addresscity
					Addresscity = JOptionPane.showInputDialog("Enter new AddressCity");
					user.setAddresscity(Addresscity);
					// Show message
					showDialogBox("Update Successful!.", "Success");

				} else if (input.equals("6")) {
					// Get state
					state = JOptionPane.showInputDialog("Enter new State");
					user.setstate(state);
					// Show message
					showDialogBox("Update Successful!.", "Success");
				} else if (input.equals("7")) {
					// Get PostalCode
					code = JOptionPane.showInputDialog("Enter new Postal Code");
					user.setcode(code);
					// Show message
					showDialogBox("Update Successful!.", "Success");
				} else if (input.equals("8")) {
					// Get the password
					password = JOptionPane.showInputDialog("Enter new Password: ");
					user.setPassword(password);

					// Show message
					showDialogBox("Update Successful!.", "Success");

				} else if (input.equals("9")) {
					// Show message then end the method
					showDialogBox("Exiting Edit User Information.", "Thank You");
					return;
				} else {
					// Show error message
					showErrorDialogBox("Invalid selection. Try again.", "Input error");
				}
			}
		}
	}

	public static Users loginUser() {
		// Get username and password input
		String userName = JOptionPane.showInputDialog("Enter username to login: ");
		String password = JOptionPane.showInputDialog("Enter password to login: ");

		// Loop each User in the users arraylist
		for (Users user : users) {
			// Validate if username is same as the username input then validate if password
			// is also same
			// if true, show success message and return the user object
			if (user.getUsername().equalsIgnoreCase(userName)) {
				if (user.getPassword().equalsIgnoreCase(password)) {
					showDialogBox("Successful Login!", "Login");
					return user;
				}
			}
		}
		// If the loop ends, show error message then return null
		showErrorDialogBox("Username and/or password does not exist. Try again", "Input Error");
		return null;
	}

	/**
	 * Searches for the user given the username argument then returns it returns
	 * null if the username has no match
	 **/
	public static Users searchUser(String username) {
		// Loop each User in the users arraylist
		for (Users user : users) {
			// Validate if username is same as the username argument
			// if true return the user
			if (user.getUsername().equalsIgnoreCase(username)) {
				return user;
			}
		}
		// If the loop ends, then return null
		return null;
	}

	/**
	 * Displays a JOption message dialog with the message and title.
	 */
	private static void showDialogBox(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Displays a JOption error message dialog with the message and title
	 */
	private static void showErrorDialogBox(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
	}

	static void saveToTextFile(Users user, String nameOfFile) {
		File file = new File(nameOfFile);

		/*
		 * ObjectOutputStream out = new ObjectOutputStream(new
		 * FileOutputStream(file,true)); out.writeUnshared(user);
		 * MyMain.updateUserList(); out.close();
		 */

		FileWriter fw;
		try {
			fw = new FileWriter(nameOfFile, true);
			Random rand = new Random();
			int accountNo = rand.nextInt(100000000);
			PrintWriter pw = new PrintWriter(fw);
			pw.print(user.getFirstName() + ";");
			pw.print(user.getLastName() + ";");
			pw.print(user.getAddress() + ";");
			pw.print(user.getAddresscity() + ";");
			pw.print(user.getstate() + ";");
			pw.print(user.getcode() + ";");
			pw.print(user.getBirthDate() + ";");
			pw.print(user.getGender() + ";");
			pw.print(user.getMobileNumber() + ";");
			pw.print(user.getId() + ";");
			pw.print(user.getUsername() + ";");
			pw.print(user.getPassword() + ";");
			pw.print(String.valueOf(accountNo) + ";");
			pw.print(user.getAccountType() + ";");
			pw.println(String.valueOf(user.getAccBalance()));
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * public boolean isValueAnInteger(String str) { // IsInteger try { return true;
	 * // String is an Integer } catch (NumberFormatException e) { return false; //
	 * String is not an Integer } }
	 */

	// Function: to validate if value passed to the function is in format or not
	public static boolean validateInput(String fieldName, String response) {// Minimize these
		switch (fieldName) {
		case "first_name":
		case "last_name":
		case "address_state":
		case "address_city":
		case "code":

			if (response == null || response.isEmpty()) {
				return false;
			}
			break;
		case "gender":
			// Must only be Male or Female
			if (!response.equalsIgnoreCase("Male") && !response.equalsIgnoreCase("Female")) {
				return false;
			}
			break;
		case "mobile_number":
			// 0-9 numbers allowed
			if (!response.matches("^[0-9]+")) {
				return false;
			}
			break;
		case "account_number":
		case "address":
		case "Id":
			// empty and "#" not allowed
			if (response == null || response.isEmpty() || response.contains("#")) {
				return false;
			}
			break;
		case "email":
			// A-Z and a-z characters allowed
			// 0-9 numbers allowed
			// Additionally email may contain only dot(.), dash(-) and underscore(_)
			// Rest all special characters are not allowed
			if (!response.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$")) {
				return true;
			}
		case "DOB":
			if (!response.matches("\\d{4}-[01]\\d-[0-3]\\d")) {
				return false;
			}
			break;
		}
		return true;
	}

	public static boolean isInteger(String str) { // IsInteger
		try {
			int convertedValue = Integer.parseInt(str);
			return true; // String is an Integer
		} catch (NumberFormatException e) {
			return false; // String is not an Integer
		}
	}
}
