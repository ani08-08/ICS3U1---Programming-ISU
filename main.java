import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> carts = new ArrayList<>();


        // Prices for items
        double sofa = 450.99;
        double beds = 350.90;
        double tables = 245.00; // furniture
        double wallArt = 45.90;
        double clocks = 6.99;
        double carpets = 67.00; // home decor
        double potsPans = 54.00;
        double platesBowls = 15.99;
        double coffeeMachine = 70.00; // kitchen

        // Inventory for items
        int sofaStock = 4;
        int bedStock = 1;
        int tableStock = 5; // furniture
        int wallArtStock = 3;
        int clockStock = 2;
        int carpetStock = 3; // home decor
        int potsPansStock = 3;
        int platesBowlStock = 1;
        int coffeeMachineStock = 5; // kitchen

        int input = 0;
        int quantity = 0;


        while (true) {
            System.out.println("Chose a mode: ");
            System.out.println(" 1. Admin");
            System.out.println(" 2. User");
            System.out.println(" 3. Update Cart");
            System.out.println(" 4. Checkout");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // Admin feature
                    System.out.println("Enter the password:     (Password: ilovecoding! ");
                    break;

                case 2: // User feature
                    System.out.println("Welcome to Vintique Furniture Store! ");
                    System.out.println("Here are the categories: Furniture, Home Decor, Kitchen ");
                    System.out.println("Which one would you like to buy from?");
                    String category = sc.nextLine().toLowerCase();

                    if (category.equals("furniture")) { // List of categories for FURNITURE
                        System.out.println("Item 1: Sofas    Price: $450.99    Availability: " + sofaStock);
                        if (sofaStock == 0) {
                            System.out.println("Out of Stock");
                        }
                        System.out.println("Item 2: Beds     Price: $350.90   Availability: " + bedStock);
                        if (bedStock == 0) {
                            System.out.println("Out of Stock");
                        }
                        System.out.println("Item 3: Tables   Price: $245.00    Availability: " + tableStock);
                        if (tableStock == 0) {
                            System.out.println("Out of Stock");
                        }

                        // Ask for their input
                        System.out.println("Enter the item you want to add to your cart (1/2/3) : ");
                        input = sc.nextInt();
                        System.out.println("Enter the number of the item you want: ");
                        quantity = sc.nextInt();
                        sc.nextLine(); // consume the next line

                        // Adding the user's order's to cart
                        if (input == 1 && quantity <= sofaStock) {
                            carts.add("Sofas x " + quantity + " -- $" + (sofa * quantity));
                            sofaStock = sofaStock - quantity;
                        } else if (input == 2 && quantity <= bedStock) {
                            carts.add("Beds x " + quantity + " -- $" + (beds * quantity));
                            bedStock = bedStock - quantity;
                        } else if (input == 3 && quantity <= tableStock) {
                            carts.add("Tables x " + quantity + " -- $" + (tables * quantity));
                            tableStock = tableStock - quantity;
                        } else {
                            System.out.println("Invalid input or not enough in stock");
                        }

                    } else if (category.equals("home decor")) {
                        System.out.println("Item 1: Wall Art   Price: $45.90    Availability: " + wallArtStock);
                        if (wallArtStock == 0) {
                            System.out.println("Out of Stock");
                        }
                        System.out.println("Item 2: Clocks     Price: $6.99     Availability: " + clockStock);
                        if (clockStock == 0) {
                            System.out.println("Out of Stock");
                        }
                        System.out.println("Item 3: Carpets    Price: $67.00    Availability: " + carpetStock);
                        if (carpetStock == 0) {
                            System.out.println("Out of Stock");
                        }

                        // Ask for their input
                        System.out.println("Enter the item you want to add to your cart: ");
                        input = sc.nextInt();
                        System.out.println("Enter the number of the item you want: ");
                        quantity = sc.nextInt();
                        sc.nextLine(); //Consume the next line

                        // Adding the user's order's to cart
                        if (input == 1 && quantity <= wallArtStock) {
                            carts.add("Wall Art x " + quantity + " -- $" + (wallArt * quantity));
                            wallArtStock = wallArtStock - quantity;
                        } else if (input == 2 && quantity <= clockStock) {
                            carts.add("Clocks x " + quantity + " -- $" + (clocks * quantity));
                            clockStock = clockStock - quantity;
                        } else if (input == 3 && quantity <= carpetStock) {
                            carts.add("Carpets x " + quantity + " -- $" + (carpets * quantity));
                            carpetStock = carpetStock - quantity;
                        } else {
                            System.out.println("Invalid input or not enough in stock");
                        }

                    } else if (category.equals("kitchen")) {
                        System.out.println("Item 1: Pots & Pans       Price: $54.00    Availability: " + potsPansStock);
                        if (potsPansStock == 0) {
                            System.out.println("Out of Stock");
                        }
                        System.out.println("Item 2: Plates & Bowls    Price: $15.99    Availability: " + platesBowlStock);
                        if (platesBowlStock == 0) {
                            System.out.println("Out of Stock");
                        }
                        System.out.println("Item 3: Coffee Machine    Price: $70.00    Availability: " + coffeeMachineStock);
                        if (coffeeMachineStock == 0) {
                            System.out.println("Out of Stock");
                        }

                        // Ask for their input
                        System.out.println("Enter the item you want to add to your cart: ");
                        input = sc.nextInt();
                        System.out.println("Enter the number of the item you want: ");
                        quantity = sc.nextInt();
                        sc.nextLine();

                        // Adding the user's order's to cart
                        if (input == 1 && quantity <= potsPansStock) {
                            carts.add("Pots & Pans x " + quantity + " -- $" + (potsPans * quantity));
                            potsPansStock = potsPansStock - quantity;
                        } else if (input == 2 && quantity <= platesBowlStock) {
                            carts.add("Plates & Bowls x " + quantity + " -- $" + (platesBowls * quantity));
                            platesBowlStock = platesBowlStock - quantity;
                        } else if (input == 3 && quantity <= coffeeMachineStock) {
                            carts.add("Coffee Machine x " + quantity + " -- $" + (coffeeMachine * quantity));
                            coffeeMachineStock = coffeeMachineStock - quantity;
                        } else {
                            System.out.println("Invalid input or not enough in stock");
                        }
                    } else {
                        System.out.println("Invalid input");
                    }
                    System.out.println("Your cart: ");
                    for (String items : carts) {
                        System.out.println(items);
                        break;
                    }
                case 3: // Update cart feature
                    System.out.println("Would you like to update or remove items? | Options: update/remove" );
                    String
            }
        }
    }
}