package com.practice1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();

        List list = new ArrayList();

        Collection clist = new ArrayList();

        alist.add("apple");
        alist.add(123);
        alist.add(54.324);
        alist.add(new Date());

        System.out.println(alist);

    }
}
