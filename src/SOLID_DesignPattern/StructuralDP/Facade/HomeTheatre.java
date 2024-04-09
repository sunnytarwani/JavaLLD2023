package SOLID_DesignPattern.StructuralDP.Facade;

public class HomeTheatre {

    Television television;
    Lights lights;
    MusicSystem musicSystem;

    public HomeTheatre(Television television, Lights lights, MusicSystem musicSystem) {
        this.television = television;
        this.lights = lights;
        this.musicSystem = musicSystem;
    }

    public void homeTheatreOn(){
        television.televisionOn();
        lights.lightsOn();
        musicSystem.musicSystemOn();
    }

    public void homeTheatreOff(){
        television.televisionOff();
        lights.lightsOff();
        musicSystem.musicSystemOff();
    }
}
