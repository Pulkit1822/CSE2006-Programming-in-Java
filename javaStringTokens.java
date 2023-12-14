import java.io.*;
import java.util.*;

public class javaStringTokens {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           String string = scanner.nextLine().trim();
           scanner.close();
           
           if(string.isEmpty())
               System.out.println("0");
           
           else
           {
               String[] array = string.split("[ !,?\\.\\_'@]+");
               
               System.out.println(array.length);
               
               for(int i = 0; i < array.length && array[i] != null; ++ i)
                   System.out.println(array[i]);
           }
     }
}