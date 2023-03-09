package day03_variables;

public class CellPhone {

    public static void main(String[] args) {

        String brand = "Apple", model = "Iphone 13";
        String color = "black";
        int storage = 256;
        double price = 1099.99;
        boolean hasThirdCamera = true;

        System.out.println("Phone brand:\t\t\t\t" + brand);
        System.out.println("Phone model:\t\t\t\t" + model);
        System.out.println("Phone color:\t\t\t\t" + color);
        System.out.println("Phone storage:\t\t\t\t" + storage);
        System.out.println("Phone price:\t\t\t\t" + "$" + price);
        System.out.println("Phone has third camera:\t\t" + hasThirdCamera);

        color = "Silver";
        System.out.println();
        System.out.println();

        System.out.println("Information for the " + model);
        System.out.println(model + " is a " + brand + " phone");
        System.out.println("This phone comes in " + color + " and has " + storage + "GB of memory");
        System.out.println("Has a camera: " + hasThirdCamera);
        System.out.println("All of this just for $" + price);

    }

}
