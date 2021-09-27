package h_w_Lesson_9.Animals;

public class AnimalTest {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Kitty");

        GuideDog guideDog = new GuideDog();
        guideDog.setName("Baxter");

        Fish fish = new Fish();
        fish.setName("....");

        Wolf wolf = new Wolf();

        Lion lion = new Lion();

        Giraffe giraffe = new Giraffe();

        Crocodile crocodile = new Crocodile();

        Hamster hamster = new Hamster();
        hamster.setName("Tigger");

        System.out.println(fish);
        System.out.println(guideDog);
        System.out.println(cat);
        System.out.println(wolf);
        System.out.println(lion);
        System.out.println(giraffe);
        System.out.println(crocodile);
        System.out.println(hamster);

    }
}
