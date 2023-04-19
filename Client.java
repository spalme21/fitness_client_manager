
public class Client {

    /**
     * The first name of the client
     */
    private String firstName;

    /**
     * The last name of the client
     */
    private String lastName;

    /**
     * The number of credits the client has
     */
    private int credits;

    /**
     * Create a new client
     * @param firstName the first name of the client
     * @param lastName  the last name of the client
     */
    public Client(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

        // start with zero credits
        this.credits = 0;

    }

}