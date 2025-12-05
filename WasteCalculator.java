import java.util.HashMap;
import java.util.Map;

/**
 * Class for calculating points from waste materials.
 */
public class WasteCalculator {
  private static final Map<String, Double> materialPoints = new HashMap<>();

  static {
    materialPoints.put("plastic", 5.0);
    materialPoints.put("metal", 10.0);
    materialPoints.put("glass", 7.0);
    materialPoints.put("paper", 2.0);
    materialPoints.put("electronics", 12.0);
  }

  public static double calculatePoints(String material, double quantity) {
    material = material.toLowerCase();
    if (materialPoints.containsKey(material)) {
      return materialPoints.get(material) * quantity;
    }
    return 0;
  }

  public static void showMaterialList() {
    System.out.println("\nPoints per Material (Based on Quantity):");
    System.out.println("1. Plastic      - 5.0 points");
    System.out.println("2. Metal        - 10.0 points");
    System.out.println("3. Glass        - 7.0 points");
    System.out.println("4. Paper        - 2.0 points");
    System.out.println("5. Electronics  - 12.0 points\n");
  }
}
