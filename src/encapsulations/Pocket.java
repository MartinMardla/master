package encapsulations;

import java.util.Scanner;

/*
Create class Pocket.
        a) Add field „ money ”, create constructor , getter and setter
        b) Add verification for both getter and setter . Getter should result in returning as much
        money , as the user asked for. It should return 0 if money <= 10
        c) Setter should not accept values below 0 and greater than 3000. It may print a message
        like „I don’t have enough space in my pocket for as much money
*/
public class Pocket {


    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in); // Greate a Scanner object
        System.out.println("Enter value you want to take out: ");
        int value = myInput.nextInt();           //Read user Input
        Pocket pocket =new Pocket(value);
        Integer getSum = pocket.getMoney(value);
        System.out.println(getSum);
    }

    private Integer money = 3000;
    // Constructor
    public Pocket(Integer money) {
        this.money = money;
    }
    // Getter, Setter
    public Integer getMoney(Integer sum) {
        if (this.money - sum < 10) {
            System.out.println("Not enough money!");
            return 0;
        }
        this.money -= sum;
        return sum;
    }

    public void setMoney(Integer money) {
        if (money < 0 || money > 3000) {
            System.out.println("I don’t have enough space in my pocket for as much money.");
            return;
        }
        this.money = money;
    }


}