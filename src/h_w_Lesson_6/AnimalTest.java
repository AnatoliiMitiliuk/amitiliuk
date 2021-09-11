package h_w_Lesson_6;

public class AnimalTest {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Kitty");

        GuideDog guideDog = new GuideDog();
        guideDog.setName("Baxter");
        guideDog.setIsTrained("I can take you home");

        Fish fish = new Fish();
        fish.setName("....");

        Wolf wolf = new Wolf();
        wolf.setInPredator("and I am angry");

        Lion lion = new Lion();
        lion.setInPredator("and I am angry");

        Giraffe giraffe = new Giraffe();

        Crocodile crocodile = new Crocodile();
        crocodile.setInPredator("and I am angry");

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
