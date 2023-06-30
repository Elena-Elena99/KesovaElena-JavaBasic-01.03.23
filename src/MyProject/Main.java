package MyProject;

public class Main {
    public static void main(String[] args) {
      Person personaFirst = new Person();
      System.out.println(personaFirst.personInfo("Will", "Smith", "New York", "2936729462846"));
      Person personaSecond = new Person();
      System.out.println(personaSecond.personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
      Person personaThird = new Person();
      System.out.println(personaThird.personInfo("Sherlock", "Holmes", "London", "37742123513"));
    }

}
