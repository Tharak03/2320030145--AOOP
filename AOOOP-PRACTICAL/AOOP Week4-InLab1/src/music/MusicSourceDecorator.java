package music;

public abstract class MusicSourceDecorator implements MusicSource {
	protected MusicSource decoratedMusicSource;

    public MusicSourceDecorator(MusicSource decoratedMusicSource) {
        this.decoratedMusicSource = decoratedMusicSource;
    }

    public void play() {
        decoratedMusicSource.play();
    }
}