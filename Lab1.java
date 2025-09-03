 class SunstoneStaff {
    private String name ;
    private String dept;
    private int age;
    private int experiences;


     SunstoneStaff(){

        this.name= "Kandrapa kalita";
        this.dept= "bteck";
        this.age=45;
        this.experiences=10;
    }

    void displayInfo(){

         
        System.out.println("Staff Information");
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
        System.out.println("Age: "+age);
        System.out.println("Experiences: "+experiences+" years");
    }
    
}

 public class Lab1{
    public static void main(String[]args){
        SunstoneStaff obj = new SunstoneStaff(); 
        obj.displayInfo(); 
    }
}