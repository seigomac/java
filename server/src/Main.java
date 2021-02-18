public class Main {
    public static void main(String[] args) {
        if文
        > >= < <= == !=
        and && or || not !
        int score = 70;
        if (score > 80){
            System.out.println("Great!!");
        } else if (score > 60){
            System.out.println("Good!");
        } else{
            System.out.println("so so ..!");
        }

        if else の簡略的な書き方
        2択しかない問題
        男か女か
        int num = 0;
        String msg = num == 0 ? "Man" : "Woman";
        System.out.println(msg);
    }
}
