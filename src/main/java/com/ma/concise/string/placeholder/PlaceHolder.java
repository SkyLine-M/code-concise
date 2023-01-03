package com.ma.concise.string.placeholder;

import cn.hutool.core.util.StrUtil;

import java.text.MessageFormat;

/**
 * @Description: 字符串占位符
 * @Package: com.ma.concise.string.placeholder
 * @ClassName: PlaceHolder
 *
 * @Author: xiaoma
 * @Date: 2022/5/20 19:05
 * @Version: v1.0
 **/
public class PlaceHolder {
    public static void main(String[] args) {

        // 原生java
        String home = "我是{0}的,{1}{2}的,{3}{4}的,{5}话是这样说";
        home = MessageFormat.format(home, "中国", "中国", "庆阳", "庆阳", "宁县", "宁县");
        System.out.println(home);

        // hutool方式
        String home1 = "我是{}的,{}{}的,{}{}的,{}话是这样说";
        home1 = StrUtil.format(home1, "中国", "中国", "重庆", "重庆", "涪陵", "涪陵");
        System.out.println(home1);
    }
}
