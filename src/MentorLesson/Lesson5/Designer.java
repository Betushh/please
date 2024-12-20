package MentorLesson.Lesson5;

public class Designer extends Employee{
    private int salaryDesigner;
    private int workHourDesigner;

    public int getSalaryDesigner() {
        return salaryDesigner;
    }

    public void setSalaryDesigner(int salaryDesigner) {
        this.salaryDesigner = salaryDesigner;
    }

    public int getWorkHourDesigner() {
        return workHourDesigner;
    }

    public void setWorkHourDesigner(int workHourDesigner) {
        this.workHourDesigner = workHourDesigner;
    }

    @Override
    protected int calculateBonus(int salaryDesigner, int workHourDesigner) {
        return workHourDesigner * 50 +salaryDesigner;
    }

    @Override
    public String toString() {
        return "Designer{" + "salaryDesigner=" + salaryDesigner + ", workHourDesigner=" + workHourDesigner +" Bonus of Designer = "+ calculateBonus(salaryDesigner,workHourDesigner)+'}';
    }
}
