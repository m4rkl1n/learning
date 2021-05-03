package oop.challenge;

public class Heart extends Organ{
    private int heartRate;

    public Heart(String name, String condition, int heartRate) {
        super(name, condition);
        this.heartRate = heartRate;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("heart rate: " + this.getHeartRate());
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
