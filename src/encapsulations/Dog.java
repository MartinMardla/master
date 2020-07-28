package encapsulations;


/*
Create class Dog.
    a)Add private fields to the class , like name , age , gender , race, weigth
    b)Create constructor that accepts all of the class fields
    c)Create additional constructor , that will accept only gender and race. It should call main
    constructor with default values
    d)Create getters and setters for age and weigth
  ???  e)Create object of class Dog. Verify if everything works as expected
  ???  f)Add verification for all arguments passed to the setters . E.g . setWeigth method should
    not accept values below or equal to 0.
 */
public class Dog {

    public static void main(String[] args) {
     //   Dog myDog = new Dog ();
    }

    private String name;
    private int age;
    private String gender;
    private String race;
    private Integer weight;

    public Dog(String gender, String race) {
        this.gender = gender;
        this.race = race;
    }

    public Dog(String name, int age, String gender, String race, Integer weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
