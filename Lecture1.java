import java.util.Scanner;

class Lecture1{
    public static void main(String[] args) {
        
        //validTriangle();
        //naturalNumbers();
        //evenNumbers();
        //oddNumbers();
        //printFactorial();
        //sumNaturalNumber();
        //evenNumbersSum();
        //oddNumbersSum();
        // ferenhiteToCelcius();
        // checkPrime();
        checkCharacterCase();
    }

    //check Lower Upper or Number
    public static void checkCharacterCase(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        char ch = str.charAt(0);
        //System.out.println("printing "+ch);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Upper Case");
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        }else if(ch >= 48 && ch <= 57){
            System.out.println("Numbers");
        }
    }

    //Check Prime Number
    public static void checkPrime() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        boolean check = true;
        for(int i=2; i<num/2; i++){
            if(num%i == 0)
                check = false;
        }

        if(check)
            System.out.println("Number is prime");
        else
            System.out.println("Number is Not prime");

    }


    //Convert Ferenhite to celcius
    public static void ferenhiteToCelcius(){
        Scanner sc = new Scanner(System.in);
        int feranhite = sc.nextInt();
        sc.close();

        float celcius = (feranhite - 32) / (9/5);
        System.out.printf("Feranhite %d converted to Celcius %f",feranhite, celcius);
    }

    //Sum of odd Till 1 To N inclusive 1 and N
    public static void oddNumbersSum(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int sum=0;
        for(int i=1; i<=num; i++){
            if(i%2 != 0)
                sum+=i;
        }
        System.out.println("Even Numbers Sum = "+sum);
    }

    //Sum of even Till 1 To N inclusive 1 and N
    public static void evenNumbersSum(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int sum=0;
        for(int i=2; i<=num; i+=2){
            sum+=i;
        }
        System.out.println("Odd Numbers Sum = "+sum);
    }


    //Sum of N Natural Numbers
    public static void sumNaturalNumber() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        System.out.println("PLease the Number");

        /*for(int i=1; i<=num; i++){
            sum += i;
        }*/
        //Faster way formula sum = (n*(n+1))/2
        sum = (num*(num+1))/2;
        System.out.println(sum);
    }

    //Print factorial of a number
    public static void printFactorial() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int sum = 1;
        for(int i=2; i<=num; i++){
            sum*=i;
        }
        System.out.println("Factoring ==> " + sum);
    }

    //Print All Odd numbers 1 To N where 1 and N inclusive
    public static void oddNumbers() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for(int i=1; i<=num; i++){
            if(i%2 != 0){
                System.out.print(i+" ");
            }
        }
    }

    //Pring all Even Number between 1 TO N
    public static void evenNumbers() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for(int i=2; i<num; i+=2){
            System.out.print(i+" ");
        }

    }


    //Print Numbers 1 to N
    public static void naturalNumbers() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for(int i=1; i<=num; i++){
            System.out.print(i+" ");
        }
    }

    //print valid triangle
    public static void validTriangle() {
        
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        if((a+b > c) && (a+c > b) && b+c > a){
            System.out.println("Valid Triangle");
        }else{
            System.out.println("Not Valid Triangle");
        }
    }
}
