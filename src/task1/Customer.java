package task1;

// 1.a
public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter;

    // 1.b
    public Customer(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;

        // 1.c
        counter += 1;
        id = counter;

    }

    // 1.d
    @Override
    public String toString() {
        return "\n Customer" +
                "\n   First Name: " + firstName +
                "\n   Last Name: " + lastName +
                "\n   Username: " + userName +
                "\n   ID: " + id;
    }

    // GETTERS
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }


    // SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setCounter(int counter) {
        Customer.counter = counter;
    }
}
