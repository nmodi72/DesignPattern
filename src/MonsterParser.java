
public class MonsterParser {

    public static void main(String args[]) {
        AttackMonitor parser = new AttackMonitor();
        
        try{
            parser.readFile();
        }

        catch (Exception e){e.printStackTrace();}

        parser.showAttacks();
    }

}