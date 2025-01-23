import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int r,sum = 0,temp;
        System.out.println("Enter a number : ");
        int num = obj.nextInt();
        temp = n;
        while(n>0){
            r = n % 10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp == sum){
            System.out.println("Number is palindrom number");
        }else{
            System.out.println("Number is not palindrome number");
        }

    }
}