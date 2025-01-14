/* Building a Droid to performance tasks while the battery is getting drained
Made by Diogo in 2025
*/
class Droid {
  String name;
  int batteryLevel;
  public String toString(){
    return "Hello, I'm the droid: " + name;
  }
  public static void main(String[] args){
    Droid myDroid = new Droid("Codey");
    System.out.println(myDroid);
    myDroid.performTask("dancing");
    myDroid.performTask("cleaning");
    myDroid.performTask("washing dishes");
    myDroid.energyReport();
    
  }

  public Droid(String droidName){
    batteryLevel = 100;
    name = droidName;
  
  }

  public void performTask(String task){
    System.out.println(name + " is performing task: " + task);
    batteryLevel = batteryLevel - 10;

  }

  public int energyReport(){
    System.out.println(name + " current battery is " + batteryLevel);
    return batteryLevel;
  }
}
