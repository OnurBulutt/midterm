package proje;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

//üyelerin bilgileri saklı tutacak olan .txt dosyasına ihtiyac var
//objler için iki ayrı arraylist lazım
public class Main {
    public static void main(String[] args) {
        int flag=0 ,procedure,loop=0;
        String name,surname,mail,messageText,messageSubject;
        Scanner input=new Scanner(System.in);
        ArrayList<Elite> vipList=new ArrayList<Elite>();
        ArrayList<Common> generalList= new ArrayList<Common>();
        while(0 == flag){
            System.out.println("Press 1 to add Elite member");
            System.out.println("Press 2 to add Common member");
            System.out.println("Press 3 to send mail to members");
            procedure=input.nextInt();
            input.nextLine();           // cleaning buffer from /n
            if (procedure == 1) {       //add vip member

                System.out.println("name :");
                name=input.nextLine();
                //System.out.println("entered name :"+name);
                System.out.println("surname :");
                surname=input.nextLine();
                //System.out.println("entered surname:"+surname);
                System.out.println("mail adress :");
                mail=input.nextLine();
                //System.out.println("entered mail :"+mail);
                //vipList.add(new Elite(name,surname,mail));
                Elite newMember= new Elite(name,surname,mail);
                vipList.add(newMember);


                try{
                    BufferedWriter pen=new BufferedWriter(new FileWriter("ListOfMembers.txt",true));
                    pen.write(name+"\t");
                    pen.write(surname+"\t");
                    pen.write(mail);
                    pen.newLine();
                    pen.flush();
                    pen.close();
                }
                catch (IOException a){
                    System.out.println("IO error");
                    a.printStackTrace();
                }


            }
            else if (procedure == 2) {      //add common member
                System.out.println("name :");
                name=input.nextLine();
                //System.out.println("entered name :"+name);
                System.out.println("surname :");
                surname=input.nextLine();
                //System.out.println("entered surname:"+surname);
                System.out.println("mail adress :");
                mail=input.nextLine();
                //System.out.println("entered mail :"+mail);
                Common newMember=new Common(name,surname,mail);
                generalList.add(newMember);
                try{
                    BufferedWriter pen=new BufferedWriter(new FileWriter("ListOfMembers.txt",true));
                    pen.write(name+"\t");
                    pen.write(surname+"\t");
                    pen.write(mail);
                    pen.newLine();
                    pen.flush();
                    pen.close();
                }
                catch (IOException a){
                    System.out.println("IO error");
                    a.printStackTrace();
                }

            }
            else if (procedure == 3) {      //send mail to member
                System.out.println("sending mail option hasnt finished yet ");
                /*
                System.out.println("press 1 to send mail to Elite members");
                System.out.println("press 2 to send mail to Common members");
                System.out.println("press 3 to send mail to all members");
                procedure=input.nextInt();
                input.nextLine();       // clearing buffer
                System.out.println("enter the subject ");
                messageSubject=input.nextLine();
                System.out.println("enter the text  ");
                messageText=input.nextLine();
                System.out.println("enter your mail adress");
                String senderAdress=input.nextLine();
                System.out.println("enter password of your mail adress");
                String senderPassword=input.nextLine();

                if(procedure == 1 ){        // elite members

                    for(int i=0; i<(Elite.getVipObjCounter());i++) {
                        String reMail=

                        Mail mailSend = new Mail(senderAdress, , senderPassword, messageSubject, messageText);


                    }
                }
                else if(procedure == 2 ){   // common members


                }
                else if( procedure == 3 ){  // all members



                }
                else {
                    System.out.println("program is going to shutdown. enter a proper input next time");
                    return ;

                }

                 */

            }
            else{
                System.out.println("program is going to shutdown. enter a proper input next time");
                return ;
            }
            System.out.println("press 0 to return main menu! press something else to exit!");
            flag=input.nextInt();
            if(0 != flag) {
                System.out.println("cya!");
            }
        }
    }
}
