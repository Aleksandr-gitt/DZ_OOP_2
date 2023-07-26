package HomeWorkOOP_2.task_1;

public interface IhomeAnimal {

    void sleep();
    void eat();
    void play();
    void makeSound();
    void jump();
    void catching();
    void swim();
    String Error = "Cats dont swimming";
    

    default String DogCat(){
        return "Dog run by the cat";
    }

    


    
}
