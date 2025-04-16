import java.util.ArrayList;
public class SampleDay4 {
    public static void main(String[]args) {
        /*ArrayList<String>pocket=new ArrayList<>();
        boolean hasCard=true;
        pocket.add("gold");
        pocket.add("money");
        pocket.add("hamster");

        if(pocket.contains("cellphone")) {
            System.out.println("Take the taxi");
        }
        else if(hasCard){  //boolean으로 정의되었으면 이름만 입력해도 참이면 실행된다
            System.out.println("Take the taxi");
        }
        else {
            System.out.println("YOU HAVE TO RUN");
        }*/
        //while문을 활용해 열번찍는나무// while문은 조건이 참인동안 계속반복함
        int treeHit=0;
        while (treeHit<10) {
            treeHit++;
            System.out.println("나무를"+treeHit+"찍었습니다"); // 숫자를 문자로 해서 끼워넣으려고 +사용
            if (treeHit==10){
                System.out.println("나무넘어갑니다");
            }
        }

    }
}
