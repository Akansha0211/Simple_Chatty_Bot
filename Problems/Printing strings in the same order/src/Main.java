//import java.io.EOFException;
import java.util.Scanner;

class Main {
    //private static Object EOFException;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b =scanner.next();
        scanner.nextLine();
        String c = scanner.nextLine();
        System.out.println(a);
        System.out.println(b);
        for( String  var : c.split(" ")){
            System.out.println(var);
        }


    }
}