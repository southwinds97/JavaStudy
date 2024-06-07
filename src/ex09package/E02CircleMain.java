package ex09package;

//원의 둘레 계싼을 위한 클래스만 import하면 된다.
import ex09package.study.perimeter.Circle;

public class E02CircleMain {
  public static void main(String[] args) {
    /*
    원의 넓이 계산을 위핸 클래스는 풀패키지 경로를 이용해서
    인스턴스 생성
     */
    ex09package.study.area.Circle circle1 = 
            new ex09package.study.area.Circle(6.5);
    System.out.println("반지름이 6.5인 원의 넓이: "
            + circle1.getArea());

    /*
    상단에서 import 했으므로 클래스명만으로 접근이 가능하다.
   */
    Circle circle2 = new Circle(4.5); 
    System.out.println("반지름이 4.5인 원의 둘레: " + circle2.getPerimeter());
  }

}
