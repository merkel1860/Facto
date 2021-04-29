package core;

public class Human implements IAnimal {
    private float height;
    private float weight;
    private String gender;


    public Human() {
    }

    public Human(float height, float weight, String gender) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public void move() {
        System.out.println("Moving...");
    }

    @Override
    public void speak() {
        System.out.println("Speaking...");

    }
}
