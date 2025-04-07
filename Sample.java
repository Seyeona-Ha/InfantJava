public class Sample {
    public static void main(String[]args){
        /*Day1
        int a=10;
        int b=5;
        System.out.println(a+b); //각 명령문에는 ;로 구분해준다
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int i=0;
        int j=10;
        i++;
        j--;
        System.out.println(i);
        System.out.println(j);
        System.out.println(i++);
        System.out.println(++i);//처음1로증가,두번째프린트 후 증가, 세번째 프린트 전 증가->3로출력

        int base=160;
        int height=172;
        boolean isTall=height>base;

        if (isTall){
            System.out.println("height is tall")};

        char a1='a';//문자로
        char a2=97;//아스키코드로
        char a3='\u0061';//유니코드로
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        String a="Happy Seyeon";
        String b="20250331";//대문자 S임
        System.out.println(a);
        System.out.println(b);*/



        /*Day2
        String a="hello";
        String b="java";
        String c="hello";
        String d=new String("hello");
        System.out.println(a.equals(b));  //문자열 같은지 알려줌
        System.out.println(a.equals(c));
        System.out.println(a==d);  //a와 d는 값은 같지만 서로 다른객체

        String a="Hello Java";
        System.out.println(a.indexOf("Java")); //문자열에서 특정 문자열이 시작되는 위치
        System.out.println(a.contains("Hello")); //특정 문자열이 포함되어있는지
        System.out.println(a.charAt(6));
        System.out.println(a.replaceAll("Java","Hello"));
        System.out.println(a.substring(0,4)); //시작과끝인덱스, 끝인덱스 생략ㄱㄴ
        System.out.println(a.toUpperCase());
        String a="a:b:c:d";
        String[] result=a.split(":"); //문자열을 :를 기준으로 나눔,출력까지 되는것은 아님
        System.out.println(String.format("I eat %d apples.",3));
        System.out.println(String.format("I eat %s apples","five"));
        int number=3;
        String day="one";
        System.out.println(String.format("I eat %d apples.",number));
        System.out.println(String.format("I eat %d apples, so I was sick for %s day.",number,day));
        System.out.println(String.format("Error is %d%%",5)); // use %% instead of %*/
        System.out.println(String.format("%10s","hi")); //문자열의 길이 10이고 오른쪽부터 채움
        System.out.println(String.format("%-10sjane","hi"));
        System.out.println(String.format("%10.4f",3.141592));
        System.out.printf("I eat %d apples.",3);//String format대신 사용가능

    }
}

