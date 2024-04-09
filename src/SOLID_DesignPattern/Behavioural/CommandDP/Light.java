package SOLID_DesignPattern.Behavioural.CommandDP;

public class Light {

    private boolean turnedOn;

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    //receiver method --> receives the command and acts on the command
    public void turnOn(){
        this.turnedOn = true;
        System.out.println("Light has been turned on!");
    }
}
