package org.lbg.c4;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class TaxData {

    private final int quantity;
    private final double price;
    private final double VAT;
    private final DecimalFormat df;

    public TaxData(double VAT, double price, int quantity) {
        this.VAT = VAT;
        this.quantity = quantity;
        this.price = price;
        df = new DecimalFormat("0.00");
    }

    public double calculateTotal() {
        double total = ((VAT + 1) * price) * quantity;
        return Double.parseDouble(df.format(total));
    }

    public double getVAT() {
        return VAT;
    }
    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
