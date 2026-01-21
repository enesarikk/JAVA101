public class Employee {
    private static final int MIN_WORK_HOURS = 40;
    private static final int BONUS_RATE = 30;

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary > 1000){
            return (this.salary * 0.03);
        }

        return 0;
    }

    public double bonus(){
        if(this.workHours > MIN_WORK_HOURS){
            return (this.workHours - MIN_WORK_HOURS) * BONUS_RATE;
        }

        return 0;
    }

    public double raiseSalary(){
        int yearsWork = (2021 - this.hireYear);

        if(yearsWork < 10){
            return this.salary * 0.05;
        } else if (yearsWork < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString(){
        double tax = this.tax();
        double bonus = this.bonus();
        double raiseSalary = this.raiseSalary();

        double includedSalary = bonus - tax + this.salary;
        double totalSalary = includedSalary + raiseSalary;

        return "Name : " + this.name +
                "\nSalary : " + this.salary +
                "\nWork hours : " + this.workHours +
                "\nHire year : " + this.hireYear +
                "\nTax : " + tax +
                "\nBonus : " + bonus +
                "\nRaise salary : " + this.raiseSalary() +
                "\nIncluded salary : " + includedSalary +
                "\nTotal salary : " + totalSalary;
    }
}
