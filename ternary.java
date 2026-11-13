import java.util.Scanner;
public class ternary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        String result=(num>=0)?"+ve":"-ve";
        System.out.println(num+result);
        sc.close();
    }
    
}
