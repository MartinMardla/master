package inheritance;

public class Dog extends Animal {

    public Dog() {
    }

    @Override
    public void yieldVoice() {
        System.out.println("bark");
    }
    public void name() { System.out.println("Puffy"); }
}
