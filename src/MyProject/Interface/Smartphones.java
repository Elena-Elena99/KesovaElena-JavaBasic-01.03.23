package MyProject.Interface;

public interface Smartphones {
    static void Call(){
        System.out.println("Call");
    }
    static void Sms(){
        System.out.println("Sms");
    }
    static void Internet(){
        System.out.println("Internet");
    }
    interface LinuxOS {
        default void Print(){
            System.out.println("OS - LinuxOS");
        }
    }
    interface iOS {
        default void Print(){
            System.out.println("OS - iOS");
        }
    }
}
