public class Bird {
    private String name;

    /**
     * Constructor for Bird object
     * @param name the name of the bird
     */
    public Bird(String name) {
        this.setName(name);
    }

    /**
     * Sets the name of the Bird
     * @param name the name of the bird
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the bird
     * @return the name of the bird
     */
    public String getName() {
        return name;
    }

    /**
     * Makes the bird talk
     * @param line what the bird says
     */
    public void talk(String line) {
        System.out.println(this.getName() + ": " + line);
    }
}