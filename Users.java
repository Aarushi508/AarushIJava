package banksystem;

/**
 * @author AarushiAggarwalC0822508, DivyaVickyMattaC0818006, HarpreetKaurC,HarshdeepKaurC0821282,LovikaC0812568
 * Bank System Application
 */

public class Users {

	/**
	 * @param args 
	 * Getter and Setters for User details
	 */
	
	// Data members
	// 1. Personal Information
	private String firstName;
	private String lastName;
	private String birthDate;
	private String gender;
	private String email;
	private String accountType;
	private String mobileNumber;
	private String addresscity;
	private String state;
	private String code;
	private double accBalance;
	private double accNo;
	private String Id;
	// Address
	private String address;

	// 2. Identification i.e Driver's License, Voter's ID or Passport
	private String identificationDetails;
	// 3. Online Account Information
	private String username;
	private String password;

	/**
	 * @return the accNo
	 */
	public double getAccNo() {
		return accNo;
	}

	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(double accNo) {
		this.accNo = accNo;
	}

	/**
	 * @param accBalance the accBalance to set
	 */

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	// Default Constructor
	public Users() {
	}

	// Getter Methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public String getAccountType() {
		return accountType;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getAddresscity() {
		return addresscity;
	}

	public String getstate() {
		return state;
	}

	public String getcode() {
		return code;
	}

	public String getIdentificationDetails() {
		return identificationDetails;
	}

	public String getAddress() {
		return address;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	public String getId() {
		return Id;
	}

	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public void setMobileNumber(String mobileNumber) {

		this.mobileNumber = mobileNumber;
	}

	public void setAddresscity(String Addresscity) {
		this.addresscity = Addresscity;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public void setcode(String code) {
		this.code = code;
	}

	public void setIdentificationDetails(String identificationDetails) {
		this.identificationDetails = identificationDetails;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public void setId(String Id) {
		this.Id = Id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "User Information: \n" + "First Name: " + this.getFirstName() + "\n" + "Last Name: " + this.getLastName()
				+ "\n" + "Birth Date (YYYY-MM-DD): " + this.getBirthDate() + "\n" + "Gender: " + this.getGender() + "\n"
				+ "Email: " + this.getEmail() + "\n" + "Contact Mobile Number: " + this.getMobileNumber() + "\n"
				+ "Address " + this.getAddress() + "\n" + "Addresscity:" + this.getAddresscity() + "\n" + "state:"
				+ this.getstate() + "\n" + "code:" + this.getcode() + "\n" + this.getId() + "\n" +"Identification Details: "
				+ this.getIdentificationDetails() + "\n" + "Account Type: " + this.getAccountType();
	}
}
