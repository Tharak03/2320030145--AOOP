package music;

public class LocalFileMusic implements MusicSource {
	private String fileName;

    public LocalFileMusic(String fileName) {
        this.fileName = fileName;
    }

    public void play() {
        System.out.println("Playing local file: " + fileName);
    }
}
