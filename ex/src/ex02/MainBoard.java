package ex02;

public class MainBoard {
    public static void main(String[] args) {

        /**
         * 스테이트 패턴은 객체가 특정 상태에 따라 행위를 달리하는 상황에서,
         * 자신이 직접 상태를 체크하여 상태에 따라 행위를 호출하지 않고,
         *
         * 상태를 객체화 하여 상태가 행동을 할 수 있도록 위임하는 패턴
         * 즉, 객체의 특정 상태를 클래스로 선언하고, 클래스에서는 해당 상태에서 할 수 있는 행위들을 메서드로 정의
         *
         * 그리고 이러한 각 상태 클래스들을 인터페이스로 캡슐화 하여, 클라이언트에서 인터페이스를 호출하는 방식
         *
         */
        Player player = new Player();
        player.play(1);
        player.setLevel(Player.ADVANCED_LEVEL);
        player.play(2);
        player.setLevel(Player.SUPER_LEVEL);
        player.play(3);
    }
}