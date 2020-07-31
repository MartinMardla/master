package inheritance;

public class Cat extends Animal {


    @Override
    public void yieldVoice() {
        System.out.println("meow");
    }
    public void name() { System.out.println("Fluffy"); }
}
