public class Player {
    //private variable
    private String club;
    private String lastName;
    private String firstName;
    private char position;
    private double salary;
    private double guaranteedPay;

    public Player(){   //initial consructor
        club = "Unknown";
        lastName = "Unknown";
        firstName = "Unknown";
        position = 'n';
        salary = -1.0;
        guaranteedPay = -1.0;
    }
    //constructor with parameters
    public Player(String club, String lastName, String firstName, char position, double salary, double guaranteedPay){
        this.club = club;
        this.lastName = lastName;
        this.firstName = firstName;
        this.position = position;
        this.salary = salary;
        this.guaranteedPay = guaranteedPay;
    }
    //copy constructor
    public Player(Player otherPlayerInfo) {
        this.firstName = otherPlayerInfo.firstName;
        this.lastName = otherPlayerInfo.lastName;
        this.club = otherPlayerInfo.club;
        this.position = otherPlayerInfo.position;
        this.salary = otherPlayerInfo.salary;
        this.guaranteedPay = otherPlayerInfo.guaranteedPay;
    }

    //mutator
    public void setClub(String club) {
        this.club = club;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setPosition(char position) {
        this.position = position;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setGuaranteedPay(double guaranteedPay) {
        this.guaranteedPay = guaranteedPay;
    }

    //accessors
    public String getClub() {
        return club;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public char getPosition() {
        return position;
    }
    public double getSalary() {
        return salary;
    }
    public double getGuaranteedPay() {
        return guaranteedPay;
    }


    @Override
    public String toString() {  //method to print all the information of the player in String datatype
        return  firstName + " " + lastName + " position is " + position + " at " + club + " getting paid $" + salary + " with guaranteed pay of $" + guaranteedPay;
    }

}
