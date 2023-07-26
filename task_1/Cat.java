package HomeWorkOOP_2.task_1;

public class Cat implements IhomeAnimal{

    String name;

    public Cat(String name){
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
        System.out.println(name + " is meow");
    }


    @Override
    public void jump() {
        System.out.println(name + " is jump");
    }
    
    @Override
    public String DogCat(){                 //изменил поведение default
        return "Cat run from the dog";
    }


    @Override
    public void catching() {
        System.out.println("Cat catch fantik");
    }


    @Override
    public void swim() {
        System.out.println(Error);
    }
}
