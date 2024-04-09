package SOLID_DesignPattern.StructuralDP.Facade;

public class Main {
    public static void main(String[] args) {
        HomeTheatre homeTheatre = new HomeTheatre(new Television() , new Lights() , new MusicSystem());
        homeTheatre.homeTheatreOn();
        homeTheatre.homeTheatreOff();
    }
}
