/**
 * Abstract superclass representing a generic person.
 */
public abstract class Person {
  protected String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  /**
   * Abstract method to display the menu.
   * Subclasses must implement this method.
   */
  public abstract void displayMenu();
}
