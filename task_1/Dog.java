package HomeWorkOOP_2.task_1;

public class Dog implements Ianimal{
    
    String name;

    public Dog(String name){
        this.name = name;
    }


    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void play() {
        System.out.println(name + " is playing");
    }


    @Override
    public void makeSound() {
        System.out.println(name + " is Woof");
    }
}
