package com.akadatsky;

public class Main {

    public static void main(String[] args) {
        Fruit greenApple = new Fruit(Color.GREEN, Fruit.Type.APPLE, 250, 15);
        Fruit redApple = new Fruit(Color.RED, Fruit.Type.APPLE, 250, 15);
        Fruit orange = new Fruit(Color.ORANGE, Fruit.Type.ORANGE, 120, 40);
        Fruit carrot = new Fruit(Color.ORANGE, Fruit.Type.CARROT, 80, 25);

        CashMachine cashMachine = new CashMachine();
        cashMachine.add(greenApple);
        cashMachine.add(redApple);
        cashMachine.add(orange);
        cashMachine.add(carrot);
        cashMachine.printBill();
    }

}
