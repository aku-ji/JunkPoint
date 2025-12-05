/**
 * Interface for redeeming points.
 */
public interface Redeemable {
  void redeemPoints(double points) throws InsufficientPointsException;

  double convertPointsToCash(double points, double conversionRate) throws InsufficientPointsException;
}
