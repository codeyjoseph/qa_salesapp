package org.lbg.c4;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Runner {
    private IElementReader dr;
    public Runner(IElementReader dr) {
        this.dr = dr;
    }

    public void run(Scanner sc) {
        double VAT;
        int quantity;
        double price;
        ArrayList<TaxData> entries = new ArrayList<>();
        System.out.print("Welcome to the Friendly Sales App. At any time, ");
        System.out.println("you can enter a negative value to break out the program.");
        System.out.println("The values requested in order are: VAT, Price, Quantity");
        while (true) {
            try {
                dr.setPrpt("Please enter a number up to two decimal places");
                if (exit(VAT = dr.readFromKeyboard(sc))
                    || exit(price = dr.readFromKeyboard(sc)))
                    break ;
                dr.setPrpt("Please enter a whole number");
                double temp;
                if (exit(temp = dr.readFromKeyboard(sc)))
                    break ;
                quantity = (int) temp;
            } catch (NoSuchElementException e) {
                System.out.println("Invalid format; throwing exception");
                break ;
            }
            TaxData data = new TaxData(VAT, price, quantity);
            entries.add(data);
        }
        System.out.println("Here are the entries and the totals to pay:");
        for (TaxData td : entries) {
            System.out.println("Ex VAT: £" + td.getPrice() + ", quantity: " + td.getQuantity() + "\tPrice with VAT: " + td.calculateTotal());
        }
    }
    public <T extends Number> boolean exit(T param) {
        return param.doubleValue() < 0;
    }
}
