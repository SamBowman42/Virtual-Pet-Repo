public class Armadillo {
    private String name;

    /**
     * Constructor for Armadillo object
     * @param name the name of the armadillo
     */
    public Armadillo(String name) {
        this.setName(name);
    }

    /**
     * Sets the name of the armadillo
     * @param name the name of the armadillo
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the armadillo
     * @return the name of the armadillo
     */
    public String getName() {
        return name;
    }

    /**
     * Makes the armadillo roll around
     */
    public void roll() {
        System.out.println(this.getName() + " curled up into a ball and started rolling around!");
    }
}