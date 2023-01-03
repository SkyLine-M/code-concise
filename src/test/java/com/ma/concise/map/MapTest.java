package com.ma.concise.map;

import cn.hutool.core.map.MapUtil;
import com.ma.concise.enumutil.enums.LolKillEnum;
import com.ma.concise.enumutil.enums.ProgramLanguageEnum;
import com.ma.concise.enumutil.util.EnumUtils;
import org.junit.jupiter.api.Test;

import java.util.*;


public class MapTest {

    @Test
    public void isExist() {
        System.out.println(MapUtils.filterValidKeys(getMap(1),getValidKeys()));
        System.out.println(MapUtils.filterValidKeys(getListMap(),getValidKeys()));
        System.out.println(MapUtils.filterValidKeys(getMap(1),ProgramLanguageEnum.class));
        System.out.println(MapUtils.filterValidKeys(getListMap(),ProgramLanguageEnum.class));
        System.out.println("==================================================================");
        System.out.println(MapUtils.filterUnValidKeys(getMap(1),getUnValidKeys()));
        System.out.println(MapUtils.filterUnValidKeys(getListMap(),getUnValidKeys()));
        System.out.println(MapUtils.filterUnValidKeys(getMap(1),ProgramLanguageEnum.class));
        System.out.println(MapUtils.filterUnValidKeys(getListMap(),ProgramLanguageEnum.class));
        System.out.println("==================================================================");
        System.out.println(MapUtils.filterOneColumnValues(getListMap(),"GoLang"));
    }

    public Map<String, Object> getMap(int i) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("GoLang", "语言GoLang" + i);
        map.put("JavaScript", "语言JavaScript" + i);
        map.put("1", "FIRST_BLOOD" + i);
        map.put("2", "DOUBLE_KILL" + i);
        map.put("3", "TRIPLE_KILL" + i);
        return map;
    }

    public List<Map<String, Object>> getListMap() {
        List<Map<String, Object>> listMap = new ArrayList<>();
        listMap.addAll(Arrays.asList(getMap(1), getMap(2), getMap(3)));
        return listMap;
    }

    public List<String> getValidKeys() {
        return Arrays.asList("GoLang", "JavaScript");
    }

    public List<String> getUnValidKeys() {
        return Arrays.asList("GoLang","JavaScript");
    }
}
