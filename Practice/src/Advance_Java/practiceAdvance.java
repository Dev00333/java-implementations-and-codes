package Advance_Java;
public class practiceAdvance {
    interface A{int add(int a, int b);}
    interface B{int sub(int a,int b);}
    interface C{int mul(int a,int b);}
    interface D{int div(int a,int b);}
    interface E{int rem(int a,int b);}
    static class demo{
        static void main() {
            A objA= Integer::sum;
            int addition=objA.add(5,5);
            System.out.println(addition);
            B objB=(a,b)-> a-b;
            int subtraction= objB.sub(10,5);
            System.out.println(subtraction);
            C objC= (a,b)-> a*b;
            int multiplication= objC.mul(10,5);
            System.out.println(multiplication);
            try {
                D objD= (a,b)-> a/b;
                int division= objD.div(10,0);
                System.out.println(division);
            } catch (RuntimeException e) {
                System.out.println("Exception: You cannot divide by zero");
            }
            E objE= (a,b)-> a%b;
            int remainder= objE.rem(11,5);
            System.out.println(remainder);
        }
    }
}