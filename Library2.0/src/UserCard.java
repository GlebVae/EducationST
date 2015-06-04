public class UserCard {
    private int IDCard;
    private String NameCard;
    private String SurnameCard;
    private int AgeCard;

    public int getIDCard(){return this.IDCard;}
    public void setIDCard (int idcard) {
        if (idcard > 0){
            this.IDCard = idcard;
        }else {System.out.println("ID не может быть меньше нуля");}
    }

    public void setNameCard(String namecard){this.NameCard = namecard;}
    public String getNameCard(){return this.NameCard;}

    public void setSurnameCard(String surnamecard){this.SurnameCard = surnamecard;}
    public String getSurnameCard(){return this.SurnameCard;}

    public void setAgeCard (int agecard) {
        if (agecard > 0) {
            this.AgeCard = agecard;
        }else {
            System.out.println ("Возраст не может быть меньше нуля");}

    }
    public int getAgeCard(){return this.AgeCard;}
        }
