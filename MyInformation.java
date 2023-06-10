public class MyInformation {
    // Instance variables
    private String firstName;
    private String lastName;

    // Static variable
    private static int staticAge = 30;

    // Constructor
    public MyInformation() {
        firstName = "Jhon Arol";
        lastName = "De Chavez";
    }

    public void printInformation() {
        // Local variable
        double localTemperature = 36.0;

        // Print personal information
        System.out.println("---------------------------------------");
        System.out.println("        My Personal Information");
        System.out.println("---------------------------------------");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + staticAge);
        System.out.println("Temperature: " + localTemperature);
        System.out.println("---------------------------------------");
    }

    public static void main(String[] args) {
        MyInformation myInfo = new MyInformation();
        myInfo.printInformation();
    }
}
