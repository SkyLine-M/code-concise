package com.ma.concise.enumutil.enums;

import com.ma.concise.enumutil.util.INameValueEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Description: LOL击杀集锦
 * @Package: com.ma.concise.enumutil.enums
 * @ClassName: LolKillEnum
 *
 * @Author: xiaoma
 * @Date: 2022/5/20 18:48
 * @Version: v1.0
 **/
@Getter
@AllArgsConstructor
public enum LolKillEnum implements INameValueEnum<Integer> {

    /** LOL击杀集锦 */
    FIRSTBLOOD("FIRST_BLOOD", 1, "第一滴血", 1),
    DOUBLEKILL("DOUBLE_KILL", 2, "双杀", 2),
    TRIPLEKILL("TRIPLE_KILL", 3, "三杀", 3),
    QUADRKILL("QUADR_KILL", 4, "四杀", 4),
    PEATAKILL("PEATA_KILL", 5, "五杀", 5);

    private final String key;
    private final Integer value;
    private final String description;
    private final Integer sort;
}
