package MyProject.Interface;

public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();
        System.out.println("Android" +
                "");
        android.Print();
        Smartphones.Call();
        Smartphones.Sms();
        Smartphones.Internet();
        iPhones iphone = new iPhones();
        System.out.println("iPhone" +
                "");
        iphone.Print();
        Smartphones.Call();
        Smartphones.Sms();
        Smartphones.Internet();
    }
}
