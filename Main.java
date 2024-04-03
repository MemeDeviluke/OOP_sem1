package HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new BottleOfWater(100, "WaterDrink", 1000));
        productList.add(new BottleOfWater(150, "WaterDrink", 2000));
        productList.add(new BottleOfWater(300, "Soda", 1500));
        productList.add(new BottleOfWater(350, "LightSoda", 1500));
        productList.add(new HotDrink(310, "Coffee", 500, 100));
        productList.add(new HotDrink(260, "Tea", 600, 100));
        productList.add(new HotDrink(280, "GreenTea", 600, 90));

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        vendingMachine.initProduct(productList);
        HotDrinkVendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();
        hotDrinkVendingMachine.initProduct(productList);

        System.out.println(vendingMachine.getProduct("Soda", 1500));
        System.out.println(vendingMachine.getProduct("WaterDrink"));
        System.out.println(hotDrinkVendingMachine.getProduct("Coffee"));
        System.out.println(hotDrinkVendingMachine.getProduct("GreenTea", 600, 90));
    }
}
