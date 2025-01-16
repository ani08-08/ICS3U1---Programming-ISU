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
        int input = 0;
        int quantity = 0;

        if (role.equals("user")) {
            System.out.println("Welcome to Vintique Furniture Store!");

            boolean shopping = true;
            // Loop for browsing products

            while (shopping) {
                System.out.println("Here are the categories: Furniture, Home Decor, Kitchen ");
                System.out.println("Which one would you like to buy from?");
                System.out.println("If you wish to stop shopping, enter 'exit'");
                category = sc.nextLine().toLowerCase();

                if (category.equals("exit")) {
                    // exit the loop
                    shopping = false;

                    // List of items for FURNITURE
                } else if (category.equals("furniture")) {
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

                    // List of items for HOME DECOR
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

                    // List of items for KITCHEN
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
                    System.out.println("Invalid Category, try again.");
                }

                // Print out the cart after each addition
                System.out.println("Your cart: ");
                for (String items : carts) {
                    System.out.println(items);
                }
            }

            System.out.println("Would you like to continue as user or switch to admin?");
            String switchRoles = sc.nextLine().toLowerCase();
            if (switchRoles.equals("user")){
                // Updating & removing option
                System.out.println("Would you like to change your cart? | Options: update/remove/none ");
                String update = sc.nextLine().toLowerCase();

                // Update option
                if (update.equals("update")) {
                    System.out.println("Here are the items in your cart: ");
                    for (int i = 0; i < carts.size(); i++) {
                        System.out.println((i + 1) + ": " + carts.get(i));
                    }

                    System.out.println("Do you want to add or update quantities in your cart? | add/update");
                    String options = sc.nextLine().toLowerCase();

                    if (options.equals("update")) {

                        System.out.println("Which number do you want to update? ");
                        int index = sc.nextInt() - 1; // For the array index to align
                        sc.nextLine(); // Consume the next line

                        System.out.println("Enter the new quantity you want:  ");
                        int newQuantity = sc.nextInt();
                        sc.nextLine(); // Consume the next line

                        String item = carts.get(index);

                        // Get the name of the item
                        String itemName = "";
                        for (int i = 0; i < item.length(); i++) {
                            if (item.charAt(i) == 'x') {
                                itemName = item.substring(0, i - 1).toLowerCase();
                                break;
                            }
                        }

                        boolean updating = false;

                        // Update cart for FURNITURE
                        if (itemName.equals("sofas") && newQuantity <= sofaStock + quantity) {
                            sofaStock = sofaStock + quantity - newQuantity;
                            carts.set(index, "Sofas x" + newQuantity + "-- $" + (sofa * newQuantity));
                            updating = true;
                        } else if (itemName.equals("beds") && newQuantity <= bedStock + quantity) {
                            bedStock = bedStock + quantity - newQuantity;
                            carts.set(index, "Beds x" + newQuantity + "-- $" + (beds * newQuantity));
                            updating = true;
                        } else if (itemName.equals("tables") && newQuantity <= tableStock + quantity) {
                            tableStock = tableStock + quantity - newQuantity;
                            carts.set(index, "Tables x" + newQuantity + "-- $" + (tables * newQuantity));
                            updating = true;
                        }

                        // Update cart for HOME DECOR
                        if (itemName.equals("wall art") && newQuantity <= wallArtStock + quantity) {
                            wallArtStock = wallArtStock + quantity - newQuantity;
                            carts.set(index, "Wall Art x" + newQuantity + "-- $" + (wallArt * newQuantity));
                            updating = true;
                        } else if (itemName.equals("clocks") && newQuantity <= clockStock + quantity) {
                            clockStock = clockStock + quantity - newQuantity;
                            carts.set(index, "Clocks x" + newQuantity + "-- $" + (clocks * newQuantity));
                            updating = true;
                        } else if (itemName.equals("carpet") && newQuantity <= carpetStock + quantity) {
                            carpetStock = carpetStock + quantity - newQuantity;
                            carts.set(index, "Carpet x" + newQuantity + "-- $" + (carpets * newQuantity));
                            updating = true;
                        }

                        // Update cart for KITCHEN
                        if (itemName.equals("pots & pans") && newQuantity <= potsPansStock + quantity) {
                            potsPansStock = potsPansStock + quantity - newQuantity;
                            carts.set(index, "Pots & Pans x" + newQuantity + "-- $" + (potsPans * newQuantity));
                            updating = true;
                        } else if (itemName.equals("plates & bowls") && newQuantity <= platesBowlStock + quantity) {
                            platesBowlStock = platesBowlStock + quantity - newQuantity;
                            carts.set(index, "Plates & Bowls x" + newQuantity + "-- $" + (platesBowls * newQuantity));
                            updating = true;
                        } else if (itemName.equals("coffee machine") && newQuantity <= coffeeMachineStock + quantity) {
                            coffeeMachineStock = coffeeMachineStock + quantity - newQuantity;
                            carts.set(index, "Coffee Machine x" + newQuantity + "-- $" + (coffeeMachine * newQuantity));
                            updating = true;
                        }

                        if (!updating) {
                            System.out.println("Invalid response or not enough stock");
                        }
                    } else if (options.equals("add")) {
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

                            System.out.println("Enter the number of the item you want to add (1/2/3");
                            int option = sc.nextInt();

                            System.out.println("Enter the quantity: ");
                            int amount = sc.nextInt();
                            sc.nextLine(); // Consume the next line

                        } else if (categories == 2) {
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
                        } else if (categories == 3) {
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

                            System.out.println("Enter the number of the item you want to add (1/2/3");
                            int option = sc.nextInt();

                            System.out.println("Enter the quantity: ");
                            int amount = sc.nextInt();
                            sc.nextLine(); // Consume the next line

                            if (categories == 1) {
                                if (option == 1 && amount <= sofaStock) {
                                    carts.add("Sofas x " + quantity + " -- $" + (sofa * quantity));
                                    sofaStock -= quantity;
                                } else if (option == 2 && amount <= bedStock) {
                                    carts.add("Beds x " + quantity + " -- $" + (beds * quantity));
                                    bedStock -= quantity;
                                } else if (option == 3 && amount <= tableStock) {
                                    carts.add("Tables x " + quantity + " -- $" + (tables * quantity));
                                    tableStock -= quantity;
                                } else {
                                    System.out.println("Invalid input or not enough in stock");
                                }
                            } else if (categories == 3) {
                                if (option == 1 && amount <= potsPansStock) {
                                    carts.add("Pots & Pans x " + quantity + " -- $" + (potsPans * quantity));
                                    potsPansStock -= quantity;
                                } else if (option == 2 && amount <= platesBowlStock) {
                                    carts.add("Plates & Bowls x " + quantity + " -- $" + (platesBowls * quantity));
                                    platesBowlStock -= quantity;
                                } else if (option == 3 && amount <= coffeeMachineStock) {
                                    carts.add("Coffee Machine x " + quantity + " -- $" + (coffeeMachine * quantity));
                                    coffeeMachineStock -= quantity;
                                } else {
                                    System.out.println("Invalid input or not enough in stock");
                                }
                            }

                        }

            }

                    // Remove option
                } else if (update.equals("remove")) {
                    System.out.println("Here are the items in your cart: ");
                    for (int i = 0; i < carts.size(); i++) {
                        System.out.println((i + 1) + ": " + carts.get(i));
                    }

                    System.out.println("Enter the number of item you want to remove : ");
                    int index = sc.nextInt() - 1;
                    sc.nextLine(); // Consume the new line

                    String removedItem = carts.get(index); // Get the item that they want removed

                    // Update the stock
                    if (removedItem.startsWith("sofas")) {
                        sofaStock += quantity;
                    } else if (removedItem.startsWith("beds")) {
                        bedStock += quantity;
                    } else if (removedItem.startsWith("tables")) {
                        tableStock += quantity;
                    } else if (removedItem.startsWith("wall art")) {
                        wallArtStock += quantity;
                    } else if (removedItem.startsWith("clocks")) {
                        clockStock += quantity;
                    } else if (removedItem.startsWith("carpets")) {
                        carpetStock += quantity;
                    } else if (removedItem.startsWith("pots & pans")) {
                        potsPansStock += quantity;
                    } else if (removedItem.startsWith("plates & bowls")) {
                        potsPansStock += quantity;
                    } else if (removedItem.startsWith("coffee machine")) {
                        coffeeMachineStock += quantity;
                    }

                    // Remove item from the cart
                    carts.remove(index);
                    System.out.println("Item removed successfully!");

                    // Here's your updated cart
                    for (String items : carts) {
                        System.out.println(items);
                    }

                    System.out.println("Would you like to proceed to checkout? ");
                    String question = sc.nextLine();

                    if (question.equals("yes")) {
                        if (!carts.isEmpty()) {
                            System.out.println("Check out");
                            double total = 0;

                            System.out.println("Your invoice: ");
                            for (String items : carts) {
                                System.out.println(items);

                                if (items.startsWith("sofas")) {
                                    total += sofa * quantity;
                                } else if (items.startsWith("beds")) {
                                    total += beds * quantity;
                                } else if (items.startsWith("tables")) {
                                    total += tables * quantity;
                                } else if (items.startsWith("wall art")) {
                                    total += wallArt * quantity;
                                } else if (items.startsWith("clocks")) {
                                    total += clocks * quantity;
                                } else if (items.startsWith("carpets")) {
                                    total += carpets * quantity;
                                } else if (items.startsWith("pots & pans")) {
                                    total += potsPans * quantity;
                                } else if (items.startsWith("plates & bowls")) {
                                    total += platesBowls * quantity;
                                } else if (items.startsWith("coffee machine")) {
                                    total += coffeeMachine * quantity;
                                }
                            }
                            System.out.println("Your total is: $" + total);

                            System.out.println("Would you like to confirm your order? (yes/no)");
                            String confirmation = sc.nextLine();
                            if (confirmation.equals("yes")) {
                                System.out.println("Order confirmed, thank you! ");
                            }


                        }
                    }


                }

            } else {
                System.out.println("Invalid User type");
            }
        }
    }
}



