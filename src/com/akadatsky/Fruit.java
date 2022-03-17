package com.akadatsky;

public class Fruit {

    public enum Type {
        APPLE, ORANGE, CARROT
    }

    private Color color;
    private Type type;
    private int weight;
    private double pricePerKg;

    public Fruit() {
    }

    public Fruit(int weight, double pricePerKg) {
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public Fruit(Color color, Type type, int weight, double pricePerKg) {
        this.color = color;
        this.type = type;
        this.weight = weight;
        this.pricePerKg = pricePerKg;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color=" + color +
                ", type=" + type +
                ", weight=" + weight +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}
