package music;

public class MusicAppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSource localFile = new LocalFileMusic("song.mp3");
        MusicSource onlineStream = new OnlineStreamMusic("http://musicstream.com/stream");
        MusicSource radioStation = new RadioStationMusic("Radio Station 101");

        MusicSource localFileWithEqualizer = new EqualizerDecorator(localFile);
        MusicSource onlineStreamWithVolumeControl = new VolumeControlDecorator(onlineStream);
        MusicSource radioStationWithAllFeatures = new VolumeControlDecorator(new EqualizerDecorator(radioStation));

        System.out.println("Playing local file with equalizer:");
        localFileWithEqualizer.play();

        System.out.println("\nPlaying online stream with volume control:");
        onlineStreamWithVolumeControl.play();

        System.out.println("\nPlaying radio station with all features:");
        radioStationWithAllFeatures.play();
	}

}

