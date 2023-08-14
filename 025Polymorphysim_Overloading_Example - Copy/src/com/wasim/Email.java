package com.wasim;

//u can create more then one method weather same name in same class provided they have different number of Argument or different type of Argument is called as method overloading

public class Email {
	public void sendEmail(String tcid) {
		System.out.println("Transactional Emailer");
	}

	public void sendEmail() {
		System.out.println("Promotional Emailer");
	}

	public static void main(String[] args) {
		Email email = new Email();
		email.sendEmail("abc123");
		email.sendEmail();
	}
}
