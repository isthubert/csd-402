/* Isaac St Hubert 03/08/2026 Module 10.2
   This program creates and displays different types of company divisions.*/


public class UseDivision {

    /**
     * Main method that creates two international and
     * two domestic division objects and displays their information.
     * 
     * @param args
     */
    public static void main(String[] args) {

        InternationalDivision intDiv1 = new InternationalDivision(
                "Euro Facility", 101, "Germany", "German");

        InternationalDivision intDiv2 = new InternationalDivision(
                "Asia Facility", 102, "Japan", "Japanese");

        DomesticDivision domDiv1 = new DomesticDivision(
                "West Coast Operations", 103, "California");

        DomesticDivision domDiv2 = new DomesticDivision(
                "East Coast Operations", 104, "New York");

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}