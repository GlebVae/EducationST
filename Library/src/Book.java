class Book {
    //описал жанр книги
    private String genre;
    protected void setGenre(String g){
        genre = g;
    }
    protected String getGenre(){
        return genre;
    }
    //описал год книги
    private int bookyear;
    protected void setBookyear(int by){
        bookyear = by;
    }
    protected int getBookyear(){
        return bookyear;
    }

    //описал автора книги
    private String author;
    protected void setAuthor(String au){
        author = au;
    }
    protected String getAuthor(){
        return author;
    }

    //описал имя книги
    private String bookname;
    protected void setBookname(String bn){
        bookname = bn;
    }
    protected String getBookname(){
        return bookname;
    }
}
