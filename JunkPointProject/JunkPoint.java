import java.util.*;

public class JunkPoint {

    static Scanner input = new Scanner(System.in);
    
    // [ENCAPSULATION]
    // Map stores 'User' objects.
    // We retrieve them to call their methods rather than manipulating their data fields directly.
    static Map<String, User> users = new HashMap<>();

    static final double MINIMUM_POINTS_FOR_CASH_CONVERSION = 100.0;

    public static void main(String[] args) {
        while (true) {
            System.out.println(""" 
                               \n================================================================================================================\r
                               \t\t\t\t\t\t    JunkPOinT\r
                               \t\t\t\t\tRecyclable Trash Redemption System\r
                               \t\t\t\t\tIn Partnership with Inhinyero Caf\u00e9\r
                               ================================================================================================================""");
            System.out.println("\nMenu:");
            System.out.println("1. View System Foreword");
            System.out.println("2. Register an Account");
            System.out.println("3. Login an Account");
            System.out.println("4. Continue as Guest to Donate");
            System.out.println("5. Help");
            System.out.println("6. Exit");
            
            int choice = getValidIntInput("Select a menu item (1-6): ", 1, 6);

            switch (choice) {
                case 1 -> {
                    System.out.println(""" 
                               \n================================================================================================================\r
                               \t\t\t\t\t\t    JunkPOinT\r
                               \t\t\t\t\tRecyclable Trash Redemption System\r
                               \t\t\t\t\tIn Partnership with Inhinyero Caf\u00e9\r
                               \t\t\t\t\t\t    FOREWORD
                               ================================================================================================================""");
                    System.out.println("""
                                        \n\t\t\t        ________________   ___/-\\___     ___/-\\___     ___/-\\___\r
                                        \t\t\t      / /             ||  |---------|   |---------|   |---------|\r
                                        \t\t\t     / /              ||   |       |     | | | | |     |   |   |\r
                                        \t\t\t    / /             __||   |       |     | | | | |     | | | | |\r
                                        \t\t\t   / /   \\\\        I  ||   |       |     | | | | |     | | | | |\r
                                        \t\t\t  (-------------------||   | | | | |     | | | | |     | | | | |\r
                                        \t\t\t  ||               == ||   |_______|     |_______|     |_______|\r
                                        \t\t\t  ||   JunkPOinT      | =========================================\r
                                        \t\t\t  ||          ____    |                                ____      |\r
                                        \t\t\t  ( | o      / ____ \\                                 / ____ \\    |)\r
                                        \t\t\t  ||      / / . . \\ \\                              / / . . \\ \\   |\r
                                       \t\t\t  [ |_____| | .   . | |____________________________| | .   . | |__]\r
                                        \t\t\t           | .   . |                                | .   . |\r
                                        \t\t\t            \\_____/                                  \\_____/\r
                                       """);
                    System.out.println("\n\t\t\t\t     Alert! Hurry up! Collect recyclable trash!\n");
                    System.out.println("""
                                       \tWelcome to the Recyclable Trash Redemption System! In our daily lives, trash is everywhere, but with the
                                       right effort, even waste can create a positive impact. Through this system, every click and every piece of recyc-
                                       lable trash you collect contributes to something bigger. By submitting your collected recyclable items, you not
                                       only help the environment but also earn points that you can convert into cash, food, or drinks. Your participa-
                                       tion supports sustainability and helps our mission to care for Mother Earth. Please make sure your information is
                                       complete and accurate. This allows us to process your redemptions smoothly and manage your points effectively.
                                       Your cooperation helps us meet both environmental and business goals. Thank you for being part of this initiative.
                                       Stay resourceful, stay responsible, and remember—we’re in this together for a cleaner and greener future. Support
                                       sustainable development goals 11 and 12!\r
                                       """);
                    System.out.println("\t\t\t\t\tRedemption is on the way! Beep! Beep!\r");
                }
                case 2 -> register();
                case 3 -> login();
                case 4 -> guestMenu();
                case 5 -> showHelpMenu();
                case 6 ->  {
                    System.out.println("\nExiting JunkPOinT, the Recyclable Trash Redemption System... thank you for supporting SDG No. 11 and 12!");
                    System.out.println("""
                                       
                                       Always Remember: The environment is where we all meet, where we all have a mutual interest; it is the one thing
                                       all of us share. It is not only a mirror of ourselves, but a focusing lens on what we can become.
                                       \t\t\t\t\t           - Speech at Yale University, White House Diary, Oct. 9, 1967
                                       
                                       So, protect it, love it, and donate waste in every bit of it!
                                       """);
                    System.exit(0);
                }
            }
        }
    }

