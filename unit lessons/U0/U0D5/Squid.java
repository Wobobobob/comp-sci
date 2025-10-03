public class Squid{
    private int tentacleCount;
    private double inkMeter;
    private String funfact;

    //default constructor
    public Squid(){
        tentacleCount = 10;
        inkMeter = 100.0;
        funfact = "you can use squid as fish bait";
    }
    //getters
    public int getTentacleCount(){
        return tentacleCount;
    }
    //setters
    public void setTentacleCount(int value)
    {
        tentacleCount = value;
    }
    //a built in method that returns all of the values of an object in a nice sentence
    public String toString(){
        return "This is a squid it has "+ tentacleCount+" tentacles and its current ink level is "+ inkMeter + " also did you know that "+ funfact +"?";
    }

    public boolean equals(Squid other){
        if(tentacleCount == other.tentacleCount && inkMeter == other.inkMeter && funfact.equals(other.funfact)){
            return true;
        }else{
            return false;
        }
    }
}