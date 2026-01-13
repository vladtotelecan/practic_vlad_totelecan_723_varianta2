package model;

public class Fahrer {
    int id;
    String name;
    String team;
    FahrerStatus  status;
    int skillLevel;

    @Override
    public String toString() {
        return String.format("[%d] %s (%s) %s, skill = %d", id, name, team, status, skillLevel);
    }
}
