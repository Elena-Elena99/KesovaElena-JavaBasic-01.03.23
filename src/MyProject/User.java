package MyProject;

public class User {
    private String name;
    public String surname;
    private String email;
    private String phone;
    private String day;
    private String month;
    private int year;
    public int weight;
    public String pressure;
    public int numberStepsTaken;
    private int age;
    public User(String name, String email, String phone, String day, String month, int year, String surname,
                int weight, String pressure, int numberStepsTaken) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.day = day;
        this.month = month;
        this.year = year;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.numberStepsTaken = numberStepsTaken;
    }
    public int getAge() {
        if (this.year > 1920 && this.year < 2020) {
            this.age = 2020 - this.year;
        }
        return this.age;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }
    public void setNumberStepsTaken(int numberStepsTaken) {
        this.numberStepsTaken = numberStepsTaken;
    }
    public String printAccountInfo() {
        return String.format("%s %s %s %s %s %s %s %s", this.name, this.surname, this.email, this.phone, this.weight, this.pressure,
                this.numberStepsTaken, this.getAge());
    }
}
