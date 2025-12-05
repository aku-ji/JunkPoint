<div align="center">

# ་༘࿐་🗑️ִֶָ. ..𓂃 ࣪ ִֶָ JunkPOinT ִֶָ. ..𓂃 ࣪ ִֶָ🗑️་༘࿐

### Recyclable Trash Redemption System

<br> 💻 HaBeRuLa++ 💻

**IT-2109**
<br>
• Aguilar, Hazel C. 
<br>
• Domingo, Bernardo Laurenz Ulyssys M.
<br>
• Garcia, Ruj Michael C. 
<br>
• Panganiban, Jann Laurence R.

</div>

---

---

## Overview

JunkPOinT is a console-based Java application, specifically a Recyclable Trash Redemption System, that encourages recycling practices by allowing users to receive rewards for collecting waste like plastic, metal, glass, paper, and electronics. Users record their waste collections, earning points based on the type of material and its quantity. Every type has a corresponding number of points, which can be redeemed for an item, specifically a food, or converted into money or cash. For donations of users who do not want something in return, waste collections also have a corresponding weight based on type and quantity for them to know how many kilograms of carbon dioxide emissions are being saved because of those wastes.

This system works directly through the terminal, demonstrating the practical use of Object-Oriented Programming (OOP) concepts such as encapsulation, inheritance, polymorphism, and abstraction, alongside proper file handling and modular design. It also incorporates arrays, collections, methods, and control structures. Overall, by incentivizing waste management, this system directly supports the United Nations’ Sustainable Development Goals **No. 12 (Responsible Consumption and Production)** and **No. 11 (Sustainable Cities and Communities)**, promoting cleaner, more sustainable environments.

---

## OOP Concepts Applied

### Encapsulation

In the JunkPOint system, encapsulation is shown by keeping user-related information such as passwords, usernames, accumulated points, and transaction records private. Instead of allowing other parts of the program to directly change these values, the system uses controlled methods like getters, setters, and updating functions. This protects user data and ensures that important values, such as points or passwords, cannot be altered accidentally or improperly.

### Inheritance

Inheritance appears in the system through the relationship between user types. For example, the `Guest` class can extend a base user-type structure, allowing it to inherit common features such as viewing menu options, accessing recycling information, and participating in basic system functions like donating waste. The Guest class automatically gains essential behaviours from the parent class but can still impose restrictions such as not being able to redeem items or convert points.

### Polymorphism

The system utilises polymorphism to allow methods to behave differently based on the object calling them. The `displayMenu()` method is defined in the abstract `Person` class but is implemented differently in the `User` and `Guest` subclasses. This ensures that while both are treated as "Persons," a registered User sees the full dashboard while a Guest sees only donation options. Additionally, the `Voucher` class overrides the `toString()` method to provide a custom formatted display of the voucher details when printed.

### Abstraction

Abstraction is demonstrated in the system by hiding complex processes inside simple and easy-to-use methods. Methods like `calculatePoints()` or `convertPointsToCash()` do all the detailed work. This hides the formulas and lets the main programming simply call it. The main program just calls these methods and shows the results. This makes the code easier to read and maintain. It helps focus on what the program does rather than how it works internally.

---

## Program Structure

**Users can:**

1.  **View System Foreword**
2.  **Register an Account**
    - Enter Full Name
    - Enter Username
    - Enter Password
3.  **Login an Account**
    - Enter Username
    - Enter Password
    - **1. Record Waste Collection**
      - Select Points per Material (Based on Quantity)
        1.  Plastic - 5.0 points
        2.  Metal - 10.0 points
        3.  Glass - 7.0 points
        4.  Paper - 2.0 points
        5.  Electronics - 12.0 points
      - Select a Material that is Wanted to Record (1-5)
      - Enter the Quantity of the Material
    - **2. View Points**
      - View Earned Points
    - **3. Redeem Points for Item**
      - Redeem Points by Selecting Food Category
      - Redeem Points Selecting Specific Food
      - View the Generated Voucher or Know if there’s Not Enough Points for Redemption
    - **4. Convert Points to Cash**
      - View Total Current Points
      - Enter the Number of Points Wanted to Convert
      - View the Amount of Converted Points or Know if there’s Not Enough Points to Convert into Money
    - **5. View Vouchers**
      - View the Vouchers Received by Redeeming Points for Item
    - **6. Logout**
      - Logout the User Menu
