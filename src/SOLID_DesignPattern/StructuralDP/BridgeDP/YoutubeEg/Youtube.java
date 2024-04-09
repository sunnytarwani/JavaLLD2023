package SOLID_DesignPattern.StructuralDP.BridgeDP.YoutubeEg;

public class Youtube extends Video {

    public Youtube(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFile) {
        videoProcessor.process(videoFile);
    }
}
