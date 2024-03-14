 interface Event {
    public void organize();
 }
 public class HockeyDemo implements Hockey, Event {
 
    public void setHomeTeam(String name) {
       System.out.println("Home team: " + name);
    }
 
    public void setVisitingTeam(String name) {}
 
    public void homeGoalScored() {}
 
    public void visitingGoalScored() {}
 
    public void endOfPeriod(int period) {}
 
    public void overtimePeriod(int ot) {}
 
    public static void main(String[] args) {
       HockeyDemo hockeyDemo = new HockeyDemo();
       hockeyDemo.setHomeTeam("India");
       hockeyDemo.organize();
    }
 
    public void organize() {
       System.out.println("Match organized. ");
    }
 }