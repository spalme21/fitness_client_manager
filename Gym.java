
import java.util.ArrayList;

public class Gym {

    /**
     * The name of the gym.
     */
    private String name;

    /**
     * A list of the gym's trainers.
     */
    private ArrayList<Trainer> trainers;
    
    /**
     * A list of the gym's clients.
     */
    private ArrayList<Client> clients;

    /**
     * A log of the gym's sessions.
     */
    private ArrayList<Session> sessionLog;

    public Gym(String name) {

        this.name = name;

        // start with empty lists of trainers, clients, and sessions
        this.trainers = new ArrayList<Trainer>();
        this.clients = new ArrayList<Client>();
        this.sessionLog = new ArrayList<Session>();

    }
}