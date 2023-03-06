package MyProject;

public class Parallelepiped {
    public static void main(String[] args) {
        int height = 5;
        int length = 4;
        int width = 9;
        int volume = height * length * width;
        System.out.println("Volume of the parallelepiped = " + volume);
        System.out.println("Length = " + (height + length + width) * 4);
    }
}