4.  **Continue as Guest to Donate**
    - **1. Donate Waste**
      - View the System Message about the Donation
      - View Waste Material Types:
        1.  Plastic
        2.  Metal
        3.  Glass
        4.  Paper
        5.  Electronics
      - Select a Material Wanted to Donate (1-5)
      - Enter the Quantity of the Material
      - View the System Message about the Donation including Type and No. of Waste Item and Weight in Kilogram of Saved Carbon Dioxide Emissions
    - **2. View Material List**
      - View Weight per Material (CO2 Contribution)
        1.  Plastic - 0.15 kg
        2.  Metal - 0.4 kg
        3.  Glass - 0.03 kg
        4.  Paper - 0.09 kg
        5.  Electronics - 1.5 kg
    - **3. Exit Guest Mode**
      - Exit Guest Mode or Guest Menu
5.  **Help or Ask for Assistance**
    - View Guide on How to use the Recyclable Trash Redemption System
    - View the Importance of recycling
    - View Environmental Emergency Services Call or Message Contacts
    - Enter Other Questions or Concerns (If none, type "None / none")
      - _(If None / none)_ - View System Message
      - _(If there’s any)_ - Enter Name, Email, Contact Number -> View System Message
6.  **Exit**
    - View System Message
    - Exit the System or Terminal

---

## Project Structure

**Files:**

- `Guest.java`
- `InsufficientPointsException.java`
- `JunkPoint.java`
- `Person.java`
- `Redeemable.java`
- `User.java`
- `Voucher.java`
- `WasteCalculator.java`

**File Descriptions:**

- **Guest.java** - This code creates a Guest class that allows a user to donate different types of waste materials. It asks the user to choose a material and quantity, then calculates how much CO₂ emissions are saved based on their donation. Finally, it displays a summary thanking the user and showing the environmental impact of their contribution.
- **InsufficientPointsException.java** - This code defines a custom exception called `InsufficientPointsException` that is used when a user does not have enough points to perform an action. It extends the built-in `Exception` class, meaning it behaves like a normal error but with a specific purpose. The constructor passes a custom message to the parent class so the program can display a clear explanation of the error.
- **JunkPoint.java** - This Java code creates a console-based application called JunkPOinT, a simulation of a Recyclable Trash Redemption System where users earn points for donating waste. The system allows users to register accounts or donate as a guest, log in, record their waste collections, and redeem their accumulated points for items like coffee and snacks from a partner café, "Inhinyero Café." Users can also convert points to cash once they reach a minimum threshold (100 points at a rate of 1 point = Php 0.3). The system includes a Help menu that explains its usage, the importance of recycling, and provides environmental emergency contacts, emphasizing its support for the Sustainable Development Goals (SDG) 11 and 12. The core functionality manages user data, point accumulation, and redemption transactions through various nested menus and custom exception handling like `InsufficientPointsException`.
- **Person.java** - This code defines the abstract class `Person`, which mandates that all concrete person types must possess a `name`. As an abstract class, it cannot be instantiated directly but serves as a base class, enforcing that all subclasses must implement the abstract method, `displayMenu()`. Therefore, `Person` establishes a required structure for identity and interface behavior across all users in the application.
- **Redeemable.java** - This code defines the interface `Redeemable`, which establishes a contract for any class that implements it to be able to handle two specific actions related to a point system. The ability to redeem points for items and the ability to convert points to cash. Both methods are required to explicitly declare that they can throw an `InsufficientPointsException` if the user attempts to redeem or convert more points than they possess.
- **User.java** - This represents a User who interacts with the system by collecting points and using them for rewards. It saves the user’s basic information, their current point balance, and the vouchers they earn over time. It includes methods that let the user gain points, spend points, or turn their points into cash whenever allowed. If the user doesn’t have enough points for a certain action, the program stops the process and throws an `InsufficientPointsException` to avoid incorrect deductions. In short, this User class manages all point-related activities and keeps the system accurate and organized.
- **Voucher.java** - The Voucher, serves as a data structure to represent a redeemable item earned by a user, storing key information such as the `itemName`, the product series, and specific details. When a new voucher object is created, it is automatically assigned a unique, random `voucherCode` for identification and tracking. The class also provides methods to access these details and an overridden `toString()` method for formatted display of the voucher's information.
- **WasteCalculator.java** - The WasteCalculator class serves as a utility for the JunkPOinT system, specifically designed to determine the point value of donated recyclable materials based on their type and quantity. It uses a static `HashMap` to store predefined point values for different waste categories (like plastic, metal, and electronics) and provides a public `calculatePoints` method to perform the required multiplication and return the total points earned. Additionally, it offers a `showMaterialList` method to easily display the current redemption rate for each material to the user.

