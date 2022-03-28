package work;

public class Movie {
    private String name;
    private String location;
    private String type;
    private String director;
    private String performer;

    public Movie() {
    }

    public Movie(String name, String location, String type, String director, String performer) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.director = director;
        this.performer = performer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }
}
