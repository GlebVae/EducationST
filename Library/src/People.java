public class People {
    //**описал имя
    private String fname;
    protected String getFname(){
        return fname;
    }
    protected void setFname (String f){
        fname = f;
    }
    //**описал фамилию
    private String sname;
    protected String getSname(){
        return sname;
    }
    protected void setSname (String s){
        sname = s;
    }
    //**описал возвраст
    private int age;
    protected int getAge(){
        return age;
    }
    protected void setAge (int a){
        age = a;
    }

}
