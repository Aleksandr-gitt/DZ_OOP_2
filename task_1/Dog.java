package HomeWorkOOP_2.task_1;

public class Dog implements IhomeAnimal{
    
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

    @Override
    public void jump() {
        System.out.println(name + " is jump");
    }


    @Override
    public void catching() {
        System.out.println("Dog catch ball");
    }


    @Override
    public void swim() {
        System.out.println("Dog is swim");    
    }

    
}
