class Book {
    //������ ���� �����
    private String genre;
    protected void setGenre(String g){
        genre = g;
    }
    protected String getGenre(){
        return genre;
    }
    //������ ��� �����
    private int bookyear;
    protected void setBookyear(int by){
        bookyear = by;
    }
    protected int getBookyear(){
        return bookyear;
    }

    //������ ������ �����
    private String author;
    protected void setAuthor(String au){
        author = au;
    }
    protected String getAuthor(){
        return author;
    }

    //������ ��� �����
    private String bookname;
    protected void setBookname(String bn){
        bookname = bn;
    }
    protected String getBookname(){
        return bookname;
    }
}
