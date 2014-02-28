package resto.tests;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.NoSuchProviderException;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;



public class MailReceiver {
	
    /**
     *
     * @param userMail
     * @param password
     * @param max
     * @return
     */
   
     
    
    public List<Mail> getMails(String userMail, String password, int max) {
            
            
                List<Mail> receivedMails = new ArrayList<>();
                Mail mail = new Mail();
                
		Properties props = System.getProperties();
		props.setProperty("mail.store.protocol", "imaps");
			try {
				Session session = Session.getDefaultInstance(props, null);
				Store store = session.getStore("imaps");
				store.connect("imap.gmail.com", userMail, password);
				System.out.println(store);

				Folder inbox = store.getFolder("Inbox");
				inbox.open(Folder.READ_ONLY);
				Message messages[] = inbox.getMessages();
                                
                                for (int i = 1; i < max; i++) {
                                    
                                        mail.setEmailNumber(messages.length - i);
                                        mail.setDate(messages[messages.length - i].getSentDate().toString());
                                        mail.setEmailSender((messages[messages.length - i].getFrom()[0]).toString());
                                        mail.setEmailSubject(messages[messages.length - i].getSubject());    

                                        try
                                        {
                                              Multipart mulpart = (Multipart) messages[messages.length - i].getContent();
                                              int count = mulpart.getCount();
                                              for (int j = 0; j+1 < count; j++)
                                             {
                                                  mail.setEmailObject(storePart(mulpart.getBodyPart(j)));
                                             }
                                        }
                                        catch (Exception ex)
                                        {
                                             System.out.println("Exception arise at get Content");
                                        }
                                        receivedMails.add(mail);
                                        mail = new Mail();
                                  }      
                                
		} catch (NoSuchProviderException e) {
			System.exit(1);
		} catch (MessagingException e) {
			System.exit(2);
		}
                        System.out.println("ok");
                return receivedMails;

	}
 
        public static String storePart(Part part) throws Exception
        {   
         String body = "";
         String inputStreamString;
         
          InputStream input = part.getInputStream();
          if (!(input instanceof BufferedInputStream))
         {
              input = new BufferedInputStream(input);
          }
          int i;
          while ((i = input.read()) != -1)
         {
         
            inputStreamString = new Scanner(input,"UTF-8").next();
             body += inputStreamString;
         }
          return body;
     }

    	
}
