public class Librarin extends People{

    public Librarin(String name, String surname, int age){
        super.setName(name);
        super.setSurname(surname);
        super.setAge(age);
       }
    //����������� ���
    public void newname(){
        Librarin librarin = new Librarin("�������", "��������", 53);
    }
    //������ ���
    public void say(){
        System.out.println("������ ���� ����� " + getName() + " " + getSurname() + " � ������� � ��� ������������");
    }

}
