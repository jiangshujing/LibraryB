package com.example.jiangshujing.libraryb;

import com.example.jiangshujing.lib_base.TestBase;

public class TestB {

    static String name;

    public static String get() {
        return name + ":::::" + TestBase.get();
    }


    public static void set(String name) {
        TestB.name = name;
    }
}
