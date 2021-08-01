/**
 * @Author		: Tahir Shaik
 * @Date		: 11/07/21
 * @E-Mail		: tahirsk1920@gmail.com
 * @FileName	: SendEmail.java
 * @Description	: This file contains getting toMails from User, 
 * 			Mail validation, getting UserName of Email and send E-Mail.
 * @Dependancies: This file Requires Mailer.java to execute the program
 */

package hit.emailproject;

import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.validator.routines.EmailValidator;

public class SendEmail {

	public static void sendFromGmail(String fromMail, String password, String subject, String textBody) {

		// Getting To Mails from the User
		Set<String> toMails = new TreeSet<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.of mails to sent: ");
		// This method reads the number provided using keyboard
		int max = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the mails to sent: ");
		for (int i = 0; i < max; i++) {
			toMails.add(sc.nextLine());
		}
		sc.close();

		//System.out.println("Configuring Properties of Mail(host,auth,port & tls) (G-Mail)");
		// Get the properties
		Properties props = new Properties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		// Get the default Session object.
		// Session session = Session.getDefaultInstance(props);

		//System.out.println("Getting the Session of the Mail (G-Mail)");
		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromMail, password);
			}
		});
		//System.out.println("Successfully Got the Session of the Mail (G-Mail)");

		
		try {
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(fromMail));

			for (String toMail : toMails) {

				if (isValidEmailAddress(toMail) == true) {

					String userName = getUserName(toMail);
					// Set To: header field of the header.
					message.addRecipient(Message.RecipientType.TO, new InternetAddress(toMail));

					// Set Subject: header field
					message.setSubject(subject);

					textBody = "Dear Mr. "+userName+",\n"+textBody;
					System.out.println(textBody);
					// Now set the actual message
					message.setText(textBody);
					System.out.println("Sending the Mail to: " + userName);
					Transport.send(message);
					System.out.println("Mail Sent Successfully....\n");
				}

			}

		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}

	// Validate E-Mails and return the status as true if valid, otherwise False
	private static boolean isValidEmailAddress(String email) {
		// create the EmailValidator instance
		EmailValidator validator = EmailValidator.getInstance();
		// check for valid email addresses using isValid method
		return validator.isValid(email);
	}

	// Extract and Get the User-Name from the E-Mail
	private static String getUserName(String eMail) {
		int index = eMail.indexOf('@');
		eMail = eMail.substring(0, index);
		return eMail;
	}

}