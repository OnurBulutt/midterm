package proje;




//üye classının 2 alt classı olacak : vip ve normal üye
//kaç adet üye olduğunu göstermek için counter koyuldu
public class Member {

    private String name,surname,mail;
    private static int objCounter=0;






    //gets sets
    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }
    String getSurname(){
        return surname;
    }
    void setSurname(String surname){
        this.surname=surname;
    }
    String getMail(){
        return mail;
    }
    void setMail(String mail){
        this.mail=mail;
    }
    int  getObjCounter(){
        return objCounter;

    }

    //constructors


    public Member(){
        objCounter++;
    };
    public Member(String name,String surname,String mail){
        this.name=name;
        this.surname=surname;
        this.mail=mail;
        objCounter++;
    }




}

//subclasses
class Elite extends Member {
    private static int vipObjCounter=0;

    //get
    public static int getVipObjCounter(){

        return vipObjCounter;
    }
    /* public String getVipMail(){
       return ;
    }

     */

    //constru
    public Elite(String name, String surname, String mail){
        super(name,surname,mail);
        vipObjCounter++;

    }
}

class Common extends Member{
    private static int commonObjCounter=0;

    //get
    public int getCommonObjCounter() {
        return commonObjCounter;
    }

    //construct
    public Common(String name, String surname, String mail){
        super(name,surname,mail);
        commonObjCounter++;
    }

}
