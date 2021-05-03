package oop.challenge;

public class Eye extends Organ{
    private String colour;
    private boolean isOpened;

    public Eye(String name, String condition, String colour, boolean isOpened) {
        super(name, condition);
        this.colour = colour;
        this.isOpened = isOpened;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("colour: " + this.getColour());
    }

    public void open(){
        this.setOpened(true);
        System.out.println(this.getName() + " opened");
    }

    public void close(){
        this.setOpened(false);
        System.out.println(this.getName() + " Closed");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean Opened) {
        isOpened = Opened;
    }
}
