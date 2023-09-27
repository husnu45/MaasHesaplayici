public class Employee {

    String fullName;
    double salary;
    int workHours;
    int hireYear;
    final int currentYear = 2021;

    public Employee(String fullName, double salary, int workHours, int hireYear) {  // Constructor Methodumuz
        this.fullName = fullName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){   // Vergilendirme

        if(salary < 1000){
            return 0;
        }

        else{
            return salary * 0.03;  // %3 vergi
        }

    }

    public double bonus(){

        if(workHours > 40){

            int extra = workHours - 40;

            return extra * 30;

        }

        else{
            return 0;
        }

    }

    public double raiseSalary(){

        double wageRaiseAmount = 0;

        if(currentYear - hireYear < 10){



            wageRaiseAmount += (salary * 5) / 100;

        }

        else if(currentYear - hireYear > 9 && currentYear - hireYear < 20){

            wageRaiseAmount += (salary * 10) / 100;

        }

        else{

            wageRaiseAmount += (salary * 15) / 100;

        }

        return wageRaiseAmount;

    }

    public String toString() {
        return "Employee Information:\n" +
                "Full Name : " + fullName + "\n" +
                "Salary : " + salary + " TL\n" +
                "Work Hours : " + workHours + "\n" +
                "Hire Year : " + hireYear + "\n";
    }

   public double netIncome(){

        salary = salary + bonus() + raiseSalary() - tax();
        return salary;

   }



}
