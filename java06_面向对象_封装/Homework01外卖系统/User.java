package Homeork01Õ‚¬ÙœµÕ≥;

public class User {
	int userId;
	String userName;
	String passWord;
	int userTelephone;
	String userAddress;
	
		
	public User() {
		super();
	}

	public User(int userId, String userName, String passWord, int userTelephone, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.userTelephone = userTelephone;
		this.userAddress = userAddress;
	}
	
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getUserTelephone() {
		return userTelephone;
	}

	public void setUserTelephone(int userTelephone) {
		this.userTelephone = userTelephone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", passWord=" + passWord + ", userTelephone="
				+ userTelephone + ", userAddress=" + userAddress + "]";
	}
	
	
	

}
