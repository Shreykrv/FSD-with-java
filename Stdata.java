class Stdata {
    String name;
    String email;
    long phone;
    int marks;

    // Constructor
    Stdata(String name, String email, long phone, int marks) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.marks = marks;
    }

    // Method to calculate percentage
    int percentage() {
        return (marks * 100) / 500;
    }

    // Method to display student data
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Marks: " + marks);
        System.out.println("Percentage: " + percentage() + "%");
    }

    // Main method
    public static void main(String[] args) {
        Stdata s1 = new Stdata("Shrey Kumar", "s@gmail.com", 7004492316L, 490);
        s1.display();
    }
}
