import java.util.ArrayList;
import java.util.List;

/**
 * Subclass representing a user.
 */
public class User extends Person implements Redeemable {
  private String username;
  private String password;
  private double points;
  private List<Voucher> vouchers;

  public User(String name, String username, String password) {
    super(name);
    this.username = username;
    this.password = password;
    this.points = 0;
    this.vouchers = new ArrayList<>();
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public double getPoints() {
    return points;
  }

  public void addPoints(double p) {
    this.points += p;
  }

  public void deductPoints(double p) {
    this.points -= p;
  }

  public void addVoucher(Voucher voucher) {
    vouchers.add(voucher);
  }

  public List<Voucher> getVouchers() {
    return vouchers;
  }

  @Override
  public void displayMenu() {
    //-------------
  }

  @Override
  public void redeemPoints(double points) throws InsufficientPointsException {
    if (this.points < points) {
      throw new InsufficientPointsException("\nNot enough points for redemption!");
    }
    this.points -= points;
  }

  /**
   * Converts points to cash.
   * 
   * @param points         The number of points to convert.
   * @param conversionRate The conversion rate (e.g., 1 point = 0.50 PHP).
   * @return The cash value.
   */
  public double convertPointsToCash(double points, double conversionRate) throws InsufficientPointsException {
    if (this.points < points) {
      throw new InsufficientPointsException("\nNot enough points for conversion!");
    }
    this.points -= points;
    return points * conversionRate;
  }
}
