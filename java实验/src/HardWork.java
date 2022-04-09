abstract class Employee {
    public abstract double earnings();
}

class YearWorker extends Employee {

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return 100000;
    }

}

class MonthWorker extends Employee {

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return 10000 * 12;
    }

}

class WeekWorker extends Employee {

    @Override
    public double earnings() {
        // TODO Auto-generated method stub
        return 5000 * 4 * 12;
    }

}

class Company {
    Employee[] employees;
    double salaries = 0;

    Company(Employee[] employees) {
        this.employees = employees;
    }

    public double salariesPay() {
        salaries = 0;
        for (Employee e : employees) {
            salaries = salaries + e.earnings();
        }
        return salaries;
    }
}

public class HardWork {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Employee[] employees = new Employee[20];
        for (int i = 0; i < employees.length; i++) {
            if (i % 3 == 0) {
                employees[i] = new WeekWorker();
            } else if (i % 3 == 1) {
                employees[i] = new MonthWorker();
            } else if (i % 3 == 2) {
                employees[i] = new YearWorker();
            }
        }
        Company company = new Company(employees);
        System.out.println("公司年工资总额：" + company.salariesPay());
    }

}