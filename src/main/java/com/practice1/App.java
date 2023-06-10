package com.practice1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();

        //리스트 밑에 어레이리스트가 있기 때문에 리스트로 만들어도 큰 문제x
        List list = new ArrayList();

        Collection clist = new ArrayList();


        alist.add("apple");
        alist.add(213);

        System.out.println("alist = " + alist);

        // 개수 확인
        System.out.println("alist.size() = " + alist.size());

        for(int i=0;i<alist.size();i++){
            System.out.println("size[" + i + "] = " + alist.get(i));
        }

        alist.add("apple");
        System.out.println("alist = " + alist);

        alist.remove(2);
        System.out.println(alist);

        alist.set(1,Boolean.valueOf(true));
        System.out.println(alist);

        List<String> stgringlist = new ArrayList<>();

        stgringlist.add("apple");
        // stgringlist.add(123);    //런타임 에러
        stgringlist.add("banana");

        System.out.println("stgringlist = " + stgringlist);

        Collections.sort(stgringlist);
        System.out.println("stgringlist = " + stgringlist);


        //역순 정렬을 위해 링크드 리스트로 변환
        stgringlist = new LinkedList<>(stgringlist);



        Iterator<String> dIter = ((LinkedList<String>)stgringlist).descendingIterator();

        // 바로 출력하면 값이 유실되므로 새로운 ArrayList에 저장
        List<String> descList = new ArrayList<>();

        while(dIter.hasNext()){
            descList.add(dIter.next());
        }

        System.out.println("descList = " + descList);
    }
}
