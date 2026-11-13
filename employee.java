public class employee {
    String name;
    int id;
    double salary;
    employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void work(){
        System.out.println(name+"is writing code...");
    }
    void getbonus(){
        double bonus=salary*0.10;
        System.out.println("bonus for"+name+"is:"+bonus);
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("id:"+id);
        System.out.println("salary:$"+salary);
    }
}
class Main{
    public static void main(String[] args) {
        employee emp=new employee("ammu",101,500000);
        emp.display();
        emp.work();
        emp.getbonus();
    }
}
    

    
    

