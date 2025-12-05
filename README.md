<div align="center">

# ་༘࿐་🗑️ִֶָ. ..𓂃 ࣪ ִֶָ JunkPOinTִֶָ . ..𓂃 ࣪ ִֶָ🗑️་༘࿐

### Recyclable Trash Redemption System

<br> 💻 **HaBeRuLa++** 💻

**IT-2109**

Aguilar, Hazel C.
<br>
Domingo, Bernardo Laurenz Ulyssys M.
<br>
Garcia, Ruj Michael C.
<br>
Panganiban, Jann Laurence R.

</div>

---

## 📖 Overview

**JunkPOinT** is a console-based Java application designed as a *Recyclable Trash Redemption System*. It encourages recycling practices by allowing users to receive rewards for collecting waste materials such as plastic, metal, glass, paper, and electronics.

Users record their waste collections to earn points based on material type and quantity. These points can be:
* Redeemed for food items.
* Converted into cash.
* Donated (showing the weight of carbon dioxide emissions saved).

This system works directly through the terminal, demonstrating the practical use of **Object-Oriented Programming (OOP)** concepts alongside proper file handling and modular design. It supports the **United Nations’ Sustainable Development Goals**:
* **Goal 12:** Responsible Consumption and Production
* **Goal 11:** Sustainable Cities and Communities

---

## 🧩 OOP Concepts Applied

### 🔒 Encapsulation
In the JunkPOint system, encapsulation is shown by keeping user-related information such as passwords, usernames, accumulated points, and transaction records private. Instead of allowing other parts of the program to directly change these values, the system uses controlled methods like getters, setters, and updating functions. This protects user data and ensures that important values, such as points or passwords, cannot be altered accidentally or improperly.

### 🧬 Inheritance
Inheritance appears in the system through the relationship between user types. For example, the `Guest` class can extend a base user-type structure, allowing it to inherit common features such as viewing menu options, accessing recycling information, and participating in basic system functions like donating waste. The Guest class automatically gains essential behaviours from the parent class but can still impose restrictions such as not being able to redeem items or convert points.

### 🎭 Polymorphism
The system utilises polymorphism to allow methods to behave differently based on the object calling them. The `displayMenu()` method is defined in the abstract `Person` class but is implemented differently in the `User` and `Guest` subclasses. This ensures that while both are treated as "Persons," a registered User sees the full dashboard while a Guest sees only donation options. Additionally, the `Voucher` class overrides the `toString()` method to provide a custom formatted display of the voucher details when printed.

### 🧱 Abstraction
Abstraction is demonstrated in the system by hiding complex processes inside simple and easy-to-use methods. Methods like `calculatePoints()` or `convertPointsToCash()` do all the detailed work. This hides the formulas and lets the main programming simply call it. The main program just calls these methods and shows the results. This makes the code easier to read and maintain. It helps focus on what the program does rather than how it works internally.


---

## ⚙️ Program Structure

### 👤 User Features
1.  **View System Foreword**
2.  **Register an Account**
3.  **Login an Account**
    * **Record Waste Collection** (Plastic, Metal, Glass, Paper, Electronics)
    * **View Points**
    * **Redeem Points for Item** (Food Categories -> Specific Items -> Voucher Generation)
    * **Convert Points to Cash**
    * **View Vouchers**
    * **Logout**

### 👤 Guest Features
4.  **Continue as Guest**
    * **Donate Waste** (Calculates CO2 emissions saved)
    * **View Material List** (View CO2 contribution weights)
    * **Exit Guest Mode**

### ℹ️ System Features
5.  **Help / Assistance**
    * User Guide
    * Importance of Recycling
    * Emergency Contacts (DENR, EMB, etc.)
    * Developer Contact Form
6.  **Exit System**

---

## 📂 Project Structure

| File | Description |
| :--- | :--- |
| **`JunkPoint.java`** | **Main Entry Point.** The core simulation managing the console UI, navigation, menus, and transaction flows. |
| **`User.java`** | Manages registered user data, point balance, voucher storage, and rewards logic. |
| **`Guest.java`** | Handles guest functionalities, specifically waste donation and CO2 calculation without account storage. |
| **`Person.java`** | **Abstract Base Class.** Enforces the structure (e.g., `name`, `displayMenu()`) for all user types. |
| **`Voucher.java`** | Data structure for redeemed items, generating unique `voucherCode` and details. |
| **`WasteCalculator.java`** | Utility class using a `HashMap` to store point values and calculate totals based on waste type/quantity. |
| **`Redeemable.java`** | **Interface.** Defines the contract for redeeming items and converting points to cash. |
| **`InsufficientPointsException.java`** | **Custom Exception.** Handles errors when a user attempts to spend more points than available. |

---


## 💻 Features
   1. View System Foreword. Displays the system introduction and purpose.
   2. Register an Account: Creates a new user account for system login.
   3. Log in an Account: Logs in an existing account to access system features.
      1. Record Waste Collection: Displays the list of points per material based on quantity and allows users to select a material and its quantity to record collected waste.
      2. View Points: Displays the user’s total current or updated points recorded.
      3. Redeem Points for Item: Displays the redeem options, including the food category list and the main food lists, and users should select on both lists to redeem the points for food, which will be served            as the voucher.
      4. Convert Points to Cash: Displays the total current points; then the user should enter the total points wanted to be converted into money, and it displays once again the total amount of that money.
      5. View Vouchers: Displays the voucher details from the redeemed points for an item or food.
      6. Logout: Exits the user menu.
   4. Continue as a Guest to Donate: Allows users without an account to donate recyclable trash.
      1. Donate Waste: Displays the system message and waste material types, then the user should select the type of waste collected from the list and its quantity. After, there’s the system message again,             including the type and no. of waste items and the weight in kilograms of saved carbon dioxide emissions.
      2. View Material List: Displays the list of weights per material on the  carbon dioxide contribution.
   5. Exit Guest Mode: Exits the guest mode.
      Help: Shows information about the system, the importance of recycling, and general assistance.
      Exit: Closes the system. 

## 🚀 How to Run

1. Open your terminal and run the program using:
2. JunkPoint.java


```bash

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

---

## 👥 Authors

| Team Member | Student Email |
| :--- | :--- |
| **Aguilar, Hazel C.** | `24-07754@g.batstate-u.edu.ph` |
| **Domingo, Bernardo Laurenz Ulyssys M.** | `24-03337@g.batstate-u.edu.ph` |
| **Garcia, Ruj Michael C.** | `24-02316@g.batstate-u.edu.ph` |
| **Panganiban, Jann Laurence R.** | `24-05806@g.batstate-u.edu.ph` |

---

## 💐 Acknowledgement

> *With our sincerest gratitude, we first express thanks to God for the guidance that has been our foundation in overcoming challenges and accomplishing our goals.*
>
> We are also grateful to our **families** for their unwavering support, understanding, and encouragement. Additionally, we express our heartfelt appreciation to our **instructor** for the guidance, insightful feedback, and continuous support throughout the development process.
>
> We likewise acknowledge our **team**, whose collaboration, dedication, and shared commitment made this work possible, with each member’s effort and creativity contributing greatly to the completion of this system. Finally, to everyone who offered support in any form, our sincerest appreciation is extended. Your contributions have been truly invaluable.

## 📂 References
> Inhinyero Tea House. https://www.facebook.com/profile.php?id=100092842797401
