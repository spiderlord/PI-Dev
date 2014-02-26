package resto.tests;

public class Mail {
    
    private int emailNumber;
    private String date;
    private String emailSender ;
    private String pwdSender ;
    private String emailReceiver ; 
    private String emailObject ;
    private String emailSubject ;

    public int getEmailNumber() {
        return emailNumber;
    }
    public void setEmailNumber(int emailNumber) {
        this.emailNumber = emailNumber;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getEmailSender() {
        return emailSender;
    }
    public void setEmailSender(String emailSender) {
        this.emailSender = emailSender;
    }
    public String getPwdSender() {
        return pwdSender;
    }
    public void setPwdSender(String pwdSender) {
        this.pwdSender = pwdSender;
    }
    public String getEmailReceiver() {
        return emailReceiver;
    }
    public void setEmailReceiver(String emailReceiver) {
        this.emailReceiver = emailReceiver;
    }
    public String getEmailObject() {
        return emailObject;
    }
    public void setEmailObject(String emailObject) {
        this.emailObject = emailObject;
    }
    public String getEmailSubject() {
        return emailSubject;
    }
    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    @Override
    public String toString() {
        return "N°: " + emailNumber + " | Date: " + date + " | emailSender=" + emailSender + " | emailObject=" + emailObject + 
                " | emailSubject=" + emailSubject + '}';
    }
    
    
    
}
