public class VideoNode {

    private Video video;
    private VideoNode prevVideo;
    private VideoNode nextVideo;

    public VideoNode(Video video, VideoNode prevVideo, VideoNode nextVideo) {
        this.video = video;
        this.prevVideo = prevVideo;
        this.nextVideo = nextVideo;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public VideoNode getPrevVideo() {
        return prevVideo;
    }

    public void setPrevVideo(VideoNode prevVideo) {
        this.prevVideo = prevVideo;
    }

    public VideoNode getNextVideo() {
        return nextVideo;
    }

    public void setNextVideo(VideoNode nextVideo) {
        this.nextVideo = nextVideo;
    }
}
