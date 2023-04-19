
import java.util.*;
class Atm{
    float Bal;
    int PIN=12345;
    Atm(){
        System.out.println("Enter the pin ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == PIN) {
            Menu();
        }
        else {
            System.out.println("Enter the right Pin	");
        }

    }
    public void Menu() {
        System.out.println("Enter the number ");
        System.out.println("1 .-> cheakBalence ");
        System.out.println("2 -> disposit ");
        System.out.println("3 -> withdrawMonney");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if(x == 1) {
            cheakBalence();
        }
        else if(x == 2) {
            disposit();

        }
        else if(x == 3) {
            withdrawMonney();
        }
    }
    public void cheakBalence() {
        System.out.println("Your Balence is now "+Bal);
        Menu();
    }
    public void disposit() {
        System.out.println("Your Current Balence is "+ Bal);
        System.out.println("Enter the amount to deposit");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        Bal = Bal + x;
//	cheakBalence();
        Menu();
    }
    public void withdrawMonney() {
        System.out.println("Your Current Balence is "+ Bal);
        System.out.println("Enter the amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        if(Bal < x) {
            System.out.println("Invaild Balence");
//		cheakBalence();

        }
        else {
            Bal = Bal - x;
        }
        Menu();
    }


}

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Atm obj= new Atm();

    }

}