    static int getValidIntInput(String prompt, int min, int max) {
        int choice;
        while (true) {
            System.out.print(prompt);
            String line = input.nextLine();
            try {
                choice = Integer.parseInt(line);
                if (choice >= min && choice <= max) {
                    return choice;
                } else {
                    System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }

    static void register() {
        System.out.println("""
                           \n================================================================================================================\r
                           \t\t\t\t\t\t    JunkPOinT\r
                           \t\t\t\t\tRecyclable Trash Redemption System\r
                           \t\t\t\t\tIn Partnership with Inhinyero Caf\u00e9\r
                           \t\t\t\t\t       ACCOUNT REGISTRATION\r
                           ================================================================================================================""");
        System.out.print("\nEnter your full name: ");
        String name = input.nextLine();
        System.out.print("Enter your username: ");
        String user = input.nextLine();
        if (users.containsKey(user)) {
            System.out.println("\nUsername already exist!");
            return;
        }
        System.out.print("Enter your password: ");
        String pass = input.nextLine();

        // [INHERITANCE] & [ENCAPSULATION]
        // 1. We create a 'User' object. 'User' inherits from 'Person'.
        // 2. The constructor encapsulates the logic of setting initial points to 0.
        users.put(user, new User(name, user, pass));
        System.out.println("\nAccount successfully registered!");
    }

    static void login() {
        System.out.println("""
                           \n================================================================================================================\r
                           \t\t\t\t\t\t    JunkPOinT\r
                           \t\t\t\t\tRecyclable Trash Redemption System\r
                           \t\t\t\t\tIn Partnership with Inhinyero Caf\u00e9\r
                           \t\t\t\t\t\t  ACCOUNT LOGIN\r
                           ================================================================================================================""");

        System.out.print("\nUsername: ");
        String user = input.nextLine();
        if (!users.containsKey(user)) {
            System.out.println("\nUsername does not exist!");
            return;
        }
        System.out.print("Password: ");
        String pass = input.nextLine();

        // [ENCAPSULATION]
        // We cannot access 'users.get(user).password' directly. 
        // We must use the getter method .getPassword() to retrieve private data.
        if (!users.get(user).getPassword().equals(pass)) {
            System.out.println("\nLogin failed! Incorrect password.");
            return;
        }
        System.out.println("\nAccount successfully logged in!");

        // [ENCAPSULATION]
        // Accessing private name via getter.
        System.out.println("\nWelcome, " + users.get(user).getName() + "!");
        userMenu(users.get(user));
    }

    static void guestMenu() {
        // [INHERITANCE]
        // Instantiating 'Guest', which inherits properties (like 'name') from 'Person'.
        Guest guest = new Guest("Guest User");
        while (true) {
            System.out.println("""
                               \n================================================================================================================\r
                               \t\t\t\t\t\t    JunkPOinT\r
                               \t\t\t\t\tRecyclable Trash Redemption System\r
                               \t\t\t\t\tIn Partnership with Inhinyero Caf\u00e9\r
                               \t\t\t\t\t\t   GUEST MODE\r
                               ================================================================================================================""");
            System.out.println("\nMenu:");
            System.out.println("1. Donate Waste");
            System.out.println("2. View Material List");
            System.out.println("3. Exit Guest Mode");
            
            int choice = getValidIntInput("Select a menu item (1-3): ", 1, 3);

            switch (choice) {
                // [ABSTRACTION]
                // We call .donateWaste(). We don't see the math or the logic here.
                // The complexity is hidden inside the Guest class.
                case 1 -> guest.donateWaste();
                case 2 -> {
                    System.out.println("\nWeight per Material (CO2 Contribution):");
                    System.out.println("1. Plastic      - 0.15 kg");
                    System.out.println("2. Metal        - 0.4 kg");
                    System.out.println("3. Glass        - 0.03 kg");
                    System.out.println("4. Paper        - 0.09 kg");
                    System.out.println("5. Electronics  - 1.5 kg");
                }
                case 3 -> {
                    System.out.println("\nExiting guest mode...");
                    return;
                }
            }
        }
    }

    static void showHelpMenu() {
        System.out.println("""
                           
                           \n================================================================================================================\r
                           \t\t\t\t\t\t    JunkPOinT\r
                           \t\t\t\t\tRecyclable Trash Redemption System\r
                           \t\t\t\t\tIn Partnership with Inhinyero Caf\u00e9\r
                           \t\t\t\t\t\t      HELP\r
                           ================================================================================================================""");

        System.out.println("\n(1) How to use the Recyclable Trash Redemption System?");
        showSystemUsage();

        System.out.println("\n(2) Why is recycling important?");
        showRecyclingImportance();

        System.out.println(
                "\n(3) In case of immediate concerns regarding environmental emergency services, where to call or send a message?");
        showEmergencyContacts();

        handleUserConcerns();
    }

    static void showSystemUsage() {
        System.out.println("""
                           \r
                           1. Select a menu item you want to access.\r
                           2. Use each menu according to its function:\r
                           \tView System Foreword: Displays the system introduction and purpose.\r
                           \tRegister an Account: Creates a new user account for system login.\r
                           \tLogin an Account: Logs in an existing account to access system features.\r
                           \tContinue as Guest to Donate: Allows users without an account to donate recyclable trash.\r
                           \tHelp: Shows information about the system, the importance of recycling, and general assistance.\r
                           \tExit: Closes the system.\r
                           3. For each section, provide all required information to ensure smooth operation and accurate processing.\r
                           4. After exiting, run the system again to make another submission or access additional features.""");
    }

    static void showRecyclingImportance() {
        System.out.println("""
                           \r
                           \tRecycling plays a major role in protecting the environment and conserving resources. Here are the key
                           reasons why recycling is essential:\r
                           1. Reduces Waste in Landfills:
                           \tRecycling helps decrease the amount of trash that ends up in landfills, preventing overflow and
                           \tpollution.\r
                           2. Saves Natural Resources:
                           \tMaterials like plastic, metal, paper, glass, and electronics can be recycled and reused, reducing
                           \tthe need to extract new raw materials from nature.\r
                           3. Lowers Energy Consumption:
                           \tProducing items from recycled materials often uses far less energy than manufacturing new ones.\r
                           4. Prevents Pollution:
                           \tRecycling reduces harmful emissions, protects ecosystems, and helps keep air, water, and soil clean.\r
                           5. Supports Sustainability:
                           \tIt promotes responsible resource use, ensuring a healthier and greener environment for future genera-
                           \ttions, and supports SDG 11 (Sustainable Cities and Communities) and SDG 12 (Responsible Consumption
                           \tand Production) by the United Nations.\r
                           6. Encourages Community Involvement:
                           \tSystems like JunkPOinT inspire people to take part in environmental efforts while receiving rewards
                           \tfor their contributions.""");
    }

    static void showEmergencyContacts() {
        System.out.println("""
                           \r
                           1. Department of Environment and Natural Resources (DENR):\r
                           \tLandline: #DENR or #3367\r
                           \tMobile Phone: 0917-868-DENR (0917-868-3367) or 0917-885-DENR (0917-885-3367)\r
                           \tEmail: aksyonkalikasan@denr.gov.ph or web@denr.gov.ph \r
                           2. DENR Water Resources Management Office (WRMO):\r
                           \tHotline - SMS or Viber ("Wag Pataksaya"): 0949-884-8927\r
                           \tOnline Form: National Water Service Online Form\r
                           3. Environmental Management Bureau (EMB) CALABARZON:\r
                           \tEMB CALABARZON Regional Office: 02-8653-3507 or trunk line (02) 8705-0380 to 89\r
                           \tEMB Provincial Environmental Management Unit (PEMU) Batangas: 0927-310-8016\r
                           \tSolid Waste Management Concerns: 0918-935-3541, 0943-706-1954, or 0917-558-2023\r
                           \tEmail: ord_calabarzon@emb.gov.ph or complaints_calabarzon@emb.gov.ph\r
                           4. JunkPOinT Recyclable Trash Redemption System Developers:\r
                           \tEmail:\t24-07754@g.batstate-u.edu.ph (HAZEL AGUILAR)\r
                           \t\t24-03337@g.batstate-u.edu.ph (BERNARDO LAURENZ ULYSSYS DOMINGO)\r
                           \t\t24-02316@g.batstate-u.edu.ph (RUJ MICHAEL GARCIA)\r
                           \t\t24-05806@g.batstate-u.edu.ph (LAURENCE PANGANIBAN)\r""");
    }

    static void handleUserConcerns() {
        System.out.print("\nEnter other questions or concerns (If none, type \"None / none\"): ");
        String concern = input.nextLine();

        if (concern.equalsIgnoreCase("None") || concern.trim().isEmpty()) {
            System.out.println("\nThank you for your cooperation! We're happy to help and serve you.");
        } else {
            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.print("Enter your email: ");
            String email = input.nextLine();

            System.out.print("Enter your contact number: ");
            String contactNumber = input.nextLine();

            System.out.println("\nDetails");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Contact Number: " + contactNumber);
            System.out.println("\nThank you for your cooperation! We'll try to contact you as soon as possible.");
        }
    }

    static void userMenu(User u) {
        // [POLYMORPHISM]
        // .displayMenu() is defined in 'Person' but overridden in 'User'.
        // The program dynamically knows to run the 'User' version of this method.
        u.displayMenu();
        while (true) {
            System.out.println("""
                               \n================================================================================================================\r
                               \t\t\t\t\t\t    JunkPOinT\r
                               \t\t\t\t\tRecyclable Trash Redemption System\r
                               \t\t\t\t\tIn Partnership with Inhinyero Caf\u00e9\r
                               \t\t\t\t\t\t    USER MENU\r
                               ================================================================================================================""");
            System.out.println("\nMenu:");
            System.out.println("1. Record Waste Collection");
            System.out.println("2. View Points");
            System.out.println("3. Redeem Points for Item");
            System.out.println("4. Convert Points to Cash");
            System.out.println("5. View Vouchers");
            System.out.println("6. Logout");
            
            int c = getValidIntInput("Select a menu item (1-6): ", 1, 6);

            switch (c) {
                case 1 -> recordWaste(u);
                // [ENCAPSULATION] accessing private points via getter
                case 2 -> System.out.println("\nYour total current points: " + u.getPoints());
                case 3 -> redeem(u);
                case 4 -> convertPointsToCash(u);
                case 5 -> viewVouchers(u);
                case 6 -> {
                    System.out.println("\nLogging out...");
                    return;
                }
            }
        }
    }

    static void convertPointsToCash(User u) {
        System.out.println("""
                           \n================================================================================================================\r
                           \t\t\t\t\t\t    JunkPOinT\r
                           \t\t\t\t\tRecyclable Trash Redemption System\r
                           \t\t\t\t\tIn Partnership with Inhinyero Caf\u00e9\r
                           \t\t\t\t\t      CONVERT POINTS TO CASH\r
                           ================================================================================================================""");
        System.out.println("\nTotal Current Points: " + u.getPoints());

        double minimumRequired = getMinimumPointsForCashConversion();
        if (!canConvertPointsToCash(u.getPoints())) {
            System.out.printf(
                    "\nInsufficient points! You need at least %.2f points to convert to cash. You currently have %.2f points.\n",
                    minimumRequired, u.getPoints());
            return;
        }

        System.out.print("Enter the number of points you want to convert: ");
        double points;
        try {
             points = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
             System.out.println("Invalid input. Please enter a number.");
             return;
        }

        double conversionRate = 0.3; 

        // [ABSTRACTION]
        // The main class asks to convert points.
        // It does not handle the math of subtracting points and calculating cash.
        // That logic is abstracted away inside the User class method.
        try {
            double cash = u.convertPointsToCash(points, conversionRate);
            System.out.printf("\nSuccessfully converted %.2f points to Php %.2f!\n", points, cash);
        } catch (InsufficientPointsException e) {
            // [INHERITANCE]
            // InsufficientPointsException inherits from Exception, allowing us to use try or catch blocks.
            System.out.println(e.getMessage());
        }
    }

    static double getMinimumPointsForCashConversion() {
        return MINIMUM_POINTS_FOR_CASH_CONVERSION;
    }

    static boolean canConvertPointsToCash(double userPoints) {
        return userPoints >= getMinimumPointsForCashConversion();
    }

    static void recordWaste(User u) {
        // [ABSTRACTION]
        // Static utility method.
        // We don't need to know how the list is stored to show it.
        WasteCalculator.showMaterialList();

        int materialChoice = getValidIntInput("Select a material you want to record (1-5): ", 1, 5);

        String material;
        switch (materialChoice) {
            case 1 -> material = "plastic";
            case 2 -> material = "metal";
            case 3 -> material = "glass";
            case 4 -> material = "paper";
            case 5 -> material = "electronics";
            default -> {
                System.out.println("Invalid choice!");
                return;
            }
        }

        System.out.print("Enter the quantity of the material: ");
        double quantity;
        try {
            quantity = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity.");
            return;
        }

        // [ABSTRACTION]
        // We pass the material and quantity, and get points back.
        // The formula for calculating points is hidden inside WasteCalculator.
        double points = WasteCalculator.calculatePoints(material, quantity);
        if (points == 0) {
            System.out.println("Invalid number of material!");
            return;
        }

        // [ENCAPSULATION]
        // We use a setter (addPoints) to modify the User's balance safely.
        u.addPoints(points);
        System.out.println("\nYou earned " + points + " points!");
    }

    static void redeem(User u) {
        while(true) {
            System.out.println("\nRedeem Options");
            System.out.println("\nInhinyero Caf\u00e9 Food Category List:");
            System.out.println("1. Americano Series");
            System.out.println("2. Latte Series");
            System.out.println("3. Matcha Series");
            System.out.println("4. Barista Blend");
            System.out.println("5. Classic Milktea");
            System.out.println("6. Oreo Series");
            System.out.println("7. Cheesecake Series");
            System.out.println("8. Western Snacks");
            System.out.println("9. Shawarma Series");
            System.out.println("10. Rice Bowl Series");
            System.out.println("11. Back to User Menu"); 

            int seriesChoice = getValidIntInput("Select a food category (1-11): ", 1, 11);

            switch (seriesChoice) {
                case 1 -> displayAmericanoSeries(u);
                case 2 -> displayLatteSeries(u);
                case 3 -> displayMatchaSeries(u);
                case 4 -> displayBaristaBlend(u);
                case 5 -> displayClassicMilktea(u);
                case 6 -> displayOreoSeries(u);
                case 7 -> displayCheesecakeSeries(u);
                case 8 -> displayWesternSnacks(u);
                case 9 -> displayShawarmaSeries(u);
                case 10 -> displayRiceBowlSeries(u);
                case 11 -> { return; } 
            }
        }
    }

    static void displayAmericanoSeries(User u) {
        System.out.println("\nAmericano Series (Hot / Iced)");
        System.out.println("1. Americano (Php 99.00) - 330 points");
        System.out.println("2. Honey Americano (Php 109.00) - 363.33 points");
        System.out.println("3. Vanilla Americano (Php 109.00) - 363.33 points");
        System.out.println("4. Back");
        
        int itemChoice = getValidIntInput("Select an item (1-4): ", 1, 4);
        if (itemChoice == 4) return; 

        String[] itemNames = {"Americano", "Honey Americano", "Vanilla Americano"};
        String[] details = {"Hot or Iced", "Hot or Iced with Honey", "Hot or Iced with Vanilla"};
        redeemItem(u, itemChoice, new double[]{330, 363.33, 363.33}, "Americano Series", itemNames, details);
    }

    static void displayLatteSeries(User u) {
        System.out.println("\nLatte Series (Hot / Iced)");
        System.out.println("1. Chocolate Latte (Php 99.00) - 330 points");
        System.out.println("2. Spanish Latte Macchiato (Php 119.00) - 363.33 points");
        System.out.println("3. Caramel Latte Macchiato (Php 119.00) - 363.33 points");
        System.out.println("4. Back");

        int itemChoice = getValidIntInput("Select an item (1-4): ", 1, 4);
        if (itemChoice == 4) return;

        String[] itemNames = {"Chocolate Latte", "Spanish Latte Macchiato", "Caramel Latte Macchiato"};
        String[] details = {"Hot or Iced", "Hot or Iced with Spanish Latte", "Hot or Iced with Caramel"};
        redeemItem(u, itemChoice, new double[]{330, 363.33, 363.33}, "Latte Series", itemNames, details);
    }

    static void displayMatchaSeries(User u) {
        System.out.println("\nMatcha Series");
        System.out.println("1. Matcha Latte (Php 119.00) - 363.33 points");
        System.out.println("2. Matcha Espresso Fusion (Php 129.00) - 430 points");
        System.out.println("3. Strawberry Matcha (Php 129.00) - 430 points");
        System.out.println("4. Brown Sugar Matcha (Php 129.00) - 430 points");
        System.out.println("5. Back");

        int itemChoice = getValidIntInput("Select an item (1-5): ", 1, 5);
        if (itemChoice == 5) return;

        String[] itemNames = {"Matcha Latte", "Matcha Espresso Fusion", "Strawberry Matcha", "Brown Sugar Matcha"};
        String[] details = {"Classic Matcha Latte", "Matcha with Espresso", "Matcha with Strawberry",
            "Matcha with Brown Sugar"};
        redeemItem(u, itemChoice, new double[]{363.33, 430, 430, 430}, "Matcha Series", itemNames, details);
    }

    static void displayBaristaBlend(User u) {
        System.out.println("\nBarista Blend");
        System.out.println("1. Thai Tea Coffee (Php 119.00) - 363.33 points");
        System.out.println("2. Thai Tea Brown Sugar (Php 119.00) - 363.33 points");
        System.out.println("3. Thai Tea Strawberry (Php 119.00) - 363.33 points");
        System.out.println("4. Mocha Thai Tea (Php 119.00) - 363.33 points");
        System.out.println("5. Three Flavor Tea (Php 119.00) - 363.33 points");
        System.out.println("6. Dark Strawberry (Php 119.00) - 363.33 points");
        System.out.println("7. Back");

        int itemChoice = getValidIntInput("Select an item (1-7): ", 1, 7);
        if (itemChoice == 7) return;

        String[] itemNames = {"Thai Tea Coffee", "Thai Tea Brown Sugar", "Thai Tea Strawberry", "Mocha Thai Tea",
            "Three Flavor Tea", "Dark Strawberry"};
        String[] details = {"Thai Tea with Coffee", "Thai Tea with Brown Sugar", "Thai Tea with Strawberry",
            "Thai Tea with Mocha", "Three Flavor Tea", "Dark Strawberry"};
        redeemItem(u, itemChoice, new double[]{363.33, 363.33, 363.33, 363.33, 363.33, 363.33}, "Barista Blend",
                itemNames,
                details);
    }

    static void displayClassicMilktea(User u) {
        System.out.println("\nClassic Milktea");
        System.out.println("1. Thai Milktea");
        System.out.println("2. Matcha");
        System.out.println("3. Strawberry");
        System.out.println("4. Dark Choco");
        System.out.println("5. Cookies & Cream");
        System.out.println("6. Salted Caramel");
        System.out.println("7. Okinawa");
        System.out.println("8. Taro");
        System.out.println("9. Back");
        
        int itemChoice = getValidIntInput("Select an item (1-9): ", 1, 9);
        if (itemChoice == 9) return;

        System.out.println("\nSelect size:");
        System.out.println("1. Centi (Php 89.00 - 296.67 points)");
        System.out.println("2. Milli (Php 99.00 - 330 points)");
        int sizeChoice = getValidIntInput("Choice (1-2): ", 1, 2);

        double[] centiPoints = {296.7, 296.7, 296.7, 296.7, 296.7, 296.7, 296.7, 296.7};
        double[] milliPoints = {330, 330, 330, 330, 330, 330, 330, 330};
        
        double points = (sizeChoice == 1) ? centiPoints[itemChoice - 1] : milliPoints[itemChoice - 1];
        String sizeString = (sizeChoice == 1) ? "Centi" : "Milli";
        
        String[] itemNames = {"Thai Milktea", "Matcha", "Strawberry", "Dark Choco", "Cookies & Cream", "Salted Caramel",
            "Okinawa", "Taro"};
        String[] details = {"Classic Thai Milktea", "Classic Matcha", "Classic Strawberry", "Classic Dark Choco",
            "Classic Cookies & Cream", "Classic Salted Caramel", "Classic Okinawa", "Classic Taro"};
        
        redeemItem(u, itemChoice, new double[]{points}, "Classic Milktea", new String[]{itemNames[itemChoice - 1]},
                new String[]{details[itemChoice - 1] + " (" + sizeString + ")"});
    }

    static void displayOreoSeries(User u) {
        System.out.println("\nOreo Series");
        System.out.println("1. Oreo Overload");
        System.out.println("2. Oreo Dark Choco");
        System.out.println("3. Oreo Strawberry");
        System.out.println("4. Oreo Matcha");
        System.out.println("5. Oreo Cheesecake");
        System.out.println("6. Oreo Okinawa");
        System.out.println("7. Back");

        int itemChoice = getValidIntInput("Select an item (1-7): ", 1, 7);
        if (itemChoice == 7) return;

        System.out.println("\nSelect size:");
        System.out.println("1. Centi (Php 99.00 - 330 points)");
        System.out.println("2. Milli (Php 109.00 - 363.33 points)");
        int sizeChoice = getValidIntInput("Choice (1-2): ", 1, 2);

        double[] centiPoints = {330, 330, 330, 330, 330, 330};
        double[] milliPoints = {363.33, 363.33, 363.33, 363.33, 363.33, 363.33};
        
        double points = (sizeChoice == 1) ? centiPoints[itemChoice - 1] : milliPoints[itemChoice - 1];
        String sizeString = (sizeChoice == 1) ? "Centi" : "Milli";

        String[] itemNames = {"Oreo Overload", "Oreo Dark Choco", "Oreo Strawberry", "Oreo Matcha", "Oreo Cheesecake",
            "Oreo Okinawa"};
        String[] details = {"Oreo Overload", "Oreo with Dark Choco", "Oreo with Strawberry", "Oreo with Matcha",
            "Oreo with Cheesecake", "Oreo with Okinawa"};
            
        redeemItem(u, itemChoice, new double[]{points}, "Oreo Series", new String[]{itemNames[itemChoice - 1]},
                new String[]{details[itemChoice - 1] + " (" + sizeString + ")"});
    }

    static void displayCheesecakeSeries(User u) {
        System.out.println("\nCheesecake Series");
        System.out.println("1. Strawberry Cheesecake");
        System.out.println("2. Cheesecake Matcha");
        System.out.println("3. Dark Choco Cheesecake");
        System.out.println("4. Cheesecake Milktea");
        System.out.println("5. Okinawa Cheesecake");
        System.out.println("6. Salted Cheesecake");
        System.out.println("7. Back");

        int itemChoice = getValidIntInput("Select an item (1-7): ", 1, 7);
        if (itemChoice == 7) return;

        System.out.println("\nSelect size:");
        System.out.println("1. Centi (Php 99.00 - 330 points)");
        System.out.println("2. Milli (Php 109.00 - 363.33 points)");
        int sizeChoice = getValidIntInput("Choice (1-2): ", 1, 2);

        double[] centiPoints = {330, 330, 330, 330, 330, 330};
        double[] milliPoints = {363.33, 363.33, 363.33, 363.33, 363.33, 363.33};
        
        double points = (sizeChoice == 1) ? centiPoints[itemChoice - 1] : milliPoints[itemChoice - 1];
        String sizeString = (sizeChoice == 1) ? "Centi" : "Milli";

        String[] itemNames = {"Strawberry Cheesecake", "Cheesecake Matcha", "Dark Choco Cheesecake", "Cheesecake Milktea",
            "Okinawa Cheesecake", "Salted Cheesecake"};
        String[] details = {"Strawberry Cheesecake", "Cheesecake with Matcha", "Cheesecake with Dark Choco",
            "Cheesecake with Milktea", "Cheesecake with Okinawa", "Salted Cheesecake"};
            
        redeemItem(u, itemChoice, new double[]{points}, "Cheesecake Series", new String[]{itemNames[itemChoice - 1]},
                new String[]{details[itemChoice - 1] + " (" + sizeString + ")"});
    }

    static void displayWesternSnacks(User u) {
        System.out.println("\nWestern Snacks");
        System.out.println("1. Spaghetti Bolognese (Php 99.00) - 330 points");
        System.out.println("2. Creamy Carbonara (Php 109.00) - 363.33 points");
        System.out.println("3. Muffins (Php 70.00) - 233.33 points");
        System.out.println("4. Back");

        int itemChoice = getValidIntInput("Select an item (1-4): ", 1, 4);
        if (itemChoice == 4) return;

        String[] itemNames = {"Spaghetti Bolognese", "Creamy Carbonara", "Muffins"};
        String[] details = {"Classic Spaghetti Bolognese", "Classic Creamy Carbonara", "Classic Muffins"};
        redeemItem(u, itemChoice, new double[]{330, 363.33, 233.33}, "Western Snacks", itemNames, details);
    }

    static void displayShawarmaSeries(User u) {
        System.out.println("\nShawarma Series");
        System.out.println("1. Shawarma Fries (Php 79.00) - 263.33points");
        System.out.println("2. Shawarma Rice (Php 89.00) - 296.67 points");
        System.out.println("3. Shawarma Nachos (Php 99.00) - 330 points");
        System.out.println("4. Back");

        int itemChoice = getValidIntInput("Select an item (1-4): ", 1, 4);
        if (itemChoice == 4) return;

        String[] itemNames = {"Shawarma Fries", "Shawarma Rice", "Shawarma Nachos"};
        String[] details = {"Classic Shawarma Fries", "Classic Shawarma Rice", "Classic Shawarma Nachos"};
        redeemItem(u, itemChoice, new double[]{263.33, 296.67, 330}, "Shawarma Series", itemNames, details);
    }

    static void displayRiceBowlSeries(User u) {
        System.out.println("\nRice Bowl Series");
        System.out.println("1. Shanghai Rolls (Php 99.00) - 330 points");
        System.out.println("2. Chicken Bites (Php 99.00) - 330 points");
        System.out.println("3. Smokey Spam (Php 120.00) - 400 points");
        System.out.println("4. Patty Rice (Php 109.00) - 363.33 points");
        System.out.println("5. Liempo Belly (Php 120.00) - 400 points");
        System.out.println("6. Back");

        int itemChoice = getValidIntInput("Select an item (1-6): ", 1, 6);
        if (itemChoice == 6) return;

        String[] itemNames = {"Shanghai Rolls", "Chicken Bites", "Smokey Spam", "Patty Rice", "Liempo Belly"};
        String[] details = {"Classic Shanghai Rolls", "Classic Chicken Bites", "Classic Smokey Spam", "Classic Patty Rice",
            "Classic Liempo Belly"};
        redeemItem(u, itemChoice, new double[]{330, 330, 400, 363.33, 400}, "Rice Bowl Series", itemNames, details);
    }

    static void redeemItem(User u, int itemChoice, double[] pointsArray, String series, String[] itemNames,
            String[] details) {
        try {
            double pointsNeeded = pointsArray[0];
            if (pointsArray.length > 1) {
                pointsNeeded = pointsArray[itemChoice - 1];
            }
            
            // [ABSTRACTION] & [ENCAPSULATION]
            // The User object manages its own point deduction logic.
            u.redeemPoints(pointsNeeded);
            Voucher voucher = new Voucher(itemNames[0], series, details[0]);
            if (itemNames.length > 1) {
                voucher = new Voucher(itemNames[itemChoice - 1], series, details[itemChoice - 1]);
            }
            
            u.addVoucher(voucher);
            System.out.println("\nRedemption successful! Your voucher has been generated.");

            // [POLYMORPHISM]
            // System.out.println calls voucher.toString().
            // The Voucher class overrides the default Object.toString() to print a pretty format.
            System.out.println(voucher);
        } catch (InsufficientPointsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void viewVouchers(User u) {
        List<Voucher> vouchers = u.getVouchers();
        if (vouchers.isEmpty()) {
            System.out.println("\nYou have no vouchers.");
        } else {
            System.out.println("\nVouchers");
            for (Voucher voucher : vouchers) {
                System.out.println(voucher);
            }
        }
    }
}
