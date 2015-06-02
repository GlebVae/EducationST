class BadDogTestDrive {
// проба инкапсуляции Сеттеры и Геттеры
    public static void main (String[] args){

        Dog one = new Dog();
        one.setSize(70);
        one.bark();

        Dog two = new Dog();
        two.setSize(8);
        two.bark();

        System.out.println("Первая собака: " + one.getSize());
        System.out.println("Вторая собака: " + two.getSize());

    }
}