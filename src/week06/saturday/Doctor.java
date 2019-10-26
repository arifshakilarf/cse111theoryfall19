package week06.saturday;

public class Doctor extends Human{
    public String specialty;
    public int money;

    public Doctor(String specialty, int money) {
        super("dummy name", 20);
        this.specialty = specialty;
        this.money = money;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "specialty='" + this.specialty + '\'' +
                ", money=" + this.money +
                ", name='" + super.name + '\'' +
                ", age=" + super.age +
                '}';
    }
}
