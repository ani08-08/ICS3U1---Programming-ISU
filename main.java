import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> carts = new ArrayList<>();


        // Declare variables for my products and stock available
        double sofa = 450.99;
        double beds = 350.90;
        double tables = 245.00;
        double wallArt = 45.90;
        double clocks = 6.99;
        double carpets = 67.00;
        double potsPans = 54.00;
        double platesBowls = 15.99;
        double coffeeMachine = 70.00;

        int sofaStock = 4;
        int bedStock = 1;
        int tableStock = 5;
        int wallArtStock = 3;
        int clockStock = 2;
        int carpetStock = 3;
        int potsPansStock = 3;
        int platesBowlStock = 1;
        int coffeeMachineStock = 5;

        // Ask what role they want
        System.out.println("Admin or User?");
        String role = sc.nextLine().toLowerCase();

        String category = "";
        String input = "";
        int quantity = 0;

        if (role.equals("user")) {
            System.out.println("Welcome to Vintique Furniture Store!");

            boolean shopping = true;
            // Loop for browsing products

            while (shopping){
                System.out.println("Here are the categories: Furniture, Home Decor, Kitchen ");
                System.out.println("Which one would you like to buy from? (type 'exit' to quit the program)");
                category = sc.nextLine().toLowerCase();

                if (category.equals("exit")) {
                    // exit the loop
                    shopping = false;

                    // List of items for FURNITURE
                } else if (category.equals("furniture")) {
                    System.out.println("Item: Sofas    Price: $450.99    Availability: 4");
                    System.out.println("Item: Beds     Price: $350.90   Availability: 1");
                    System.out.println("Item: Tables   Price: $245.00    Availability: 5");

                    System.out.println("Enter the item you want to add to your cart: ");
                    input = sc.nextLine().toLowerCase();
                    System.out.println("Enter the number of the item you want: ");
                    quantity = sc.nextInt();
                    sc.nextLine(); // consume the next line

                    // Adding the user's order's to cart
                    if (input.equals("sofas") && quantity <= sofaStock) {
                        carts.add("Sofas x " + quantity + " -- $" + (sofa * quantity));
                        sofaStock = sofaStock - quantity;
                    } else if (input.equals("beds") && quantity <= bedStock) {
                        carts.add("Beds x " + quantity + " -- $" + (beds * quantity));
                        bedStock = bedStock - quantity;
                    } else if (input.equals("table") && quantity <= tableStock) {
                        carts.add("Tables x " + quantity + " -- $" + (tables * quantity));
                        tableStock = tableStock - quantity;
                    } else {
                        System.out.println("Invalid input or not enough in stock");
                    }

                    // List of items for HOME DECOR
                } else if (category.equals("home decor")) {
                    System.out.println("Item: Wall Art   Price: $45.90    Availability: 3");
                    System.out.println("Item: Clocks     Price: $6.99     Availability: 2");
                    System.out.println("Item: Carpets    Price: $67.00    Availability: 3");

                    System.out.println("Enter the item you want to add to your cart: ");
                    input = sc.nextLine().toLowerCase();
                    System.out.println("Enter the number of the item you want: ");
                    quantity = sc.nextInt();
                    sc.nextLine(); //Consume's the next line

                    // Adding the user's order's to cart
                    if (input.equals("wall art") && quantity <= wallArtStock) {
                        carts.add("Wall Art x " + quantity + " -- $" + (wallArt * quantity));
                        wallArtStock = wallArtStock - quantity;
                    } else if (input.equals("clocks") && quantity <= clockStock) {
                        carts.add("Clocks x " + quantity + " -- $" + (clocks * quantity));
                        clockStock = clockStock - quantity;
                    } else if (input.equals("carpets") && quantity <= carpetStock) {
                        carts.add("Carpets x " + quantity + " -- $" + (carpets * quantity));
                        carpetStock = carpetStock - quantity;
                    } else {
                        System.out.println("Invalid input or not enough in stock");
                    }

                    // List of items for KITCHEN
                } else if (category.equals("kitchen")) {
                    System.out.println("Item: Pots & Pans       Price: $54.00    Availability: 3");
                    System.out.println("Item: Plates & Bowls    Price: $15.99    Availability: 1");
                    System.out.println("Item: Coffee Machine    Price: $70.00    Availability: 5");

                    System.out.println("Enter the item you want to add to your cart: ");
                    input = sc.nextLine().toLowerCase();
                    System.out.println("Enter the number of the item you want: ");
                    quantity = sc.nextInt();
                    sc.nextLine();

                    // Adding the user's order's to cart
                    if (input.equals("pots & pans") && quantity <= potsPansStock) {
                        carts.add("Pots & Pans x " + quantity + " -- $" + (potsPans * quantity));
                        potsPansStock = potsPansStock - quantity;
                    } else if (input.equals("plates & bowls") && quantity <= platesBowlStock) {
                        carts.add("Plates & Bowls x " + quantity + " -- $" + (platesBowls * quantity));
                        platesBowlStock = platesBowlStock - quantity;
                    } else if (input.equals("coffee machine") && quantity <= coffeeMachineStock) {
                        carts.add("Coffee Machine x " + quantity + " -- $" + (coffeeMachine * quantity));
                        coffeeMachineStock = coffeeMachineStock - quantity;
                    } else {
                        System.out.println("Invalid input or not enough in stock");
                    }
                }
                else {
                    System.out.println("Invalid Category, try again.");
                }

                // Print out the cart after each addition
                System.out.println("Your cart: ");
                for (String items : carts){
                    System.out.println(items);
                }
            }
        } else {
            System.out.println("Invalid User type");
        }
    }
}


