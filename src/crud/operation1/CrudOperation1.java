
package crud.operation1;

public class CrudOperation1 {

    public static void main(String[] args) {
        User user = new User(1, "Poornima", "poornimakatti2000@gmail.com");
        Student student = new Student(2, "Poornima katti");

        
          // Accessing and displaying user information
        System.out.println("User Information:");
        user.displayInfo();
        System.out.println("------------");

       
        // Accessing and displaying student information
        System.out.println("Student Information:");
        student.displayInfo();
        System.out.println("------------");
        
       
    }
    
}
