package poly.ex6;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck(), new Bird()};
        for (Animal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
            if (animal instanceof Fly) {
                flyAnimal((Fly) animal);
            }
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
    private static void moveAnimal(Animal animal) {
        animal.move();
    }
    private static void flyAnimal(Fly fly) {
        fly.fly();
    }
}
