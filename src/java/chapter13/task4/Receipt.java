package chapter13.task4;

import java.util.Formatter;

public class Receipt {
    private double total = 0;
    private Formatter f = new Formatter(System.out);

    private int widthItem = 25;
    private int widthQty = 6;
    private int widthPrice = 10;

    public void printTitle(){
        f.format("%-" + widthItem + "s %" + widthQty + "s %" + widthPrice + "s\n", "Item", "Qty", "Price");
        f.format("%-" + widthItem + "s %" + widthQty + "s %" + widthPrice + "s\n", "----", "---", "-----");
    }

    public void print(String name, int qty, double price){
        f.format("%-" + widthItem + ".15s %" + widthQty + "d %" + widthPrice + ".2f\n", name, qty, price);
        total += price;
    }

    public void printTotal(){
        f.format("%-" + widthItem + "s %" + widthQty + "s %" + widthPrice + ".2f\n", "Tax", "", total * 0.06);
        f.format("%-" + widthItem + "s %" + widthQty + "s %" + widthPrice + "s\n", "", "", "-----");
        f.format("%-" + widthItem + "s %" + widthQty + "s %" + widthPrice + ".2f\n", "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1,14.29);
        receipt.printTotal();
    }
}
