public class EvenOddTest{

  public static void main(String[] args)
  {
    Scannner console = new Scanner(System.in);

    System.out.printf("Enter the beep boops: ");

    int number = console.nextInt();

    if((number %2) == 0)
    {
      System.out.printf("number %d is even number %n", number);
    }
    else
    {
      System.out.printf("Number %d is odd number %n", number);

    }
  }




}
