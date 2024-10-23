import java.util.Scanner;

// Base class Person
class Person {
    private String name;
    private String contactNum;

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }
    
    public void setContactNum(String c) {
        this.contactNum = c;
    }

    public String getContactNum() {
        return contactNum;
    }
}

// Class Employee inherits from Person
class Employee extends Person {
    private double salary;
    private String department;

    public void setSalary(double s) {
        this.salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String d) {
        this.department = d;
    }

    public String getDepartment() {
        return department;
    }
}

// Class Faculty inherits from Person
class Faculty extends Person {
    private double salary;
    private String department;
    private boolean isRegular;

    public void setSalary(double s) {
        this.salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String d) {
        this.department = d;
    }

    public String getDepartment() {
        return department;
    }

    public void setStatus(boolean status) {
        this.isRegular = status;
    }

    public boolean isRegular() {
        return isRegular;
    }
}

// Class Student inherits from Person
class Student extends Person {
    private String program;
    private int yearLevel;

    public void setProgram(String p) {
        this.program = p;
    }

    public String getProgram() {
        return program;
    }

    public void setYearLevel(int y) {
        this.yearLevel = y;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public String getYearLevelFormatted() {
        // Return the year level as "1st", "2nd", "3rd", or "4th"
        switch (yearLevel) {
            case 1:
                return "1st";
            case 2:
                return "2nd";
            case 3:
                return "3rd";
            case 4:
                return "4th";
            default:
                return "Invalid";
        }
    }
}

// Main class CollegeList
public class CollegeList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        char choice = scanner.next().charAt(0);
        scanner.nextLine(); // Consume newline

        if (choice == 'E' || choice == 'e') {
            Employee employee = new Employee();

            System.out.println("Type employee's name, contact number, salary, and department.");
            System.out.print("Name: ");
            employee.setName(scanner.nextLine());

            System.out.print("Contact Number: ");
            employee.setContactNum(scanner.nextLine());

            System.out.print("Salary: ");
            employee.setSalary(scanner.nextDouble());
            scanner.nextLine(); // Consume newline

            System.out.print("Department: ");
            employee.setDepartment(scanner.nextLine());

            // Display information
            System.out.println("\n---------------------------");
            System.out.println("Name: " + employee.getName());
            System.out.println("Contact Number: " + employee.getContactNum());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Department: " + employee.getDepartment());

        } else if (choice == 'F' || choice == 'f') {
            Faculty faculty = new Faculty();

            System.out.println("Type faculty member's name, contact number, salary, and status.");
            System.out.print("Name: ");
            faculty.setName(scanner.nextLine());

            System.out.print("Contact Number: ");
            faculty.setContactNum(scanner.nextLine());

            System.out.print("Salary: ");
            faculty.setSalary(scanner.nextDouble());
            scanner.nextLine(); // Consume newline

            System.out.print("Department: ");
            faculty.setDepartment(scanner.nextLine());

            System.out.print("Is the faculty member regular/tenured? (Y/N): ");
            char status = scanner.next().charAt(0);
            faculty.setStatus(status == 'Y' || status == 'y');

            // Display information
            System.out.println("\n---------------------------");
            System.out.println("Name: " + faculty.getName());
            System.out.println("Contact Number: " + faculty.getContactNum());
            System.out.println("Salary: " + faculty.getSalary());
            System.out.println("Department: " + faculty.getDepartment());
            System.out.println("Regular/Tenured: " + (faculty.isRegular() ? "Yes" : "No"));

        } else if (choice == 'S' || choice == 's') {
            Student student = new Student();

            System.out.println("Type student's name, contact number, program, and year level.");
            System.out.print("Name: ");
            student.setName(scanner.nextLine());

            System.out.print("Contact Number: ");
            student.setContactNum(scanner.nextLine());

            System.out.print("Program: ");
            student.setProgram(scanner.nextLine());

            System.out.print("Year Level (1 to 4): ");
            student.setYearLevel(scanner.nextInt());

            // Display information
            System.out.println("\n---------------------------");
            System.out.println("Name: " + student.getName());
            System.out.println("Contact Number: " + student.getContactNum());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Year Level: " + student.getYearLevelFormatted());
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
