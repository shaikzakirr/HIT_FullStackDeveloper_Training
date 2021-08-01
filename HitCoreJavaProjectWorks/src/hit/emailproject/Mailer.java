/**
 * @Author		: Zakir shaik
 * @Date		: 11/07/21
 * @E-Mail		: zakscoding@gmail.com
 * @FileName	: Mailer.java
 * @Description	: This file contains the Main Source Code
 * @Dependancies: This file Requires SendEmail.java to execute the program
 */

package hit.emailproject;

public class Mailer {
	public static void main(String[] args) {
		String subject ="A Quick Hello & Thanks for Visiting Our Website !!!";
		String textBody = "Greetings To You.\n\n"
				+ "We're Welcoming You!!.\n"
				+ "Our GitHub URL: https://github.com/shaikzakirr\n"
				+ "\n\n\nThanks & Regards,\nShaik Zakir,\nE-Mail: zakscoding@gmail.com ,\n"
				+ "Phone No: +91-8500754867.";
	
		String fromMail = "fromMain@gmail.com";
		String password = "password";
		
		SendEmail.sendFromGmail(fromMail,password,subject,textBody);
	}

}
