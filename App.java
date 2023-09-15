package SeminarsOOP.VendingMachine;

import SeminarsOOP.VendingMachine.Domen.Bottle;
import SeminarsOOP.VendingMachine.Domen.HotDrink;
import SeminarsOOP.VendingMachine.Domen.Product;
import SeminarsOOP.VendingMachine.Services.CoinDispenser;
import SeminarsOOP.VendingMachine.Services.Holder;
import SeminarsOOP.VendingMachine.Services.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Product> assort = new ArrayList<Product>(); 

        Product item1 = new Product("Lays", 100);
        Product item2 = new Product("cola", 50);
        Product item3 = new Bottle("Mineral water", 101, 1.5);

        assort.add(item1);
        assort.add(item2);
        assort.add(item3);

        Holder hold1 = new Holder(10, 10);
        CoinDispenser disp = new CoinDispenser(120);

        VendingMachine venMach1 = new VendingMachine(hold1, disp, assort);

        HotDrink coffee = new HotDrink("Coffee", 120, 50);
        HotDrink tea = new HotDrink("Tea", 80, 45);
        HotDrink cocoa = new HotDrink("Cocoa",100, 35);

        //venMach1.getProductList().addAll(List.of(coffee, tea, cocoa));

        venMach1.getProductList().add(coffee);
        venMach1.getProductList().add(tea);
        venMach1.getProductList().add(cocoa);

        for(Product prod: venMach1.getProductList())
        {
            System.out.println(prod);
        }
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
