package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off(){
        System.out.println("음악 플레이어를 종료합니다.");
        isOn = false;
    }
    void volumeUp(){
        volume++;
        System.out.println("현재 볼륨: " + volume);
    }
    void volumeDown(){
        volume--;
        System.out.println("현재 볼륨: " + volume);
    }
    void showStatus(){
        System.out.println("음악 플레이어가 " + (isOn ? "켜져 있습니다." : "꺼져 있습니다."));
        System.out.println("현재 볼륨: " + volume);
    }

}
