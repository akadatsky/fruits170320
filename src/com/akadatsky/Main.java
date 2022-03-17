package com.akadatsky;

public class Main {

    public static void main(String[] args) {
        Fruit greenApple = new Fruit();
        greenApple.setColor(Color.GREEN);
        greenApple.setType(Fruit.Type.APPLE);
        greenApple.setWeight(216);
        greenApple.setPricePerKg(14.90);

        Fruit redApple = new Fruit(262, 20.90);
        Fruit orange;
        Fruit carrot;

        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.add(greenApple);
        cashMachine1.add(redApple);
        cashMachine1.printBill();

        CashMachine cashMachine2 = new CashMachine();
    }

}
