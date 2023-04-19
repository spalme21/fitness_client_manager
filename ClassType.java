
public enum ClassType {

    ONE_ON_ONE (1, 1, 4),
    TWO_PERSON (2, 2, 3),
    SMALL_GROUP (3, 4, 2),
    LARGE_GROUP (5, 8, 1);

    /**
     * The minimum number of clients a class must have
     */
    private final int minClassSize;

    /**
     * The maximum number of clients a class can have
     */
    private final int maxClassSize;

    /**
     * The cost of a class, in credits
     */
    private final int cost;

    ClassType(int minClassSize, int maxClassSize, int cost) {

        this.minClassSize = minClassSize;
        this.maxClassSize = maxClassSize;
        this.cost = cost;

    }

    public int minClassSize() { return minClassSize; }

    public int maxClassSize() { return maxClassSize; }

    public int creditCost() { return creditCost; }

}