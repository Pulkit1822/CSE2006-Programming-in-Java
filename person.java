import java.util.Scanner;

class Person {
  String name;
  
  Person(String name) {
    this.name = name;
  }
}

class Programmer extends Person {
  String language;
  
  Programmer(String name, String language) {
    super(name);
    this.language = language;
  }
}

class Program extends Programmer {
  String framework;
  
  Program(String name, String language, String framework) {
    super(name, language);
    this.framework = framework;
  }
  
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter language: ");
        String language = sc.nextLine(); 
        System.out.print("Enter framework: ");
        String framework = sc.nextLine();
        
        Program p = new Program(name, language, framework);
        System.out.println(p.name);
        System.out.println(p.language);
        System.out.println(p.framework);
    }
  }
}