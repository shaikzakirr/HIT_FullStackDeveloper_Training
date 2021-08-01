/**
 * @Author		: Tahir Shaik
 * @Date		: 11/07/21
 * @E-Mail		: tahirsk1920@gmail.com
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
				+ "Join our Github and Connect/Follow us on LinkedIN !!!!\n"
				+ "Our GitHub URL: https://github.com/TahirShaik\n"
				+ "LinkedIN URL: https://www.linkedin.com/in/tahir1920 \n"
				+ "Visit Our Portfolio: https://tahirshaik.github.io/WebDevlopment-/FirstPortfoliowebDesign/index.html"
				+ "\n\n\nThanks & Regards,\nTahir Shaik,\nE-Mail: tahirsk1920@gmail.com ,\n"
				+ "Phone No: +91-9177327808.";
	
		String fromMail = "fromMain@gmail.com";
		String password = "password";
		
		SendEmail.sendFromGmail(fromMail,password,subject,textBody);
	}

}
