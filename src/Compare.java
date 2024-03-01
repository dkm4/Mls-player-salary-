import java.util.Comparator;    //import comparator

public class Compare implements Comparator<Player> {

    public int compare(Player first, Player second) {     //compare the two objects order
        double guaranteePay1 = first.getGuaranteedPay();
        double guaranteePay2 = second.getGuaranteedPay();
        double salary1 = first.getSalary();
        double salary2 = second.getSalary();


        int salaryComparison = Double.compare(salary1, salary2); //first check the salary of the two player
        if (salaryComparison != 0) {                            //if the salary is not the same return the compare value
            return salaryComparison;
        } else {                                                //else check the guaranteed payment
            return Double.compare(guaranteePay1, guaranteePay2);
        }

    }
}


