public class fuelArray {

  public static void main(String[] args) {
    new fuelArray().go();
  }

  public void go(){

    int[] refuel = new int[4];
    int total =0;

    refuel[0] = 27;
    refuel[1] = 38;
    refuel[2] = 4;
    refuel[3] = 40;

    for (int i = 0; i < 4; i++)
      System.out.printf("Week %d: %d liters.%n",i +1 , refuel[i]);

    for (int i = 0; i < refuel.length; i++)
      total += refuel[i];
    System.out.println("total: " + total);

    System.out.println();
    refuel[2] = 35;
    System.out.println("new 2: " + refuel[2]);




  }
}
