
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

    /**
     * Create a gym
     * @param name  the name of the gym
     */
    public Gym(String name) {

        this.name = name;

        // start with empty lists of trainers, clients, and sessions
        this.trainers = new ArrayList<Trainer>();
        this.clients = new ArrayList<Client>();
        this.sessionLog = new ArrayList<Session>();

    }

    /**
     * Create a new trainer for the gym
     * @param firstName the first name of the trainer
     * @param lastName  the last name of the trainer
     * @return          the new Trainer object
     */
    public Trainer addTrainer(String firstName, String lastName) {

        Trainer newTrainer = new Trainer(firstName, lastName);
        this.trainers.add(newTrainer);

        return newTrainer;

    }

    /**
     * Create a new client
     * @param firstName the first name of the client
     * @param lastName  the last name of the client
     * @return          the new Client object
     */
    public Client addClient(String firstName, String lastName) {

        Client newClient = new Client(firstName, lastName);
        this.client.add(newClient);

        return newClient;

    }
}