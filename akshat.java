import java.util.Scanner;
public class akshat{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("please enter number to cheak prime : ");
        int x=obj.nextInt();
        int temp=0;  //hello siri

        if(x<0){
            System.out.print("please enter positive number");
        }

        if(x==0||x==1){
            System.out.print("it is not prime number");
        }

        if(x>1){
            for(int a=2; x>a; a++){
                if(x%a==0){
                    temp=1;
                    break;
                }
            }
            if(temp==0){
                System.out.print("it is prime number");
            }
            else{
                System.out.print("it is not prime");
            }
        }
    }
}