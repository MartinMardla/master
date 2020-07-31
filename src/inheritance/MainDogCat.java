package inheritance;

public class MainDogCat {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.name();
        myDog.yieldVoice();

        myCat.name();
        myCat.yieldVoice();

    }
}
