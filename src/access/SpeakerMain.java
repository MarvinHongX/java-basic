package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();

        speaker.volumeDown();
        speaker.showVolume();

        // 필드에 직접 접근 및 수정
//        speaker.volume = 200;
//        speaker.showVolume();
    }
}
