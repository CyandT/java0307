package indi.arraylist;

public class MovieDemo4 {
    private String name;
    private double scores;
    private String actor;

    public MovieDemo4() {
    }

    public MovieDemo4(String name, double scores, String actor) {
        this.name = name;
        this.scores = scores;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
