package su.bzz.study.hyperSkill;

import java.util.*;

public class Coffee_machine {
    public static void main(String[] args) {
        Work work = new Work();
        work.toDo();
    }
}

class Work {
    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;
    boolean work = true;

    Scanner sc = new Scanner(System.in);

    public void toDo() {
        while (work) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (sc.next()) {
                case "buy":
                    buyCoffee();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    work = false;
                    break;
                default:
                    System.out.println("Error main menu!");
                    break;
            }
        }
    }

    private void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                "back - to main menu:");
        switch (sc.next()) {
            case "1":
                buyEspresso();
                break;
            case "2":
                buyLatte();
                break;
            case "3":
                buyCappuccino();
                break;
            case "back":
                break;
            default:
                System.out.println("Error in change drink");
                break;
        }
    }

    private void buyCappuccino() {
        if (water < 200) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 12) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            water -= 200;
            milk -= 100;
            beans -= 12;
            money += 6;
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    private void buyLatte() {
        if (water < 350) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < 20) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            water -= 350;
            milk -= 75;
            beans -= 20;
            money += 7;
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    private void buyEspresso() {
        if (water < 250) {
            System.out.println("Sorry, not enough water!");
        } else if (beans < 16) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            water -= 250;
            beans -= 16;
            money += 4;
            cups--;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    private void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    private void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        water += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += sc.nextInt();
    }
}