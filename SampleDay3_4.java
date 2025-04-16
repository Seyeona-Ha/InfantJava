public class SampleDay3_4 {
    public static void main(String[]args) {
        /*int num = 10; //대입연산자
        num += 2; // 왼쪽+오른쪽한 결과를 왼쪽에 대입
        System.out.println(num);
        num-=2;
        System.out.println(num);
        num*=2;
        System.out.println(num);
        num/=2;
        System.out.println(num);
        num%=2;
        System.out.println(num);

        if (5>3&&3>1){   //대입연산자  왼쪽과 오른쪽이 모두 참인가
            System.out.println("True");
            System.out.println("Reall");}
        if ((5>3)||(3<1))  //왼쪽 오른쪽이 하나라도 참인가
            System.out.println("True");
        if (!(5==4))   //반대
            System.out.println("True");
        int x=3;
        int y=5;
        int max=(x>y)?x:y; //삼항연산자 (조건)?참일때:거짓일때
        System.out.println(max);

        System.out.println("A\nB");  //줄바꿈
        System.out.println("A\tB");   //탭
        System.out.println("A\\B");   //역슬래시
        System.out.println("A\"B\""); //큰따옴표
        System.out.println("A\'B\'");   //작은따옴표

        StringBuffer sb = new StringBuffer(); //StringBuffer,배열,list
        sb.append("hello");
        sb.append(" ");
        sb.append("Java");
        String result= sb.toString();//String으로 변환해주면 유지보수쉬움
        System.out.println(result);
        sb.insert(0,"OH!");
        System.out.println(sb.toString());//String은 수정불가능이지만 StringBuffer는 수정가능해서 갱신됨
        System.out.println(sb.substring(0,3));

        int[] even={2,4,6,8};
        System.out.println(even[0]);
        for (int i=0; i<even.length;i++){
            System.out.println(even[i]);
        }
        String [] weeks=new String[7]; //초기에 값안넣으면 길이 먼저 설정해줘야함
        //슬슬질리니까 제어문으로 가자며..*/
        int money=20000;
        boolean hasCard=true;
        if (money>=30000||hasCard) {    //카드가 있으니까 택시타라
            System.out.println("Take Taxi");
        }
        else {
            System.out.println("Walk");
        }
    }
}

