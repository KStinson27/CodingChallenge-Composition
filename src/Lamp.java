public class Lamp {
    //Create a Class and name it lamp
    // Declare three member variables style of type string , battery of type boolean, globRating of type int
   private String style;
   private boolean battery;
   private int globRating;

    // Create constructor

    public Lamp(String style, boolean battery, int globRating){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
    //Create getter methods and turnOn() method

    public void turnOn(){
        System.out.println("Turning on lamp...");
    }

    public String getStyle(){
        return this.style;
    }

    public boolean isBattery(){
        return this.battery;
    }

    public int getGlobRating(){
        return this.globRating;
    }
}

