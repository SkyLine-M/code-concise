package com.ma.concise.exception.checkargument;

import java.util.Objects;

public class CheckArgument {
    public static void checkArgumentThrowException(String x) {
        if (null == x) {
//            throw new NullPointerException();
            throw new NullPointerException("参数为null");
        }
        // 替换
        Objects.requireNonNull(x);
        Objects.requireNonNull(x, "参数为null");
    }

    public static void main(String[] args) {
        checkArgumentThrowException("1");
        checkArgumentThrowException(null);
    }
}
