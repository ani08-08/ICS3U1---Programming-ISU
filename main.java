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
            System.out.println("Chose a mode: (1/2/3/4/5) ");
            System.out.println(" 1. Admin");
            System.out.println(" 2. User");
            System.out.println(" 3. Update Cart");
            System.out.println(" 4. Checkout");
            System.out.println(" 5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: // Admin feature
                    System.out.println("Enter the password:     (Password: ilovecoding! )");
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
                                quantity += quantity;
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Sofas")) {
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
                                quantity += quantity;
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Beds")) {
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
                                quantity += quantity;
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Tables")) {
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
                                quantity += quantity;
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Wall Art")) {
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
                                quantity += quantity;
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Clocks")) {
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
                                quantity += quantity;
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
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
                                quantity += quantity;
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Pots & Pans")) {
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
                                quantity += quantity;
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Plates & Bowls")) {
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
                                quantity += quantity;
                                boolean found = false;
                                for (int i = 0; i < carts.size(); i++) {
                                    if (carts.get(i).startsWith("Coffee Machine")) {
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
                        }
                        else {
                            System.out.println("Invalid input");
                        }

                        System.out.println("Your cart: ");
                        for (String items : carts) {
                            System.out.println(items);
                        }
                    } else if (option.equals("remove")){
                        System.out.println("Select the one you want to remove: ");
                        int removeOption = sc.nextInt() - 1;
                        sc.nextLine();

                        if (removeOption >= 0 && removeOption < carts.size()) {
                            String item = carts.get(removeOption);
                            System.out.println("How many would you like to remove? ");
                            int removeQuantity = sc.nextInt();
                            sc.nextLine();

                            if (item.contains("Sofas")){
                                if (item.contains("x 1") && removeQuantity == 1) {
                                    carts.remove(removeOption);
                                    sofaStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 1) {
                                    carts.set(removeOption, "Sofas x1 --$" + sofa);
                                    sofaStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 2) {
                                    carts.remove(removeOption);
                                    sofaStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 1) {
                                    carts.set(removeOption, "Sofas x2 --$" + sofa * 2);
                                    sofaStock += 1;
                                }
                                else if (item.contains("x 3") && removeQuantity == 2) {
                                    carts.set(removeOption, "Sofas x1 --$" + sofa);
                                    sofaStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 3) {
                                    carts.remove(removeOption);
                                    sofaStock += 3;
                                }
                                else if (item.contains("x 4") && removeQuantity == 1) {
                                    carts.set(removeOption, "Sofas x3 --$" + sofa * 3);
                                    sofaStock += 1;
                                }
                                else if (item.contains("x 4") && removeQuantity == 2) {
                                    carts.set(removeOption, "Sofas x2 --$" + sofa * 2);
                                    sofaStock += 2;
                                }
                                else if (item.contains("x 4") && removeQuantity == 3) {
                                    carts.set(removeOption, "Sofas x1 --$" + sofa);
                                    sofaStock += 3;
                                }
                                else if (item.contains("x 4") && removeQuantity == 4) {
                                    carts.remove(removeOption);
                                    sofaStock += 4;
                                }
                                else System.out.println("Invalid quantity");
                            }
                            else if (item.contains("Beds")){
                                if (item.contains("x 1") && removeQuantity == 1) {
                                    carts.remove(removeOption);
                                    bedStock += 1;
                                }
                                else System.out.println("Invalid quantity to remove");
                            }
                            else if (item.contains("Tables")){
                                if (item.contains("x 1") && removeQuantity == 1) {
                                    carts.remove(removeOption);
                                    tableStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 1) {
                                    carts.set(removeOption, "Tables x1 --$" + tables);
                                    tableStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 2) {
                                    carts.remove(removeOption);
                                    tableStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 1) {
                                    carts.set(removeOption, "Tables x2 --$" + tables * 2);
                                    tableStock += 1;
                                }
                                else if (item.contains("x 3") && removeQuantity == 2) {
                                    carts.set(removeOption, "Tables x1 --$" + tables);
                                    tableStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 3) {
                                    carts.remove(removeOption);
                                    tableStock += 3;
                                }
                                else if (item.contains("x 4") && removeQuantity == 1) {
                                    carts.set(removeOption, "Tables x3 --$" + tables * 3);
                                    tableStock += 1;
                                }
                                else if (item.contains("x 4") && removeQuantity == 2) {
                                    carts.set(removeOption, "Tables x2 --$" + tables * 2);
                                    tableStock += 2;
                                }
                                else if (item.contains("x 4") && removeQuantity == 3) {
                                    carts.set(removeOption, "Tables x1 --$" + tables);
                                    tableStock += 3;
                                }
                                else if (item.contains("x 4") && removeQuantity == 4) {
                                    carts.remove(removeOption);
                                    tableStock += 4;
                                }
                                else if (item.contains("x 5") && removeQuantity == 1) {
                                    carts.set(removeOption, "Tables x4 --$" + tables * 4);
                                    tableStock += 1;
                                }
                                else if (item.contains("x 5") && removeQuantity == 2) {
                                    carts.set(removeOption, "Tables x3 --$" + tables * 3);
                                    tableStock += 2;
                                }
                                else if (item.contains("x 5") && removeQuantity == 3) {
                                    carts.set(removeOption, "Tables x2 --$" + tables * 2);
                                    tableStock += 3;
                                }
                                else if (item.contains("x 5") && removeQuantity == 4) {
                                    carts.set(removeOption, "Tables x1 --$" + tables);
                                    tableStock += 4;
                                }
                                else if (item.contains("x 5") && removeQuantity == 5) {
                                    carts.remove(removeOption);
                                    tableStock += 5;
                                }
                            }
                            else if (item.contains("Wall Art")){
                                if (item.contains("x 1") && removeQuantity == 1) {
                                    carts.remove(removeOption);
                                    wallArtStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 1) {
                                    carts.set(removeOption, "Wall Art x1 --$" + wallArt);
                                    wallArtStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 2) {
                                    carts.remove(removeOption);
                                    wallArtStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 1) {
                                    carts.set(removeOption, "Wall Art x2 --$" + wallArt * 2);
                                    wallArtStock += 1;
                                }
                                else if (item.contains("x 3") && removeQuantity == 2) {
                                    carts.set(removeOption, "Wall Art x1 --$" + wallArt);
                                    wallArtStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 3) {
                                    carts.remove(removeOption);
                                    wallArtStock += 3;
                                }
                            }
                            else if (item.contains("Clocks")){
                                if (item.contains("x 1") && removeQuantity == 1) {
                                    carts.remove(removeOption);
                                    clockStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 1) {
                                    carts.set(removeOption, "Clocks x1 --$" + clocks);
                                    clockStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 2) {
                                    carts.remove(removeOption);
                                    clockStock += 2;
                                }
                            }
                            else if (item.contains("Carpets")){
                                if (item.contains("x 1") && removeQuantity == 1) {
                                    carts.remove(removeOption);
                                    carpetStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 1) {
                                    carts.set(removeOption, "Carpets x1 --$" + carpets);
                                    carpetStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 2) {
                                    carts.remove(removeOption);
                                    carpetStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 1) {
                                    carts.set(removeOption, "Carpets x2 --$" + carpets * 2);
                                    carpetStock += 1;
                                }
                                else if (item.contains("x 3") && removeQuantity == 2) {
                                    carts.set(removeOption, "Carpets x1 --$" + carpets);
                                    carpetStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 3) {
                                    carts.remove(removeOption);
                                    carpetStock += 3;
                                }
                            }
                            else if (item.contains("Pots & Pans")){
                                if (item.contains("x 1") && removeQuantity == 1) {
                                    carts.remove(removeOption);
                                    potsPansStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 1) {
                                    carts.set(removeOption, "Pots & Pans x1 --$" + potsPans);
                                    potsPansStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 2) {
                                    carts.remove(removeOption);
                                    potsPansStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 1) {
                                    carts.set(removeOption, "Pots & Pans x2 --$" + potsPans * 2);
                                    potsPansStock += 1;
                                }
                                else if (item.contains("x 3") && removeQuantity == 2) {
                                    carts.set(removeOption, "Pots & Pans x1 --$" + potsPans);
                                    potsPansStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 3) {
                                    carts.remove(removeOption);
                                    potsPansStock += 3;
                                }
                            }
                            else if (item.contains("Plates & Bowls")){
                                if (item.contains("x 1") && removeQuantity == 1) {
                                    carts.remove(removeOption);
                                    platesBowlStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 1) {
                                    carts.set(removeOption, "Plates & Bowls x1 --$" + platesBowls);
                                    platesBowlStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 2) {
                                    carts.remove(removeOption);
                                    platesBowlStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 1) {
                                    carts.set(removeOption, "Plates & Bowls x2 --$" + platesBowls * 2);
                                    platesBowlStock += 1;
                                }
                                else if (item.contains("x 3") && removeQuantity == 2) {
                                    carts.set(removeOption, "Plates & Bowls x1 --$" + platesBowls);
                                    platesBowlStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 3) {
                                    carts.remove(removeOption);
                                    platesBowlStock += 3;
                                }
                            }
                            else if (item.contains("Coffee Machine")){
                                if (item.contains("x 1") && removeQuantity == 1) {
                                    carts.remove(removeOption);
                                    coffeeMachineStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 1) {
                                    carts.set(removeOption, "Coffee Machine x1 --$" + coffeeMachine);
                                    coffeeMachineStock += 1;
                                }
                                else if (item.contains("x 2") && removeQuantity == 2) {
                                    carts.remove(removeOption);
                                    coffeeMachineStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 1) {
                                    carts.set(removeOption, "Coffee Machine x2 --$" + coffeeMachine * 2);
                                    coffeeMachineStock += 1;
                                }
                                else if (item.contains("x 3") && removeQuantity == 2) {
                                    carts.set(removeOption, "Coffee Machine x1 --$" + coffeeMachine);
                                    coffeeMachineStock += 2;
                                }
                                else if (item.contains("x 3") && removeQuantity == 3) {
                                    carts.remove(removeOption);
                                    coffeeMachineStock += 3;
                                }
                                else if (item.contains("x 4") && removeQuantity == 1) {
                                    carts.set(removeOption, "Coffee Machine x3 --$" + coffeeMachine * 3);
                                    coffeeMachineStock += 1;
                                }
                                else if (item.contains("x 4") && removeQuantity == 2) {
                                    carts.set(removeOption, "Coffee Machine x2 --$" + coffeeMachine * 2);
                                    coffeeMachineStock += 2;
                                }
                                else if (item.contains("x 4") && removeQuantity == 3) {
                                    carts.set(removeOption, "Coffee Machine x1 --$" + coffeeMachine);
                                    coffeeMachineStock += 3;
                                }
                                else if (item.contains("x 4") && removeQuantity == 4) {
                                    carts.remove(removeOption);
                                    coffeeMachineStock += 4;
                                }
                                else if (item.contains("x 5") && removeQuantity == 1) {
                                    carts.set(removeOption, "Coffee Machine x4 --$" + coffeeMachine * 4);
                                    coffeeMachineStock += 1;
                                }
                                else if (item.contains("x 5") && removeQuantity == 2) {
                                    carts.set(removeOption, "Coffee Machine x3 --$" + coffeeMachine * 3);
                                    coffeeMachineStock += 2;
                                }
                                else if (item.contains("x 5") && removeQuantity == 3) {
                                    carts.set(removeOption, "Coffee Machine x2 --$" + coffeeMachine * 2);
                                    coffeeMachineStock += 3;
                                }
                                else if (item.contains("x 5") && removeQuantity == 4) {
                                    carts.set(removeOption, "Coffee Machine x1 --$" + coffeeMachine);
                                    coffeeMachineStock += 4;
                                }
                                else if (item.contains("x 5") && removeQuantity == 5) {
                                    carts.remove(removeOption);
                                    coffeeMachineStock += 5;
                                }
                            }
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
                case 4: // Adding the total amount and giving the invoice
                    System.out.println("Invoice: ");
                    double total = 0;
                    String details = "Details: ";

                    for (String items : carts) {
                        System.out.println(items);
                        // Sofas
                        if (items.contains("Sofas")) {
                            if (items.contains("x 1")) total += sofa;
                            else if (items.contains("x 2")) total += sofa * 2;
                            else if (items.contains("x 3")) total += sofa * 3;
                            else if (items.contains("x 4")) total += sofa * 4;
                        }
                        // Beds
                        if (items.contains("Beds")) {
                            if (items.contains("x 1")) total += beds;
                            else if (items.contains("x 2")) total += beds * 2;
                            else if (items.contains("x 3")) total += beds * 3;
                            else if (items.contains("x 4")) total += beds * 4;
                        }
                        // Tables
                        if (items.contains("Tables")) {
                            if (items.contains("x 1")) total += tables;
                            else if (items.contains("x 2")) total += tables * 2;
                            else if (items.contains("x 3")) total += tables * 3;
                            else if (items.contains("x 4")) total += tables * 4;
                            else if (items.contains("x 5")) total += tables * 5;
                        }
                        // Wall Art
                        if (items.contains("Wall Art")) {
                            if (items.contains("x 1")) total += wallArt;
                            else if (items.contains("x 2")) total += wallArt * 2;
                            else if (items.contains("x 3")) total += wallArt * 3;
                        }
                        // Clocks
                        if (items.contains("Clocks")) {
                            if (items.contains("x 1")) total += clocks;
                            else if (items.contains("x 2")) total += clocks * 2;
                        }
                        // Carpets
                        if (items.contains("Carpets")) {
                            if (items.contains("x 1")) total += carpets;
                            else if (items.contains("x 2")) total += carpets * 2;
                            else if (items.contains("x 3")) total += carpets * 3;
                        }
                        // Pots & Pans
                        if (items.contains("Pots & Pans")) {
                            if (items.contains("x 1")) total += potsPans;
                            else if (items.contains("x 2")) total += potsPans * 2;
                            else if (items.contains("x 3")) total += potsPans * 3;
                        }
                        // Plates & Bowls
                        if (items.contains("Plates & Bowls")) {
                            if (items.contains("x 1")) total += platesBowls;
                            else if (items.contains("x 2")) total += platesBowls * 2;
                            else if (items.contains("x 3")) total += platesBowls * 3;
                        }
                        // Coffee Machine
                        if (items.contains("Coffee Machine")) {
                            if (items.contains("x 1")) total += coffeeMachine;
                            else if (items.contains("x 2")) total += coffeeMachine * 2;
                            else if (items.contains("x 3")) total += coffeeMachine * 3;
                            else if (items.contains("x 4")) total += coffeeMachine * 4;
                            else if (items.contains("x 5")) total += coffeeMachine * 5;
                        }
                        details += items + " ";
                    }
                    System.out.println("Total: $" + total);

                    System.out.println("Confirm purchase? | yes/no");
                    String confirm = sc.nextLine().toLowerCase();

                    if (confirm.equals("yes")) {
                        orders.add("Order: " + details);
                        System.out.println("Purchase complete! Thank you!");
                    }
                    break;

                case 5: // Farewell Message!
                    System.out.println("Thank you for joining!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
                    break;
            }

        }
    }
}
