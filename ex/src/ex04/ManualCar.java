package ex04;

public class ManualCar extends Car{
    @Override
    public void hook(){
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
        System.out.println("브레이크를 밟아서 정지합니다.");
    }
}
