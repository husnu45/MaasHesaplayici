public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Hüsnü Tığrak", 20000, 55, 2013);

        System.out.println("**************************************************");

        System.out.println(employee.toString());

        System.out.println("**************************************************");

        System.out.println("The Tax : " + employee.tax());
        System.out.println("***************************************************");
        System.out.println("Bonus Amount : " + employee.bonus());
        System.out.println("***************************************************");
        System.out.println("Wage Raise Amount is : " + employee.raiseSalary());
        System.out.println("***************************************************");
        System.out.println("Net Wage(Included Tax and Bonus) is :" + employee.netIncome());
        System.out.println("***************************************************");
    }
}