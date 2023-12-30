public class Average {

  // data members
  private int num1;
  private int num2;
  private int num3;

  // parameterized constructor
  public Average(int n1, int n2, int n3) {
    this.num1 = n1;
    this.num2 = n2; 
    this.num3 = n3;
  }

  // method to calculate average
  public double calculateAverage() {
    return (num1 + num2 + num3) / 3.0;
  }

  public static void main(String[] args) {
    Average avg = new Average(10, 20, 30);
    System.out.println("Average is: " + avg.calculateAverage());
  }

}