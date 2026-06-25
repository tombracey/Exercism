public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double multiplier = daysSkipped>=5 ? 0.85:1; 
        return multiplier;
    }

    public int bonusMultiplier(int productsSold) {
        int multiplier = productsSold>=20 ? 13:10;
        return multiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        int multiplier = bonusMultiplier(productsSold);
        double bonus = productsSold * multiplier;
        return bonus;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double bonus = bonusForProductsSold(productsSold);
        int baseSalary = 1000;
        double multiplier = salaryMultiplier(daysSkipped);
        
        double salary = (baseSalary + bonus) * multiplier;
        salary = salary>2000 ? 2000:salary;
        return salary;
    } 
}
