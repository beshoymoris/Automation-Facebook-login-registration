package GetDataFromMail;

import javax.mail.*;
import java.util.Properties;

public class CheckingMails {

    public static void check(String host, String storeType, String user,
                             String password, String authentication)
    {
        try {

            //create properties field
            Properties properties = new Properties();

            properties.put("mail.pop3.host", host);
            properties.put("mail.pop3.port", "995");
            properties.put("mail.pop3.starttls.enable", "true");
            Session emailSession = Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server
            Store store = emailSession.getStore("pop3s");

            store.connect(host, user, password);

            //create the folder object and open it
            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            System.out.println("messages.length---" + messages.length);

            for (int i = 0, n = messages.length; i < n; i++) {
                Message message = messages[i];
                System.out.println("---------------------------------");
                System.out.println("Email Number " + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " + message.getContent().toString());

            }

            //close the store and folder objects
            emailFolder.close(false);
            store.close();

        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String host = "pop.facebook.net";// change accordingly
        String mailStoreType = "pop3";
        String username = "open_vhxsoeu_user@tfbnw.net";// change accordingly
        String password = "facebookpassword";// change accordingly
        String authentication = "EAAJhuShdbC4BADNJ8QnrlZBkadOOSxTbeBkNFJx1f4y3ES5riYqhwU0LAB772cZAOTqmd2nQvpOWu7Oli9HuYZBZChTTU9lWbQrlDtMirvSZBvJ0v9oAoGJ1C3afCyidri1urb0e4kqwQTkPCbxWgZAcYdYJbID2g6jmWwoHwtayDJ8a7YMye0ykJOmEv6igmUfMyD1PF7LAZDZD";

        check(host, mailStoreType, username, password, authentication);

    }

}