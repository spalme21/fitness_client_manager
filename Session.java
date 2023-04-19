import java.time.LocalDate;

public class Session {

    /**
     * The type of class for the session
     */
    private ClassType classType;

    /**
     * The trainer leading the session
     */
    private Trainer trainer;

    /**
     * A list of the clients in a session
     */
    private ArrayList<Client> clients;

    /**
     * Create a new training session
     * @param classType the type of class
     * @param trainer   the trainer leading the session
     */
    public Session(ClassType classType, Trainer trainer) {

        this.classType = classType;
        this.trainer = trainer;

        // start with no clients
        this.clients = new ArrayList<Client>();

    }

}