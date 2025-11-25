package PasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class SampleSpace {
    private final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    private final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String numbers = "0123456789";
    private final String symbols = "!@#$%^&*()~{}[]:;'<>,.?/-_+=`";
    private final Random random=new Random();
    public char randomLower(){
        return lowerCase.charAt(random.nextInt(0,26));
    }
    public char randomUpper(){
        return upperCase.charAt(random.nextInt(0,26));
    }
    public char randomNumber(){
        return numbers.charAt(random.nextInt(0,10));
    }
    public char randomSymbol(){
        return symbols.charAt(random.nextInt(symbols.length()));
    }
}
class RunAboveCode{
    static void main() {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        SampleSpace space=new SampleSpace();
        System.out.print("enter the length of password you need: ");
        int size=scanner.nextInt();
        StringBuilder password= new StringBuilder();
        for (int i=0;i<size;i++) {
            int a= random.nextInt(0,4);
            switch (a){
                case 0:
                    password.append(space.randomLower());
                    break;
                case 1:
                    password.append(space.randomUpper());
                    break;
                case 2:
                    password.append(space.randomNumber());
                    break;
                case 3:
                    password.append(space.randomSymbol());
                    break;
            }
        }
        System.out.println("Your generated password is "+password);
    }
}