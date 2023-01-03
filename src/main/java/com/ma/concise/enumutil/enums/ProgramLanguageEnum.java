package com.ma.concise.enumutil.enums;

import com.ma.concise.enumutil.util.INameValueEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description: 编程语言
 * @Package: com.ma.concise.enumutil.enums
 * @ClassName: ProgramLanguageEnum
 *
 * @Author: xiaoma
 * @Date: 2022/5/20 18:41
 * @Version: v1.0
 **/
@Getter
@AllArgsConstructor
public enum ProgramLanguageEnum implements INameValueEnum<String> {

    /** 编程语言 */
    GOLANG("GO_LANG", "GoLang", "是 Google 的 Robert Griesemer，Rob Pike 及 Ken Thompson 开发的一种静态强类型、编译型语言。", 1),
    JAVASCRIPT("JAVA_SCRIPT", "JavaScript", "是一种具有函数优先的轻量级，解释型或即时编译型的编程语言。", 2);

    private final String key;
    private final String value;
    private final String description;
    private final Integer sort;
}
