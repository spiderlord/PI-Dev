package resto.tests;

import resto.tests.Mail;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.Transport;

public class MailSender {
    
    Properties properties;
    Session session;
    Message message;


    public void getMailProperties(String strategy){
        
        String propFile = "resources/TLSConnection.properties";
        if ("SSL".equals(strategy)) {
            propFile = "resources/SSLConnection.properties";
        }

        try {
            
            properties = new Properties();   
            InputStream in = getClass().getResourceAsStream(propFile);
            properties.load(in);
            in.close();
        
        } catch (IOException ex) {
            Logger.getLogger(MailSender.class.getName()).log(Level.SEVERE, null, ex);
        }               
    }
    
    public void getMailMessage(String pieceJointe,final Mail mail){
        try {
            this.session = Session.getInstance(this.properties, 
                    new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(mail.getEmailSender(), mail.getPwdSender());}});
            this.message = new MimeMessage(this.session);
            InternetAddress recipient = new InternetAddress(mail.getEmailReceiver());
            this.message.setRecipient(Message.RecipientType.TO, recipient);
            this.message.setSubject(mail.getEmailSubject());
 
            /**
             * Partie 1: Le texte
             */
            MimeBodyPart mbp1 = new MimeBodyPart();
            mbp1.setText(mail.getEmailObject());
 
            MimeMultipart mp = new MimeMultipart();
            mp.addBodyPart(mbp1);

            //Adding attachment if exists
            if(null != pieceJointe)
            {
                MimeBodyPart mbp2 = new MimeBodyPart();
                mbp2.attachFile(pieceJointe);
                mp.addBodyPart(mbp2);
            }

            this.message.setContent(mp);
            
            
        } catch (IOException ex) {
            Logger.getLogger(MailSender.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(MailSender.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    public void SendMessage(){
        try {
                Transport.send(this.message);
            } catch (MessagingException ex) {
                Logger.getLogger(MailSender.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    public String formatURL(URL url){
        
        String s = url.toString();
        System.out.println("Before Clean");
        System.out.println(s);
        String delims = "/";
        String[] tokens = s.split(delims);
        System.out.println("After Clean");
        String mailPart="";
        for (int i=1;i<tokens.length;i++){
            mailPart+=tokens[i]+"\\\\";
        }
        System.out.println(mailPart);
        return mailPart;
    }
       
}
