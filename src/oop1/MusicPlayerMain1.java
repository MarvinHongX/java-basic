package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        volume++;
        System.out.println("현재 볼륨: " + volume);

        // 볼륨 증가
        volume++;
        System.out.println("현재 볼륨: " + volume);

        // 볼륨 감소
        volume--;
        System.out.println("현재 볼륨: " + volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어가 " + (isOn ? "켜져 있습니다." : "꺼져 있습니다."));
        System.out.println("현재 볼륨: " + volume);

        // 음악 플레이어 끄기
        System.out.println("음악 플레이어를 종료합니다.");
        isOn = false;
    }
}
