//ex3.13
package b;

public class EmployeeTestEx3 {
    public static void main(String[] args)
    {
        Employee Alex = new Employee("Djundiet", "Alex", 21000);
        Employee John = new Employee("King","John",20000);
        System.out.println(Alex.getFirstName()+" " +Alex.getLastName()+ "'s yearly salary is "+Alex.getSalary()*12);
        System.out.println(John.getFirstName()+" "+John.getLastName() +"'s yearly salary is "+John.getSalary()*12);
        Alex.setSalary(Alex.getSalary() * 1.10);
        John.setSalary(John.getSalary() * 1.10);
        System.out.println("Yearly salary after 10% boost: ");
        System.out.println(Alex.getFirstName()+" "+Alex.getLastName()+"'s yearly salary is "+Alex.getSalary()*12);
        System.out.println(John.getFirstName()+" "+John.getLastName()+"'s yearly salary is "+John.getSalary()*12);
    }
}