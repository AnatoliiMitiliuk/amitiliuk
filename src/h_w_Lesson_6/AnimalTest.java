package h_w_Lesson_6;

public class AnimalTest {
    public static void main(String[] args) {

        Cat cat = new Cat("Hello");
        cat.setName("Kitty");

        GuideDog guideDogDogdog = new GuideDog("Hello");
        guideDogDogdog.setName("Baxter");
        guideDogDogdog.setIsTrained("I can take you home");

        Fish fish = new Fish("....");
        fish.setName("....");

        Wolf wolf = new Wolf("Hello");
        wolf.setInPredator("and I am angry");

        Lion lion = new Lion("Hello");
        lion.setInPredator("and I am angry");

        Giraffe giraffe = new Giraffe("Hello");

        Crocodile crocodile = new Crocodile("Hello");
        crocodile.setInPredator("and I am angry");

        Hamster hamster = new Hamster("Hello");
        hamster.setName("Tigger");

        System.out.println(fish);
        System.out.println(guideDogDogdog);
        System.out.println(cat);
        System.out.println(wolf);
        System.out.println(lion);
        System.out.println(giraffe);
        System.out.println(crocodile);
        System.out.println(hamster);

    }

}
