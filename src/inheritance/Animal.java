package inheritance;

/*
Create classes Dog and Cat
    a)Move common methods and fields to the class Animal
    b)Create method yieldVoice
    c)Create simple array of type Animal , that will contain one object of type Dog and
      one object of type Cat
    d)Using for each loop show which animal gives what kind of voice . How to print a
      name of an object
 */

public abstract class Animal {
    // Move common methods and fields to the class Animal
    private int legs;
    private String voice;
    private String name;
    // Create method yieldVoice
    public abstract void yieldVoice();

    public Animal() {}
    // constructor
    public Animal(int legs, String voice, String name) {
        this.legs = legs;
        this.voice = voice;
        this.name = name;
    }

    // getters, setters

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void name();
}
