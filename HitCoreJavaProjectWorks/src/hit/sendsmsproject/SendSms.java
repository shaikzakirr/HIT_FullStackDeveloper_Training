/**
 * @Author		: Tahir Shaik
 * @Date		: 17/07/21
 * @E-Mail		: tahirsk1920@gmail.com
 * @FileName	: SendSms.java
 * @Description	: This file contains Main source code, it will authenticate and send SMS to multiple Users using twilio.jar Libraries
 * 
 */
package hit.sendsmsproject;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class SendSms {

	//@Note: According to the Twilio Documents Max. 35 SMS/Day -> 100SMS/Month is limit for free account
	// Add your Account SID and Auth Token From the Environment Variables 
	//Where ensure that U added these to your Environment Variables
	public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
	public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

	public static void main(String[] args) throws Exception {
		int phoneNumberCount = 0;
		String messageData = "";
		Set<String> phoneNumbersSet = new HashSet<String>();
		Scanner input = new Scanner(System.in);
		
		//Get the No.Of Phone Number Count
		System.out.print("Enter No.of Phone Numbers (Count): ");
		phoneNumberCount = input.nextInt();
		input.nextLine();
		
		//Get the Phone Numbers
		System.out.println("Enter " + phoneNumberCount + " Phone Numbers:");
		for (int i = 0; i < phoneNumberCount; i++) {
			phoneNumbersSet.add(input.nextLine());
		}
		
		//Get the Message to Send in SMS
		System.out.println("Enter the Message To Send: ");
		messageData = input.nextLine();
		input.close();
		
		try {
			// Authenticate & Initialize Your Account
			Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
			
			for (String phoneNumber : phoneNumbersSet) {
				//Create a Message and include the to Phone Number, Message & From Phone Number (From Twilio)
				//And Send the SMS
				Message message = Message.creator(new com.twilio.type.PhoneNumber("+91" + phoneNumber),
						new com.twilio.type.PhoneNumber("+17602786454"), "\n"+messageData).create();
				//Get the Transaction Id
				System.out.println("Security Identifier (SID): "+message.getSid());
				System.out.println("SMS Sent Successfully to :"+phoneNumber);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
