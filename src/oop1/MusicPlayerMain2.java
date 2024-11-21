package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        data.volume++;
        System.out.println("현재 볼륨: " + data.volume);

        // 볼륨 증가
        data.volume++;
        System.out.println("현재 볼륨: " + data.volume);

        // 볼륨 감소
        data.volume--;
        System.out.println("현재 볼륨: " + data.volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어가 " + (data.isOn ? "켜져 있습니다." : "꺼져 있습니다."));
        System.out.println("현재 볼륨: " + data.volume);

        // 음악 플레이어 끄기
        System.out.println("음악 플레이어를 종료합니다.");
        data.isOn = false;
    }
}
