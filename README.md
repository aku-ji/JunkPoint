# ♻️ JunkPOinT

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java)
![Course](https://img.shields.io/badge/Course-IT_2109-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Complete-success?style=for-the-badge)

> **Recyclable Trash Redemption System** > *Promoting a cleaner, greener future through incentivized recycling.*

---

## 👥 Contributors

| Name | Role/Position |
| :--- | :--- |
| **Aguilar, Hazel C.** | Author / Developer |
| **Domingo, Bernardo Laurenz Ulyssys M.** | Developer |
| **Garcia, Ruj Michael C.** | Developer |
| **Panganiban, Jann Laurence R.** | Developer |

---

## 📖 Description & Overview

**JunkPOinT** is a console-based Java application designed to encourage sustainable habits. It functions as a Recyclable Trash Redemption System where users collect waste materials—specifically plastic, metal, glass, paper, and electronics.

* **Incentivized Recycling:** Registered users earn points based on waste type and quantity. These points can be redeemed for food items or converted into cash.
* **Altruistic Donation:** A Guest Mode allows users to donate waste without an account. The system calculates the environmental impact by displaying the kilograms of carbon dioxide (CO₂) emissions saved.

This project demonstrates core **Object-Oriented Programming (OOP)** concepts (Encapsulation, Inheritance, Polymorphism, Abstraction) alongside file handling and modular design. It directly supports the **United Nations’ Sustainable Development Goals**:
* 🌍 **Goal 11:** Sustainable Cities and Communities
* ♻️ **Goal 12:** Responsible Consumption and Production

---

## 🧩 OOP Concepts Applied

### 📦 Encapsulation
The system protects sensitive user data (passwords, usernames, points) by keeping fields private. Access is strictly controlled via getter and setter methods (e.g., `addPoints`), ensuring data integrity and preventing accidental modification.

### 🧬 Inheritance
The system uses a hierarchical structure where specific roles extend a base class:
* **Parent Class:** `Person` (Abstract) holds common attributes like `name`.
* **Child Classes:** `User` and `Guest` extend `Person`. `Guest` inherits behavior but is restricted from using `Redeemable` features.

### 🎭 Polymorphism
Methods behave differently depending on the object invoking them:
* **Method Overriding:** The `displayMenu()` method is defined in `Person` but implemented differently in `User` (full dashboard) vs. `Guest` (donation only).
* **Object Representation:** The `Voucher` class overrides `toString()` to print a formatted receipt instead of a memory address.

### 🧱 Abstraction
Complex logic is hidden behind simple method calls:
* **Logic Hiding:** Methods like `calculatePoints()` and `convertPointsToCash()` hide the mathematical formulas and multipliers from the main application flow.
* **Cleaner Code:** The main program focuses on the flow, while the backend classes handle the detailed calculations.

---

## 📂 Program Structure

### 🖥️ Menu Hierarchy

<details>
<summary><strong>Click to view the full User Menu structure</strong></summary>

1.  **View System Foreword**
2.  **Register an Account**
3.  **Login an Account**
    * **1. Record Waste Collection** (Plastic, Metal, Glass, Paper, Electronics)
    * **2. View Points**
    * **3. Redeem Points for Item** (Food Categories -> Specific Items -> Generate Voucher)
    * **4. Convert Points to Cash**
    * **5. View Vouchers**
    * **6. Logout**
4.  **Continue as Guest to Donate**
    * **1. Donate Waste** (Calculate CO₂ Savings)
    * **2. View Material List** (CO₂ Contribution factors)
    * **3. Exit Guest Mode**
5.  **Help / Assistance**
    * System Guide
    * Importance of Recycling
    * Emergency Contacts (DENR, EMB)
    * Submit Questions/Concerns
6.  **Exit**

</details>

### 📁 File Directory

| File Name | Description |
| :--- | :--- |
| `JunkPoint.java` | **Driver Class.** Manages the main console UI, user authentication, and menu navigation. |
| `User.java` | **Entity.** Represents a registered user. Handles point balance, voucher storage, and implements `Redeemable`. |
| `Guest.java` | **Entity.** Represents a guest user. Handles waste donation and CO₂ emission saving calculations. |
| `Person.java` | **Abstract Parent.** Defines the base structure (name) and abstract methods (`displayMenu`) for all actors. |
| `Voucher.java` | **Data Object.** Represents a redeemed item with a unique code, series, and description. |
| `WasteCalculator.java` | **Utility.** Stores point values using a HashMap and performs point calculations. |
| `Redeemable.java` | **Interface.** Defines the contract for redeeming points and converting points to cash. |
| `InsufficientPointsException.java` | **Custom Exception.** Handles errors when a user attempts to spend more points than they own. |

---

## ⚙️ How to Run

To ensure all classes are correctly compiled and linked, please follow these steps in your terminal:

**1. Compile the source code:**
```bash
javac *.java
