import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> carts = new ArrayList<>();
        ArrayList<String> orders = new ArrayList<>();


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
            System.out.println(" 4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // Admin feature
                    System.out.println("Enter the password:     (Password: ilovecoding! ");
                    String password = sc.nextLine();

                    if (password.equals("ilovecoding!")){
                        System.out.println("Welcome to the admin panel");
                        if (orders.isEmpty()){
                            System.out.println("No orders to process.");
                        } else {
                            System.out.println("Orders to be shipped: " + orders.size());
                            System.out.println("Orders list: ");
                            for (int i = 0; i < orders.size(); i++){
                                System.out.println(((i + 1) + "." + orders.get(i)) + " ");

                            }

                            System.out.println("Enter the number of the order to mark as shipped, or 0 to return.");
                            int orderToShip = sc.nextInt();
                            sc.nextLine();// Consume next line

                            if (orderToShip > 0 && orderToShip <= orders.size()){
                                String shippedOrder = orders.remove(orderToShip -1);
                                System.out.println("Order " + shippedOrder + " marked as shipped!");
                            } else if (orderToShip == 0){
                                System.out.println("Returning to main menu...");
                            } else {
                                System.out.println("Invalid order number");
                            }
                        }

                } else {
                        System.out.println("Incorrect password.");
                    }
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

                    }
                    break;
                case 3: // Update cart feature
                    System.out.println("Would you like to update, remove or add items? | Options: update/remove");
                    String option = sc.nextLine().toLowerCase();

                    System.out.println("Here are the items in your cart: ");
                    for (int i = 0; i < carts.size(); i++) {
                        System.out.println((i + 1) + ": " + carts.get(i));
                    }

                    if (option.equals("update")) {
                        System.out.println("Available Categories: ");
                        System.out.println(" 1. Furniture     2. Home Decor      3. Kitchen");
                        System.out.println("Choose a category (1/2/3)");
                        int categories = sc.nextInt();


                        if (categories == 1) {
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
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Sofas")) {
                                        quantity += quantity;
                                        carts.remove(i);
                                        carts.add("Sofas x " + quantity + " -- $" + (sofa * quantity));
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    carts.add("Sofas x " + quantity + " -- $" + (sofa * quantity));
                                }
                                sofaStock = sofaStock - quantity;
                            } else if (input == 2 && quantity <= bedStock) {
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Beds")) {
                                        quantity += quantity;
                                        carts.remove(i);
                                        carts.add("Beds x " + quantity + " -- $" + (beds * quantity));
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    carts.add("Beds x " + quantity + " -- $" + (beds * quantity));
                                }
                                bedStock = bedStock - quantity;
                            } else if (input == 3 && quantity <= tableStock) {
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Tables")) {
                                        quantity += quantity;
                                        carts.remove(i);
                                        carts.add("Tables x " + quantity + " -- $" + (tables * quantity));
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    carts.add("Tables x " + quantity + " -- $" + (tables * quantity));
                                }
                                tableStock = tableStock - quantity;
                            } else {
                                System.out.println("Invalid input or not enough in stock");
                            }

                        } else if (categories == 2) {
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
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Wall Art")) {
                                        quantity += quantity;
                                        carts.remove(i);
                                        carts.add("Wall Art x " + quantity + " -- $" + (wallArt * quantity));
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    carts.add("Wall Art x " + quantity + " -- $" + (wallArt * quantity));
                                }
                                wallArtStock = wallArtStock - quantity;
                            } else if (input == 2 && quantity <= clockStock) {
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Clocks")) {
                                        quantity += quantity;
                                        carts.remove(i);
                                        carts.add("Clocks x " + quantity + " -- $" + (clocks * quantity));
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    carts.add("Clocks x " + quantity + " -- $" + (clocks * quantity));
                                }
                                clockStock = clockStock - quantity;
                            } else if (input == 3 && quantity <= carpetStock) {
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    quantity += quantity;
                                    if (carts.get(i).startsWith("Carpet")) {
                                        carts.remove(i);
                                        carts.add("Carpet x " + quantity + " -- $" + (carpets * quantity));
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    carts.add("Carpets x " + quantity + " -- $" + (carpets * quantity));
                                }
                                carpetStock = carpetStock - quantity;
                            } else {
                                System.out.println("Invalid input or not enough in stock");
                            }

                        } else if ((categories == 3)) {
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
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Pots & Pans")) {
                                        quantity += quantity;
                                        carts.remove(i);
                                        carts.add("Pots & Pans x " + quantity + " -- $" + (potsPans * quantity));
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    carts.add("Pots & Pans x " + quantity + " -- $" + (potsPans * quantity));
                                }
                                potsPansStock = potsPansStock - quantity;
                            } else if (input == 2 && quantity <= platesBowlStock) {
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Plates & Bowls")) {
                                        quantity += quantity;
                                        carts.remove(i);
                                        carts.add("Plates & Bowls x " + quantity + " -- $" + (platesBowls * quantity));
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    carts.add("Plates & Bowls x " + quantity + " -- $" + (platesBowls * quantity));
                                }
                                platesBowlStock = platesBowlStock - quantity;
                            } else if (input == 3 && quantity <= coffeeMachineStock) {
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Coffee Machine")) {
                                        quantity += quantity;
                                        carts.remove(i);
                                        carts.add("Coffee Machine x " + quantity + " -- $" + (coffeeMachine * quantity));
                                        found = true;
                                        break;
                                    }
                                }
                                if (!found) {
                                    carts.add("Coffee Machine x " + quantity + " -- $" + (coffeeMachine * quantity));
                                }
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

                        }
                    } else if (option.equals("remove")) { // Remove option
                        System.out.println("Select the one you want to remove: ");
                        int removeOption = sc.nextInt() - 1;
                        sc.nextLine();

                        if (removeOption >= 0 && removeOption < carts.size()) {
                            carts.remove(removeOption);
                            System.out.println("Item removed successfully!");
                        } else {
                            System.out.println("Invalid number!");
                        }

                        // Here's your updated cart
                        for (String items : carts) {
                            System.out.println(items);
                        }

                    }
                    break;
                case 4:
                    System.out.println("Invoice: ");
                    double total = 0;
                    String details = (" Details:   " );

                    for (String items : carts){
                        System.out.println(items);
                        if (items.contains("Sofas")) total += sofa;
                        if (items.contains("Beds")) total += beds;
                        if (items.contains("Tables")) total += tables;
                        if (items.contains("Wall Art")) total += wallArt;
                        if (items.contains("Clocks")) total += clocks;
                        if (items.contains("Pots & Pans")) total += potsPans;
                        if (items.contains("Plates & Bowls")) total += platesBowls;
                        if (items.contains("Coffee Machine")) total += coffeeMachine;

                        details += items + "";
                    }

                    System.out.println("Total: $" + total);
                    System.out.println("Confirm purchase? | yes/no");
                    String confirm = sc.nextLine().toLowerCase();

                    if (confirm.equals("yes")){
                        orders.add("Order: " + details) ;
                        System.out.println("Purchase complete! Thank you!");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for joining!");
                    break;

                default:
                    System.out.println("Invalid choice");
                    sc.close();

            }
        }
    }
}
