# JunkPOinT: Waste Management and Environmental Contribution System

## Project Overview

JunkPOinT is a Java console application designed to promote sustainable waste management through both incentivized and altruistic approaches. The system allows registered users to earn points for waste collection that can be redeemed for rewards, while also providing a guest donation mode for individuals who want to contribute to environmental sustainability without earning rewards.

## System Features

### For Registered Users

- Record waste collection activities
- Earn points based on waste type and quantity
- Redeem points for food and drink vouchers
- Convert points to cash
- View transaction history

### For Guest Users

- Donate waste without registration
- View environmental impact of donations (CO2 savings)
- Access material information
- Simple and immediate contribution to sustainability

## Object-Oriented Programming Concepts Applied

### Encapsulation

- Private fields with controlled access through getters and setters
- Data protection and integrity across all classes

### Inheritance

- `Person` as the base abstract class
- `User` and `Guest` as subclasses with specific implementations

### Polymorphism

- Overridden `displayMenu()` method in each subclass
- Common interface with type-specific behavior

### Abstraction

- Abstract `Person` class defining common structure
- Implementation details hidden from users

### Exception Handling

- Custom exceptions for specific error conditions
- Graceful error recovery and user feedback

## System Architecture

```

+----------------+
| Person |
|----------------|
| - name: String |
|----------------|
| + getName() |
| + displayMenu()|
+----------------+
^ ^
| |
| |
+----------------+ +----------------+
| User | | Guest |
|----------------| |-----------------|
| - username | | |
| - hashedPassword| |-----------------|
| - points | | + displayMenu() |
| - vouchers | | + donateWaste() |
| - cashBalance | +-----------------|
|----------------|
| + getUsername()|
| + verifyPassword()|
| + addPoints() |
| + redeemPoints()|
| + convertPointsToCash()|
| + cashOut() |
+----------------+

```

## Class Descriptions

1. **Person (Abstract Class)**

   - Base class for all user types
   - Contains common attributes and methods

2. **User Class**

   - Manages registered user operations
   - Handles waste collection, point management, and rewards

3. **Guest Class**

   - Provides waste donation functionality without rewards
   - Calculates and displays environmental impact of donations

4. **Voucher Class**

   - Represents redeemable vouchers for registered users

5. **WasteCalculator Class**
   - Calculates points for waste materials
   - Provides material information

## Implementation Details

### Guest Donation Mode

- Allows anyone to contribute waste without registration
- Shows environmental impact (CO2 savings) of each donation
- No points or rewards awarded
- Simple and immediate way to support sustainability

### Environmental Impact Tracking

- Calculates approximate CO2 savings for each material type
- Provides feedback on the positive environmental contribution
- Raises awareness about recycling benefits

### User Experience

- Clear menu structure for both registered and guest users
- Informative feedback on all actions
- Easy navigation between options

## How to Compile and Run the Program

### Prerequisites

- Java Development Kit (JDK) 8 or higher

### Compilation and Execution

1. Navigate to the project directory:
   ```sh
   cd path/to/JunkPointProject
   ```

````

2. Compile all Java source files:

   ```sh
   javac *.java
   ```

3. Run the main application:
   ```sh
   java JunkPoint
   ```

## Sample Program Execution

```
===== JunkPOinT System =====
1. View System Foreword
2. Register
3. Login
4. Donate as Guest
5. Help
6. Exit
Choose: 4

Guest Donation Mode: Donate waste or view material list...

===== GUEST MENU =====
1. Donate Waste
2. View Material List
3. Exit Guest Mode
Choose: 1

===== DONATE WASTE =====
Thank you for choosing to donate waste!
Your donation helps the environment.

POINTS PER MATERIAL (per kg):
1. Plastic
2. Metal
3. Glass
4. Paper
5. Electronics

Select material type by number:
1. Plastic
2. Metal
3. Glass
4. Paper
5. Electronics
Choose: 1
Enter quantity (kg): 2

Thank you for donating 2.00 kg of plastic!
Your donation helps save approximately 3.00 kg of CO2 emissions!
Your contribution makes a difference for our environment!
```

## Future Enhancements

1. **Database Integration**

   - Store user data and transactions
   - Track environmental impact over time

2. **Graphical User Interface**

   - Develop a user-friendly GUI
   - Visual representation of environmental impact

3. **Mobile Application**

   - Create a mobile version for wider accessibility
   - Location-based waste collection points

4. **Community Features**

   - Leaderboards for top recyclers
   - Community challenges and goals

5. **Educational Content**

   - Information about recycling benefits
   - Tips for reducing waste

6. **Partnership Integration**
   - Collaboration with local recycling centers
   - Real-time waste collection tracking

## Environmental Impact

JunkPOinT contributes to several Sustainable Development Goals:

- **SDG 11: Sustainable Cities and Communities**

  - Promotes responsible waste management in urban areas
  - Encourages community participation in sustainability

- **SDG 12: Responsible Consumption and Production**

  - Incentivizes recycling and proper waste disposal
  - Reduces environmental impact of waste

- **SDG 13: Climate Action**
  - Reduces CO2 emissions through recycling
  - Raises awareness about climate change mitigation

## Conclusion

JunkPOinT provides a dual approach to waste management:

1. **Incentivized Recycling**: For registered users who earn rewards
2. **Altruistic Donation**: For guests who want to contribute without rewards

This system promotes environmental responsibility while accommodating different user motivations. Whether users are motivated by rewards or simply want to make a positive environmental impact, JunkPOinT provides an accessible platform for sustainable waste management.

## Authors

- [Your Full Name]
- [Your Student ID]
- [Your University]
- [Your Course and Section]

## Acknowledgments

Special thanks to:

- Our instructor for guidance and support
- Classmates for feedback and collaboration
- Environmental organizations for inspiration
````
