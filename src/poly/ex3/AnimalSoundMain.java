package poly.ex3;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Caw(), new Duck()};
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        animal.sound(); // 오버라이딩 된 메서드는 우선권을 갖는다.
    }
}
