public class Boohbah {
    private String name;
    private String danceMove;

    public Boohbah(String name, String dance) {
        this.name = name;
        this.danceMove = dance;
    }
    public String getName() {
        return this.name;
    }
    public String getDanceMove() {
        return this.danceMove;
    }
    public String performMove() {
        return getName() + " performs " + getDanceMove();
    }
}