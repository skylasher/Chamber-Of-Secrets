import java.util.Scanner;

public class buildlogic{
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    int i=10;

    System.out.println("Welcome to the Chamber.\nHere you can trade people's deepest secrets, but remember the price of a secret can only be paid with another.\n");

    slot s1 = new slot("mock user 1","mock secret 1");
    slot s2 = new slot("mock user 2","mock secret 2");
    slot s3 = new slot("mock user 3","mock secret 3");

    slot user = new slot();
    user.add();

    do{System.out.println("\n\nHere are all the secrets in the chamber:\n");
    System.out.println(s1.secret+"\n"+s2.secret+"\n"+s3.secret+"\n");
    System.out.println("Choose your trade:");
    
    int choice=sc.nextInt();

    switch(choice)
    {
      case 1: System.out.println("This sceret belongs to "+s1.name);
      s1.secret=user.secret;
      s1.name=user.name; break;

      case 2: System.out.println("This sceret belongs to "+s2.name);
      s2.secret=user.secret;
      s2.name=user.name; break;

      case 3: System.out.println("This secret belongs to "+s3.name);
      s3.secret=user.secret;
      s3.secret=user.secret; break;
    }

      System.out.println("\nTrade accepted. Your secret now belongs to the chamber.\n");
      user.update();     
      i--;
  }while(i<10);

      System.out.println("\n\nHere are all the secrets in the chamber:\n");
      System.out.println(s1.secret+"\n"+s2.secret+"\n"+s3.secret+"\n");

      sc.close();
    
  }
}

class slot{
  String name;
  String secret;

  public slot (String name, String secret)
  {
    this.name=name;
    this.secret=secret;
  }

  public slot() {};

  void add(){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name to begin:");
    name=sc.nextLine();

    System.out.println("Enter your secret:");
    secret=sc.nextLine();

    
  }

  void update()
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name to begin:");
    name=sc.nextLine();

    System.out.println("Enter your secret:");
    secret=sc.nextLine();
  }
}
