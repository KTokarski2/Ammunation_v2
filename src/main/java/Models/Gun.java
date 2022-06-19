package Models;

public class Gun {

    int id;
    String name;
    String type;
    String origin;
    double mass;
    double length;
    double caliber;
    int rounds;
    String photo;

    public Gun(int id, String name, String type, String origin, double mass, double length, double caliber, int rounds, String photo) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.origin = origin;
        this.mass = mass;
        this.length = length;
        this.caliber = caliber;
        this.rounds = rounds;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getCaliber() {
        return caliber;
    }

    public void setCaliber(double caliber) {
        this.caliber = caliber;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", origin='" + origin + '\'' +
                ", mass=" + mass +
                ", length=" + length +
                ", caliber=" + caliber +
                ", rounds=" + rounds +
                ", photo='" + photo + '\'' +
                '}';
    }
}
