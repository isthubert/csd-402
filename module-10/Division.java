/* Isaac St Hubert 03/08/2026 Module 10.2
   Abstract class representing a company division. Contains common fields shared by all divisions.*/


public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    /**
     * Constructor that initializes the division name and account number.
     * 
     * @param divisionName
     * @param accountNumber
     */
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    /**
     * Abstract method that displays division information.
     */
    public abstract void display();
}