/* Isaac St Hubert 03/08/2026 Module 10.2
   Represents an international company division.*/


public class InternationalDivision extends Division {

    private String country;
    private String language;

    /**
     * Constructor that initializes international division information.
     * 
     * @param divisionName
     * @param accountNumber
     * @param country
     * @param language
     */
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    /**
     * Displays all information about the international division.
     */
    @Override
    public void display() {
        System.out.println("International Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}