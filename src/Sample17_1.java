// 2024-03-11 Mon
// 201911079 이동근
// 자바 프로그래밍2 17장 컬렉션 프레임워크

package sec01.ex01;

import java.util.ArrayList;
import java.util.List;


public class Sample17_1 {

    public static void main(String[] args) {
        List aList = new ArrayList();

        // 객체 저장하기
        aList.add("홍길동");
        aList.add(new Integer(178));
        aList.add(new Student());
        System.out.println(aList.toString());

        // 객체 얻기 -- 오브젝트에서 다운캐스팅
        String name = (String)aList.get(0);
        Integer num1 = (Integer)aList.get(1);
        Student student = (Student)aList.get(2);

        System.out.println("name = " + name);

        // 객체 수정
        aList.set(0, "hello");
        aList.set(1, new Float(3.14));

        // 객체 삭제

    }


}













