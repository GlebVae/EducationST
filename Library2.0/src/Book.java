public class Book {
    private int ID;
    private String Gender;
    private String BookYear;
    private String BookeName;
    private String BookAuthor;

    protected void setID(int id){
        if (id > 0){
            this.ID = id;
        }else {System.out.println("ID не может быть меньше нуля");}
    }
    protected int getID(){ return this.ID; }

    protected void setGender(String gender){this.Gender = gender;}
    protected String getGender(){return this.Gender;}

    protected void setBookYear(String bookyear){this.BookYear = bookyear;}
    protected String getBookYear(){return this.BookYear;}

    protected void setBookeName(String bookename){this.BookeName = bookename;}
    protected String getBookeName(){return this.BookeName;}

    protected void setBookAuthor(String bookauthor){this.BookAuthor = bookauthor;}
    protected String getBookAuthor(){return this.BookAuthor;}

}

