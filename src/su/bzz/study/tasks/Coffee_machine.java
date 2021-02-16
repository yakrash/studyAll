package su.bzz.study.tasks;

import java.util.Scanner;

public class Coffee_machine {
    public static void main(String args[]) {
        int count;
        int water;
        int milk;
        int beans;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        count = sc.nextInt();
        water = count * 200;
        milk = count * 50;
        beans = count * 15;
        System.out.println("For " + count + " cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
    }
}