---

## How to Run the Program

Open your terminal and run the program using:

```bash
JunkPoint.java

================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
================================================================================================================


Menu:
1. View System Foreword
2. Register an Account
3. Login an Account
4. Continue as Guest to Donate
5. Help
6. Exit
Select a menu item (1-6): 1


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                    FOREWORD
================================================================================================================

                                ________________   ___/-\___     ___/-\___     ___/-\___
                              / /             ||  |---------|   |---------|   |---------|
                             / /              ||   |       |     | | | | |     |   |   |
                            / /             __||   |       |     | | | | |     | | | | |
                           / /   \\        I  ||   |       |     | | | | |     | | | | |
                          (-------------------||   | | | | |     | | | | |     | | | | |
                          ||               == ||   |_______|     |_______|     |_______|
                          ||   JunkPOinT      | =========================================
                          ||          ____    |                                ____      |
                          ( | o      / ____ \                                 / ____ \    |)
                          ||      / / . . \ \                              / / . . \ \   |
                          [ |_____| | .   . | |____________________________| | .   . | |__]
                                   | .   . |                                | .   . |
                                    \_____/                                  \_____/




                                     Alert! Hurry up! Collect recyclable trash!


        Welcome to the Recyclable Trash Redemption System! In our daily lives, trash is everywhere, but with the
right effort, even waste can create a positive impact. Through this system, every click and every piece of recyc-
lable trash you collect contributes to something bigger. By submitting your collected recyclable items, you not
only help the environment but also earn points that you can convert into cash, food, or drinks. Your participa-
tion supports sustainability and helps our mission to care for Mother Earth. Please make sure your information is
complete and accurate. This allows us to process your redemptions smoothly and manage your points effectively.
Your cooperation helps us meet both environmental and business goals. Thank you for being part of this initiative.
Stay resourceful, stay responsible, and remember?We're in this together for a cleaner and greener future. Support
sustainable development goals 11 and 12!


                                        Redemption is on the way! Beep! Beep!


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
================================================================================================================


Menu:
1. View System Foreword
2. Register an Account
3. Login an Account
4. Continue as Guest to Donate
5. Help
6. Exit
Select a menu item (1-6): 2


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                               ACCOUNT REGISTRATION
================================================================================================================


Enter your full name: Hazel C. Aguilar
Enter your username: hazel
Enter your password: hazel


Account successfully registered!


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
================================================================================================================


Menu:
1. View System Foreword
2. Register an Account
3. Login an Account
4. Continue as Guest to Donate
5. Help
6. Exit
Select a menu item (1-6): 3


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                  ACCOUNT LOGIN
================================================================================================================


Username: hazel
Password: hazel


Account successfully logged in!


Welcome, Hazel C. Aguilar!


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                    USER MENU
================================================================================================================


Menu:
1. Record Waste Collection
2. View Points
3. Redeem Points for Item
4. Convert Points to Cash
5. View Vouchers
6. Logout
Select a menu item (1-6): 1


Points per Material (Based on Quantity):
1. Plastic      - 5.0 points
2. Metal        - 10.0 points
3. Glass        - 7.0 points
4. Paper        - 2.0 points
5. Electronics  - 12.0 points


Select a material you want to record (1-5): 2
Enter the quantity of the material: 100000


You earned 1000000.0 points!


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                    USER MENU
================================================================================================================


Menu:
1. Record Waste Collection
2. View Points
3. Redeem Points for Item
4. Convert Points to Cash
5. View Vouchers
6. Logout
Select a menu item (1-6): 2


Your total current points: 1000000.0


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                    USER MENU
================================================================================================================


Menu:
1. Record Waste Collection
2. View Points
3. Redeem Points for Item
4. Convert Points to Cash
5. View Vouchers
6. Logout
Select a menu item (1-6): 3


Redeem Options


Inhinyero Café Food Category List:
1. Americano Series
2. Latte Series
3. Matcha Series
4. Barista Blend
5. Classic Milktea
6. Oreo Series
7. Cheesecake Series
8. Western Snacks
9. Shawarma Series
10. Rice Bowl Series
Select a food category (1-10): 1


Americano Series (Hot / Iced)
1. Americano (Php 99.00) - 330 points
2. Honey Americano (Php 109.00) - 363.33 points
3. Vanilla Americano (Php 109.00) - 363.33 points
Select an item (1-3): 1


Redemption successful! Your voucher has been generated.


Voucher Code: VCH-28
Series: Americano Series
Item: Americano
Details: Hot or Iced




================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                    USER MENU
================================================================================================================


Menu:
1. Record Waste Collection
2. View Points
3. Redeem Points for Item
4. Convert Points to Cash
5. View Vouchers
6. Logout
Select a menu item (1-6): 4


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                CONVERT POINTS TO CASH
================================================================================================================


Total Current Points: 999670.0
Enter the number of points you want to convert: 100


Successfully converted 100.00 points to Php 30.00!


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                    USER MENU
================================================================================================================


Menu:
1. Record Waste Collection
2. View Points
3. Redeem Points for Item
4. Convert Points to Cash
5. View Vouchers
6. Logout
Select a menu item (1-6): 5


Vouchers


Voucher Code: VCH-28
Series: Americano Series
Item: Americano
Details: Hot or Iced




================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                    USER MENU
================================================================================================================


Menu:
1. Record Waste Collection
2. View Points
3. Redeem Points for Item
4. Convert Points to Cash
5. View Vouchers
6. Logout
Select a menu item (1-6): 6


Logging out...


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
================================================================================================================


Menu:
1. View System Foreword
2. Register an Account
3. Login an Account
4. Continue as Guest to Donate
5. Help
6. Exit
Select a menu item (1-6): 4


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                   GUEST MODE
================================================================================================================


Menu:
1. Donate Waste
2. View Material List
3. Exit Guest Mode
Select a menu item (1-3): 1


Thank you for choosing to donate waste!
Your donation helps the environment.


Waste Material Types:
1. Plastic
2. Metal
3. Glass
4. Paper
5. Electronics
Select a material you want to donate (1-5): 1
Enter the quantity of the material: 3


Thank you for donating 3 plastic waste item(s)!
Your donation helps save approximately 0.45 kg of CO2 emissions!
Your contribution makes a difference for our environment!


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                   GUEST MODE
================================================================================================================


Menu:
1. Donate Waste
2. View Material List
3. Exit Guest Mode
Select a menu item (1-3): 2


Weight per Material (CO2 Contribution):
1. Plastic      - 0.15 kg
2. Metal        - 0.4 kg
3. Glass        - 0.03 kg
4. Paper        - 0.09 kg
5. Electronics  - 1.5 kg


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                   GUEST MODE
================================================================================================================


Menu:
1. Donate Waste
2. View Material List
3. Exit Guest Mode
Select a menu item (1-3): 3


Exiting guest mode...


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
================================================================================================================


Menu:
1. View System Foreword
2. Register an Account
3. Login an Account
4. Continue as Guest to Donate
5. Help
6. Exit
Select a menu item (1-6): 5




================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                      HELP
================================================================================================================


(1) How to use the Recyclable Trash Redemption System?


1. Select a menu item you want to access.
2. Use each menu according to its function:
        View System Foreword: Displays the system introduction and purpose.
        Register an Account: Creates a new user account for system login.
        Login an Account: Logs in an existing account to access system features.
        Continue as Guest to Donate: Allows users without an account to donate recyclable trash.
        Help: Shows information about the system, the importance of recycling, and general assistance.
        Exit: Closes the system.
3. For each section, provide all required information to ensure smooth operation and accurate processing.
4. After exiting, run the system again to make another submission or access additional features.


(2) Why is recycling important?


        Recycling plays a major role in protecting the environment and conserving resources. Here are the key
reasons why recycling is essential:
1. Reduces Waste in Landfills:
        Recycling helps decrease the amount of trash that ends up in landfills, preventing overflow and
        pollution.
2. Saves Natural Resources:
        Materials like plastic, metal, paper, glass, and electronics can be recycled and reused, reducing
        the need to extract new raw materials from nature.
3. Lowers Energy Consumption:
        Producing items from recycled materials often uses far less energy than manufacturing new ones.
4. Prevents Pollution:
        Recycling reduces harmful emissions, protects ecosystems, and helps keep air, water, and soil clean.
5. Supports Sustainability:
        It promotes responsible resource use, ensuring a healthier and greener environment for future genera-
        tions, and supports SDG 11 (Sustainable Cities and Communities) and SDG 12 (Responsible Consumption
        and Production) by the United Nations.
6. Encourages Community Involvement:
        Systems like JunkPOinT inspire people to take part in environmental efforts while receiving rewards
        for their contributions.


(3) In case of immediate concerns regarding environmental emergency services, where to call or send a message?


1. Department of Environment and Natural Resources (DENR):
        Landline: #DENR or #3367
        Mobile Phone: 0917-868-DENR (0917-868-3367) or 0917-885-DENR (0917-885-3367)
        Email: aksyonkalikasan@denr.gov.ph or web@denr.gov.ph
2. DENR Water Resources Management Office (WRMO):
        Hotline - SMS or Viber ("Wag Pataksaya"): 0949-884-8927
        Online Form: National Water Service Online Form
3. Environmental Management Bureau (EMB) CALABARZON:
        EMB CALABARZON Regional Office: 02-8653-3507 or trunk line (02) 8705-0380 to 89
        EMB Provincial Environmental Management Unit (PEMU) Batangas: 0927-310-8016
        Solid Waste Management Concerns: 0918-935-3541, 0943-706-1954, or 0917-558-2023
        Email: ord_calabarzon@emb.gov.ph or complaints_calabarzon@emb.gov.ph
4. JunkPOinT Recyclable Trash Redemption System Developers:
        Email:  24-07754@g.batstate-u.edu.ph (HAZEL AGUILAR)
                24-03337@g.batstate-u.edu.ph (BERNARDO LAURENZ ULYSSYS DOMINGO)
                24-02316@g.batstate-u.edu.ph (RUJ MICHAEL GARCIA)
                24-05806@g.batstate-u.edu.ph (LAURENCE PANGANIBAN)


Enter other questions or concerns (If none, type "None / none"): None


Thank you for your cooperation! We're happy to help and serve you.


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
================================================================================================================


Menu:
1. View System Foreword
2. Register an Account
3. Login an Account
4. Continue as Guest to Donate
5. Help
6. Exit
Select a menu item (1-6): 5




================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
                                                      HELP
================================================================================================================


(1) How to use the Recyclable Trash Redemption System?


1. Select a menu item you want to access.
2. Use each menu according to its function:
        View System Foreword: Displays the system introduction and purpose.
        Register an Account: Creates a new user account for system login.
        Login an Account: Logs in an existing account to access system features.
        Continue as Guest to Donate: Allows users without an account to donate recyclable trash.
        Help: Shows information about the system, the importance of recycling, and general assistance.
        Exit: Closes the system.
3. For each section, provide all required information to ensure smooth operation and accurate processing.
4. After exiting, run the system again to make another submission or access additional features.


(2) Why is recycling important?


        Recycling plays a major role in protecting the environment and conserving resources. Here are the key
reasons why recycling is essential:
1. Reduces Waste in Landfills:
        Recycling helps decrease the amount of trash that ends up in landfills, preventing overflow and
        pollution.
2. Saves Natural Resources:
        Materials like plastic, metal, paper, glass, and electronics can be recycled and reused, reducing
        the need to extract new raw materials from nature.
3. Lowers Energy Consumption:
        Producing items from recycled materials often uses far less energy than manufacturing new ones.
4. Prevents Pollution:
        Recycling reduces harmful emissions, protects ecosystems, and helps keep air, water, and soil clean.
5. Supports Sustainability:
        It promotes responsible resource use, ensuring a healthier and greener environment for future genera-
        tions, and supports SDG 11 (Sustainable Cities and Communities) and SDG 12 (Responsible Consumption
        and Production) by the United Nations.
6. Encourages Community Involvement:
        Systems like JunkPOinT inspire people to take part in environmental efforts while receiving rewards
        for their contributions.


(3) In case of immediate concerns regarding environmental emergency services, where to call or send a message?


1. Department of Environment and Natural Resources (DENR):
        Landline: #DENR or #3367
        Mobile Phone: 0917-868-DENR (0917-868-3367) or 0917-885-DENR (0917-885-3367)
        Email: aksyonkalikasan@denr.gov.ph or web@denr.gov.ph
2. DENR Water Resources Management Office (WRMO):
        Hotline - SMS or Viber ("Wag Pataksaya"): 0949-884-8927
        Online Form: National Water Service Online Form
3. Environmental Management Bureau (EMB) CALABARZON:
        EMB CALABARZON Regional Office: 02-8653-3507 or trunk line (02) 8705-0380 to 89
        EMB Provincial Environmental Management Unit (PEMU) Batangas: 0927-310-8016
        Solid Waste Management Concerns: 0918-935-3541, 0943-706-1954, or 0917-558-2023
        Email: ord_calabarzon@emb.gov.ph or complaints_calabarzon@emb.gov.ph
4. JunkPOinT Recyclable Trash Redemption System Developers:
        Email:  24-07754@g.batstate-u.edu.ph (HAZEL AGUILAR)
                24-03337@g.batstate-u.edu.ph (BERNARDO LAURENZ ULYSSYS DOMINGO)
                24-02316@g.batstate-u.edu.ph (RUJ MICHAEL GARCIA)
                24-05806@g.batstate-u.edu.ph (LAURENCE PANGANIBAN)


Enter other questions or concerns (If none, type "None / none"): What are the other things that I can do with wastes?
Enter your name: Hazel C. Aguilar
Enter your email: 24-07754@g.batstate-u.edu.ph
Enter your contact number: 09914389436


Thank you for your cooperation! We'll try to contact you as soon as possible.


================================================================================================================
                                                    JunkPOinT
                                        Recyclable Trash Redemption System
                                        In Partnership with Inhinyero Café
================================================================================================================


Menu:
1. View System Foreword
2. Register an Account
3. Login an Account
4. Continue as Guest to Donate
5. Help
6. Exit
Select a menu item (1-6): 6


Exiting JunkPOinT, the Recyclable Trash Redemption System... thank you for supporting SDG No. 11 and 12!


Always Remember: The environment is where we all meet, where we all have a mutual interest; it is the one thing
all of us share. It is not only a mirror of ourselves, but a focusing lens on what we can become.
                                                   - Speech at Yale University, White House Diary, Oct. 9, 1967


So, protect it, love it, and donate waste in every bit of it!
```

Authors
Aguilar, Hazel C. - 24-07754@g.batstate-u.edu.ph

Domingo, Bernardo Laurenz Ulyssys M. - 24-03337@g.batstate-u.edu.ph

Garcia, Ruj Michael C. - 24-02316@g.batstate-u.edu.ph

Panganiban, Jann Laurence R. - 24-05806@g.batstate-u.edu.ph

Acknowledgement
With our sincerest gratitude, we first express thanks to God for the guidance that has been our foundation in overcoming challenges and accomplishing our goals. We are also grateful to our families for their unwavering support, understanding, and encouragement. Additionally, we express our heartfelt appreciation to our instructor for the guidance, insightful feedback, and continuous support throughout the development process. We likewise acknowledge our team, whose collaboration, dedication, and shared commitment made this work possible, with each member’s effort and creativity contributing greatly to the completion of this system. Finally, to everyone who offered support in any form, our sincerest appreciation is extended. Your contributions have been truly invaluable.
