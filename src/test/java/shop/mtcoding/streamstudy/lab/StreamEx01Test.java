package shop.mtcoding.streamstudy.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.hibernate.mapping.Array;
import org.junit.jupiter.api.Test;

public class StreamEx01Test {

    @Test
    // 버블정렬사용해서
    public void ex05() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> newList = new ArrayList<>();
        // 1. list -> newList에 깊은 복사하기
        for (Integer t : list) {
            newList.add(t);
        }
        // 2. newList에서 동일한 값 제거하기
        for (int i = 0; i < newList.size(); i++) {
            for (int j = i + 1; j < newList.size(); j++) {
                if (newList.get(i) == newList.get(j)) {
                    System.out.print("i값 : " + newList.get(i) + ", ");
                    System.out.print("j값 : " + newList.get(j));
                    System.out.println();
                    newList.remove(j);
                }
            }
        }
        // 3. 값 출력하기
        for (Integer i : newList) {
            System.out.print(i + " ");
        }
        for (Integer i : newList) {
            System.out.println(i + "");

        }

    }

    @Test
    public void ex04() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> newList = new ArrayList<>();

        // 1.list ->newlist에 깊은복사하기
        for (Integer t : list) {
            newList.add(t);

        }

        // 2.newList에서 동일한 값제거하기
        for (int i = 0; i < newList.size(); i++) {
            for (int j = i + 1; j < newList.size(); j++) {
                if (i == j) {
                    newList.remove(j);
                }
            }
        }

        for (Integer i : newList) {
            System.out.println(i + "");

        }

    }

    @Test
    public void ex03() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        List<Integer> lowList = new ArrayList<>();
        List<Integer> highList = new ArrayList<>();

        // 얕은복사
        lowList = list;

        // 깊은복사
        for (Integer i : list) {
            highList.add(i);
            System.out.println(i);
        }
    }

    @Test
    public void ex02() {
        List<Integer> list = Arrays.asList(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
        Stream<Integer> stream = list.stream();
        stream.distinct().forEach(t -> {
            System.out.println(t);
        });

        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);

    }

    @Test
    public void ex01() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(4);

        list.add(2);

        list.add(3);

        list.add(1);
        Stream<Integer> stream = list.stream();
        stream.forEach(t -> {
            System.out.println("값 :" + t);

        });

    }

}
