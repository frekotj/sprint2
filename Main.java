import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: Small, Medium, or Large: ");
        s = sc.nextLine();
        System.out.println("You entered: "+s);
        if(s.equals("Small")){
            new Display();}
        else if(s.equals ("Medium")){
            new Display2();}
        else if(s.equals ("Large")){
            new Display3();}
        }
    }
