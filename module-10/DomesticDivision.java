/* Isaac St Hubert 03/08/2026 Module 10.2
   Represents a domestic company division located within a state.*/


public class DomesticDivision extends Division {

    private String state;

    /**
     * Constructor that initializes domestic division information
     * 
     * @param divisionName
     * @param accountNumber
     * @param state
     */
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    /**
     * Displays all information about the domestic division.
     */
    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}