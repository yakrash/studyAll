package su.bzz.study.tasks;

import java.util.Scanner;

public class Coffee_machine {
    public static void main(String args[]) {
        int count;
        int water;
        int milk;
        int beans;
        int result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        water = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        beans = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        count = sc.nextInt();

        if (water < 200 || milk < 50 || beans < 15) {
            System.out.println("No, I can make only 0 cup(s) of coffee");
        }
        while (water >= 200 && milk >= 50 && beans >= 15 ) {
            result++;
            water -= 200;
            milk -= 50;
            beans -= 15;
        }

        if (result < count) {
            System.out.println("No, I can make only " + result + " cup(s) of coffee");
        }
        if (result == count) {
            System.out.println("Yes, I can make that amount of coffee");
        }
        if (result > count) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (result - count)
                    + " more than that)");
        }
    }
}
