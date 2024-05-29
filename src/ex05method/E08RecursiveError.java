package ex05method;

public class E08RecursiveError {

    public static void main(String[] args) {
        showHi(3);
    }

    public static void showHi(int cnt) {
        System.out.println("Hi~!");
        System.out.println("cnt=" + cnt);
        // showHi(--cnt); // 재귀호출을 하기 전에 종료체크를 하므로 에러발생
        if (cnt == 1) {
            return;
        }
        showHi(--cnt); // 정상코드
    }
}
