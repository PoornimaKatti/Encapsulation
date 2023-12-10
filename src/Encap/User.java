
package Encap;

class User extends Student{
    private String emailid;

    // Constructor
    public User(int id, String name, String emailid) {
        super(id, name);
        this.emailid = emailid;
    }

    // Getter method for student ID
    public String getemailid() {
        return emailid;
    }

    // Setter method for student ID
    public void setemailid(String emailid) {
        this.emailid =emailid;
    }

    // Method to display student information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("emailid: " + emailid);
    }
}
