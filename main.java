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
                    System.out.println("Item: Sofas    Price: $450.99    Availability: " + sofaStock);
                    if (sofaStock == 0){
                        System.out.println("Out of Stock");
                    }
                    System.out.println("Item: Beds     Price: $350.90   Availability: " + bedStock);
                    if (bedStock == 0){
                        System.out.println("Out of Stock");
                    }
                    System.out.println("Item: Tables   Price: $245.00    Availability: " + tableStock);
                    if (tableStock == 0){
                        System.out.println("Out of Stock");
                    }

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
                    } else if (input.equals("tables") && quantity <= tableStock) {
                        carts.add("Tables x " + quantity + " -- $" + (tables * quantity));
                        tableStock = tableStock - quantity;
                    } else {
                        System.out.println("Invalid input or not enough in stock");
                    }

                    // List of items for HOME DECOR
                } else if (category.equals("home decor")) {
                    System.out.println("Item: Wall Art   Price: $45.90    Availability: " + wallArtStock);
                    if (wallArtStock == 0){
                        System.out.println("Out of Stock");
                    }
                    System.out.println("Item: Clocks     Price: $6.99     Availability: " + clockStock);
                    if (clockStock == 0){
                        System.out.println("Out of Stock");
                    }
                    System.out.println("Item: Carpets    Price: $67.00    Availability: " + carpetStock);
                    if (carpetStock == 0){
                        System.out.println("Out of Stock");
                    }

                    System.out.println("Enter the item you want to add to your cart: ");
                    input = sc.nextLine().toLowerCase();
                    System.out.println("Enter the number of the item you want: ");
                    quantity = sc.nextInt();
                    sc.nextLine(); //Consume the next line

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
                    System.out.println("Item: Pots & Pans       Price: $54.00    Availability: " + potsPansStock);
                    if (potsPansStock == 0){
                        System.out.println("Out of Stock");
                    }
                    System.out.println("Item: Plates & Bowls    Price: $15.99    Availability: " + platesBowlStock);
                    if (platesBowlStock == 0){
                        System.out.println("Out of Stock");
                    }
                    System.out.println("Item: Coffee Machine    Price: $70.00    Availability: " + coffeeMachineStock);
                    if (coffeeMachineStock == 0){
                        System.out.println("Out of Stock");
                    }

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

            // Updating & removing option
            System.out.println("Would you like to change your cart? | Options: update/remove/none ");
            String update = sc.nextLine().toLowerCase();

            // Update option
            if (update.equals("update")) {
                System.out.println("Here are the items in your cart: ");
                for (int i = 0; i < carts.size(); i++){
                   System.out.println((i + 1) + ": " + carts.get(i));
                }

                System.out.println("Which number do you want to update? ");
                int index = sc.nextInt() - 1; // For the array index to align
                sc.nextLine(); // Consume the next line

                System.out.println("Enter the new quantity you want:  ");
                int newQuantity = sc.nextInt();
                sc.nextLine(); // Consume the next line

                String item = carts.get(index);

                // Get the name of the item
                String itemName = "";
                for (int i = 0; i < item.length(); i++){
                    if (item.charAt(i) == 'x'){
                        itemName = item.substring(0, i-1).toLowerCase();
                        break;
                    }
                }

                boolean updating = false;

                // Update cart for FURNITURE
                if (itemName.equals("sofas") && newQuantity <= sofaStock + quantity){
                    sofaStock = sofaStock + quantity - newQuantity;
                    carts.set(index, "Sofas x" + newQuantity + "-- $" + (sofa * newQuantity));
                    updating = true;
                } else if (itemName.equals("beds") && newQuantity <= bedStock + quantity){
                    bedStock = bedStock + quantity - newQuantity;
                    carts.set(index, "Beds x" + newQuantity + "-- $" + (beds * newQuantity));
                    updating = true;
                }
                else if (itemName.equals("tables") && newQuantity <= tableStock + quantity){
                    tableStock = tableStock + quantity - newQuantity;
                    carts.set(index, "Tables x" + newQuantity + "-- $" + (tables * newQuantity));
                    updating = true;
                }

                // Update cart for HOME DECOR
                if (itemName.equals("wall art") && newQuantity <= wallArtStock + quantity){
                    wallArtStock = wallArtStock + quantity - newQuantity;
                    carts.set(index, "Wall Art x" + newQuantity + "-- $" + (wallArt * newQuantity));
                    updating = true;
                }  else if (itemName.equals("clocks") && newQuantity <= clockStock + quantity){
                    clockStock = clockStock + quantity - newQuantity;
                    carts.set(index, "Clocks x" + newQuantity + "-- $" + (clocks * newQuantity));
                    updating = true;
                } else if (itemName.equals("carpet") && newQuantity <= carpetStock + quantity) {
                    carpetStock = carpetStock + quantity - newQuantity;
                    carts.set(index, "Carpet x" + newQuantity + "-- $" + (carpets * newQuantity));
                    updating = true;
                }

                // Update cart for KITCHEN
                if (itemName.equals("pots & pans") && newQuantity <= potsPansStock + quantity){
                    potsPansStock = potsPansStock + quantity - newQuantity;
                    carts.set(index, "Pots & Pans x" + newQuantity + "-- $" + (potsPans * newQuantity));
                    updating = true;
                }  else if (itemName.equals("plates & bowls") && newQuantity <= platesBowlStock + quantity){
                    platesBowlStock = platesBowlStock + quantity - newQuantity;
                    carts.set(index, "Plates & Bowls x" + newQuantity + "-- $" + (platesBowls * newQuantity));
                    updating = true;
                } else if (itemName.equals("coffee machine") && newQuantity <= coffeeMachineStock + quantity) {
                    coffeeMachineStock = coffeeMachineStock + quantity - newQuantity;
                    carts.set(index, "Coffee Machine x" + newQuantity + "-- $" + (coffeeMachine * newQuantity));
                    updating = true;
                }

                if (!updating){
                    System.out.println("Invalid response or not enough stock");
                }

                // Remove option
            } else if (update.equals("remove")){
                System.out.println("Here are the items in your cart: ");
                for (int i = 0; i < carts.size(); i++){
                    System.out.println((i + 1) + ": " + carts.get(i));
                }

                System.out.println("Enter the number of items you want to remove : ");
                int index = sc.nextInt() - 1;
                sc.nextLine(); // Consume the new line


                String removedItem = carts.get(index);

                // Get the name of the item
                String itemName = "";
                for (int i = 0; i < removedItem.length(); i++){
                    if (removedItem.charAt(i) == 'x'){
                        itemName = removedItem.substring(0, i-1).toLowerCase();
                        break;
                    }
                }

                if(itemName.equals("sofas")){
                    sofaStock =
                }

            }

        } else {
            System.out.println("Invalid User type");
        }
    }
}


