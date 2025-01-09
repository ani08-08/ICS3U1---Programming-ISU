import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> carts = new ArrayList<>();

        // Ask whether they want to choose admin or user
        System.out.println("Admin or User?");
        String question = sc.nextLine().toLowerCase();

        String category = "";
        String cart = "";
        String input = "";
        int quantity = 0;

        double sofas = 450.99;
        double beds = 350.90;
        double tables = 245.00;
        double wallArt = 45.90;
        double clocks = 6.99;
        double carpets = 67.00;
        double potsPans = 54.00;
        double platesBowls = 15.99;
        double cofeeMachine = 70.00;


        if (question.equals("user")) {
            System.out.println("Welcome to Vintique Furniture Store!");
            while (!question.equals("back")) {
                System.out.println("Here are the categories: Furniture, Home Decor, Kitchen ");
                System.out.println("Which one would you like to buy from? ");
                category = sc.nextLine().toLowerCase();
                if (category.equals("furniture")) {
                    System.out.println("Item: Sofas    Price: $450.99    Availability: 4");
                    System.out.println("Item: Beds     Price: $350.90   Availability: 1");
                    System.out.println("Item: Tables   Price: $245.00    Availability: 5");

                    System.out.println("Enter the item you want to add to your cart. If you don't want anything, enter nothing");
                    input = sc.nextLine();
                    System.out.println("Enter the number of the item you want.");

                    input = sc.nextLine();
                    if (!input.equals("sofas") || !input.equals("beds") || !input.equals("tables")){
                        System.out.println("Invalid input try again");
                    }
                    if (input.equals("sofas") && quantity <= 4) {
                        carts.add(input.toLowerCase());
                    } else if (input.equals("beds") && quantity <= 1) {
                        carts.add(input.toLowerCase());
                    } else if (input.equals("tables") && quantity <= 5) {
                        carts.add(input.toLowerCase());
                    }
                    else {
                        System.out.println("Item is out of stock");
                    }

                } else if (category.equals("home decor")) {
                    System.out.println("Item: Wall Art   Price: $45.90    Availability: 3");
                    System.out.println("Item: Clocks     Price: $6.99     Availability: 2");
                    System.out.println("Item: Carpets    Price: $67.00    Availability: 3");

                    System.out.println("Enter the item you want to add to your cart. If you don't want anything, enter nothing");
                    input = sc.nextLine().toLowerCase();


                    } else if (category.equals("kitchen")) {
                        System.out.println("Item: Pots & Pans       Price: $54.00    Availability: 3");
                        System.out.println("Item: Plates & Bowls    Price: $15.99    Availability: 1");
                        System.out.println("Item: Coffee Machine    Price: $70.00    Availability: 5");

                        System.out.println("Enter the item you want to add to your cart. If you don't want anything, enter nothing");
                        input = sc.nextLine().toLowerCase();
                        } else {
                            System.out.println("Invalid Category, try again");
                        }

                    }
                }
            }
        }


