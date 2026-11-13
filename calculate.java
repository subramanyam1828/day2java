import java.util.Scanner;
class add{
    add(int a,int b){
        System.out.println("addition:"+(a+b));
    }
}
class sub{
    sub(int a,int b){
        System.out.println("subtraction:"+(a-b));
    }
}
class mul{
    mul(int a,int b){
        System.out.println("multiplication:"+(a*b));
    }
}
class div{
    div(int a,int b){
        if(b!=0){
            System.out.println("division:"+(a/b));
        }else{
            System.out.println("division:cannot divide by zero");
        }
    }
}
class calculate{
    calculate(int a,int b){
        new add(a,b);
        new sub(a,b);
        new mul(a,b);
        new div(a,b);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int n1=sc.nextInt();
        System.out.println("enter second number:");
        int n2=sc.nextInt();
        calculate calc=new calculate(n1,n2);
        sc.close();

    }
}
    
