public class Library {

    public void bookList(){
        Book[] booklist = new Book[2];
        booklist[0] = new Book();
        booklist[0].setID(1);
        booklist[0].setBookAuthor("Лермонтов");
        booklist[0].setBookeName("Герои нашего времени");
        booklist[0].setGender("Роман");
        booklist[0].setBookYear("1840");
    }
    public void userCard(int idcard, String namecard, String surnamecard, int agecard ){
        UserCard[] usercard = new UserCard[2];
        usercard [0] = new UserCard();
        usercard[0].setIDCard(1);
        usercard[0].setNameCard("Артём");
        usercard[0].setSurnameCard("Лопатин");
        usercard[0].setAgeCard(25);
    }



}