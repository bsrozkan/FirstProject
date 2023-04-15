package com.neotech.lesson27;

public class Registration {

	private String email;
	private String password;
	private String userName;

	// getter for email
	public String getEmail() {
		return email;
	}

	// setter for email
	public void setEmail(String email) {
		if (email.endsWith("yahoo.com")) {
			this.email = email;
		} else {
			System.out.println("Pls use yahoo account only!");
		}

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.contains(userName)) {
					this.password = password;

				} else {

					System.out.println("password shoul not contain username");
				}
			} else {
				System.out.println("Password can not be less then 6 characters");
			}
		} else {
			System.out.println("Password can not be empty");
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (!userName.isEmpty() && userName.length() > 6) {
			this.userName = userName;
		} else {
			System.out.println("User name can not be empty and should be at least 6 characters");
		}

	}

}
