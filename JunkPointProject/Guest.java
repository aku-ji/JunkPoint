public class Guest extends Person {
  public Guest(String name) {
    super(name);
  }

  @Override
  public void displayMenu() {
  
  }

  public void donateWaste() {
    System.out.println("\nThank you for choosing to donate waste!");
    System.out.println("Your donation helps the environment.");

    System.out.println("\nWaste Material Types:");
    System.out.println("1. Plastic");
    System.out.println("2. Metal");
    System.out.println("3. Glass");
    System.out.println("4. Paper");
    System.out.println("5. Electronics");
    System.out.print("Select a material you want to donate (1-5): ");

    int materialChoice = JunkPoint.input.nextInt();
    JunkPoint.input.nextLine();

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
    int quantity = JunkPoint.input.nextInt();
    JunkPoint.input.nextLine();

    double co2Saved = calculateCO2Saved(material, quantity);

    System.out.printf("\nThank you for donating %d %s item(s)!\n", quantity, getMaterialName(material));
    System.out.printf("Your donation helps save approximately %.2f kg of CO2 emissions!\n", co2Saved);
    System.out.println("Your contribution makes a difference for our environment!");
  }

  private double calculateCO2Saved(String material, int quantity) {
      return switch (material.toLowerCase()) {
          case "plastic" -> quantity * 0.15;
          case "metal" -> quantity * 0.4;
          case "glass" -> quantity * 0.03;
          case "paper" -> quantity * 0.09;
          case "electronics" -> quantity * 1.5;
          default -> 0;
      };
  }

  private String getMaterialName(String material) {
      return switch (material.toLowerCase()) {
          case "plastic" -> "plastic waste";
          case "metal" -> "metal waste";
          case "glass" -> "glass waste";
          case "paper" -> "paper waste";
          case "electronics" -> "electronic waste";
          default -> "waste";
      };
  }
}
