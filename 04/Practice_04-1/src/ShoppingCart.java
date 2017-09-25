/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruslan.safin
 */
public class ShoppingCart {
    public static void main (String [] args){
        String customerName, itemDescription; // объявляем переменные Имя покупателя, имя товара
        double price,tax; // объявляем переменные цена, налог
        int quantity; // 
        double total;
        int total1;
        int numberOrder = 10;
        quantity = 1;
        price = 21.4833333;
        tax = 1.20;
        customerName ="Alexei";
        itemDescription = " box nr. "+ numberOrder;
        total = quantity * price * tax;
        total1 = (int)(quantity * price * tax);
        String massage;
        String massage1;
        massage = "customer " + customerName + " wants to buy " + quantity + itemDescription + ". Total cost with tax is: " + total + " USD.";
        massage1 = "customer " + customerName + " wants to buy " + quantity + itemDescription + ". Total cost with tax is: " + total1 + " USD.";
        System.out.println(massage);
        System.out.println(massage1);

    }
}
