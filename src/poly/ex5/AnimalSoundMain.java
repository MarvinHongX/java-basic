package poly.ex5;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()};
        for (Animal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound();
    }
    private static void moveAnimal(Animal animal) {
        animal.move();
    }
}
