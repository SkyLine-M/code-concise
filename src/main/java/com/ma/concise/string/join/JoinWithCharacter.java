package com.ma.concise.string.join;

import java.util.StringJoiner;

public class JoinWithCharacter {
    public static void main(String[] args) {

        String name = "a";
        Integer age = 22;
        String param = "param";
        // 优化前
        String test = name + " " + age + " " + param;

        // 优化后
        String test1 = new StringJoiner(" ")
                .add(name)
                .add(age.toString())
                .add(param)
                .toString();
    }
}
