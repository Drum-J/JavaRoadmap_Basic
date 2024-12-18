package oop1;

/**
 * 절차 지향 프로그래밍 - 메서드 추출
 */
public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayerData player = new MusicPlayerData();

        //음악 플레이어 켜기
        player.on();

        //볼륨 증가
        player.volumeUp();

        //볼륨 증가
        player.volumeUp();

        //볼륨 감소
        player.volumeDown();

        //음악 플레이어 상태
        player.showStatus();

        //음악 플레이어 끄기
        player.off();
    }
}
