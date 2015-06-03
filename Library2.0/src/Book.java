public class Book {
    private int ID;
    private String Gender;
    private String BookYear;
    private String BookeName;
    private String BookAuthor;

    public void setID(int id){
        if (this.ID > 0){
            this.ID = id;
        }else {System.out.println("ID не может быть меньше нуля");}
        }
    public int getID(){ return this.ID; }

    public void setGender(String gender){this.Gender = gender;}
    public String getGender(){return this.Gender;}

    public void setBookYear(String bookyear){this.BookYear = bookyear;}
    public String getBookYear(){return this.BookYear;}

    public void setBookeName(String bookename){this.BookeName = bookename;}
    public String getBookeName(){return this.BookeName;}

    public void setBookAuthor(String bookauthor){this.BookAuthor = bookauthor;}
    public String getBookAuthor(){return this.BookAuthor;}
}
