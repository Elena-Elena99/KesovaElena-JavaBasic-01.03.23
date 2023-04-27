package MyProject.Polymorphism;

public class Main {
    public static void main(String[] args) {
        MusicStyles beyonce = new PopMusic();
        beyonce.name = "Beyonce";
        MusicStyles aerosmith = new RockMusic();
        aerosmith.name = "Aerosmith";
        MusicStyles yiruma = new ClassicMusic();
        yiruma.name = "Yiruma";
        MusicStyles[] musicStyles = new MusicStyles[3];
        musicStyles[0] = beyonce;
        musicStyles[1] = aerosmith;
        musicStyles[2] = yiruma;
        for (MusicStyles musicStyle : musicStyles) {
            System.out.println(musicStyle.name + " - " + musicStyle.PlayMusic());
        }
    }
}
