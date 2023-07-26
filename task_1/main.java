package HomeWorkOOP_2.task_1;

public class main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Bars");


        cat.eat();
        cat.play();
        cat.sleep();
        cat.makeSound();
        cat.jump();
        System.out.println("---------------");

        dog.eat();
        dog.play();
        dog.sleep();
        dog.makeSound();
        dog.jump();
        System.out.println("---------------");


        System.out.println(dog.DogCat());
        System.out.println(cat.DogCat());
        dog.catching();
        cat.catching();
        System.out.println("---------------");

        dog.swim();
        cat.swim();

    }
    
}
