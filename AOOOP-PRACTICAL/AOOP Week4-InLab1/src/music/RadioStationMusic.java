package music;

public class RadioStationMusic implements MusicSource {
	private String station;

    public RadioStationMusic(String station) {
        this.station = station;
    }

    public void play() {
        System.out.println("Playing radio station: " + station);
    }
}
