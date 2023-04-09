/*
 mail classı tamamlanmamıştır!


package proje;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.ArrayList;

//mail göndderme aksiyonu burada gerçekleşecek
//gönderilecek mailin text ve body kısmı??
public class Mail {
    private String text,subject;
    private String sender,receiver,password;
    private static String host,port;

    public void send() throws MessagingException {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender, password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(sender));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(receiver));
        message.setSubject(subject);
        message.setText(text);

        Transport.send(message);
    }

    // constructor
    public Mail(String sender, String receiver, String password, String subject, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.password = password;
        this.subject = subject;
        this.text = text;
    }





}
*/