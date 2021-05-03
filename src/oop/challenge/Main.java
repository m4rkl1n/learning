package oop.challenge;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("harry", 28,
                new Eye("left eye", "short sighted", "red", true),
                new Eye("right eye", "normal", "red", true),
                new Heart("heart", "normal", 76));
    }
}
