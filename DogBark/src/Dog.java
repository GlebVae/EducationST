class Dog {
    int size;
    String name;

    void bark(){
        if (size > 50){
            System.out.println("Гав гав!");
        }else if (size >15){
            System.out.println("Вуф фуф!");
        }else {
            System.out.println("Тяф тяф!");
        }
    }
}
