public class MonsterAttack{
    private int attack;
    private int day;
    private int month;
    private int year;
    private String name;
    private int victims;
    private String location;


    public MonsterAttack(int attackIn, int dayIn, int monthIn, int yearIn, String nameIn, int victimsIn, String locationIn){
        attack = attackIn;
        day = dayIn;
        month = monthIn;
        year= yearIn;
        name = nameIn;
        victims = victimsIn;
        location = locationIn;
    }

    

    public int getAttack(){
        return attack;
    }
    public int getDay(){
        return day;
    }
    
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public String getName(){
        return name;
    }
    public int getVictims(){
        return victims;
    }
    public String getLocation(){
        return location;
    }
    

    public String attackList(){
        return("Attack #" + attack + " on " + month + "/" + day + "/" + year + ". " + name + " attacked " + location + " resulting in " + victims + " casulaties.");
    }
}