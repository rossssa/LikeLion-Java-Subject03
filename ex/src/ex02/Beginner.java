package ex02;

public class Beginner implements State{
    @Override
    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }
}
