package SOLID_DesignPattern.StructuralDP.BridgeDP.YoutubeEg;

public class Netflix extends Video {

    public Netflix(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFile) {
        videoProcessor.process(videoFile);
    }
}
