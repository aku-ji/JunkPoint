/**
 * Class representing a voucher.
 */
public class Voucher {
  private String itemName;
  private String series;
  private String details;
  private String voucherCode;

  public Voucher(String itemName, String series, String details) {
    this.itemName = itemName;
    this.series = series;
    this.details = details;
    this.voucherCode = "VCH-" + (int) (Math.random() * 10000);
  }

  public String getItemName() {
    return itemName;
  }

  public String getSeries() {
    return series;
  }

  public String getDetails() {
    return details;
  }

  public String getVoucherCode() {
    return voucherCode;
  }

  @Override
  public String toString() {
    return String.format(
        "\nVoucher Code: %s\nSeries: %s\nItem: %s\nDetails: %s",
        voucherCode, series, itemName, details);
  }
}
