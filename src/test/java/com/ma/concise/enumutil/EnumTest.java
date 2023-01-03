package com.ma.concise.enumutil;

import com.ma.concise.enumutil.enums.LolKillEnum;
import com.ma.concise.enumutil.enums.ProgramLanguageEnum;
import com.ma.concise.enumutil.util.EnumUtils;
import org.junit.jupiter.api.Test;


public class EnumTest {
    @Test
    public void isExist(){
        System.out.println(EnumUtils.isExistValue(LolKillEnum.class,1));
        System.out.println(EnumUtils.isExistValue(LolKillEnum.class,2));
        System.out.println(EnumUtils.isExistValue(ProgramLanguageEnum.class,"GoLang"));
        System.out.println(EnumUtils.isExistValue(ProgramLanguageEnum.class,"JavaScript"));
        System.out.println(EnumUtils.isExistKey(ProgramLanguageEnum.class,"GO_LANG"));
        System.out.println(EnumUtils.isExistKey(ProgramLanguageEnum.class,"JAVA_SCRIPT"));

    }
    @Test
    public void getKeyByValue(){
        System.out.println(EnumUtils.getKeyByValue(LolKillEnum.class,1));
        System.out.println(EnumUtils.getKeyByValue(ProgramLanguageEnum.class,null));
    }
    @Test
    public void getValueByKey(){
        System.out.println(EnumUtils.getValueByKey(LolKillEnum.class,"FIRST_BLOOD"));
        System.out.println(EnumUtils.getValueByKey(ProgramLanguageEnum.class,"GO_LANG"));
    }
    @Test
    public void getEnumByValue(){
        System.out.println(EnumUtils.getEnumByValue(LolKillEnum.class,1));
        System.out.println(EnumUtils.getEnumByValue(ProgramLanguageEnum.class,"JavaScript"));
    }

    @Test
    public void getEnumByKey(){
        System.out.println(EnumUtils.getEnumByKey(LolKillEnum.class,"DOUBLE_KILL"));
        System.out.println(EnumUtils.getEnumByKey(ProgramLanguageEnum.class,"JAVA_SCRIPT"));
    }

    @Test
    public void getKeys(){
        System.out.println(EnumUtils.getKeys(LolKillEnum.class));
    }

    @Test
    public void getValues(){
        System.out.println(EnumUtils.getValues(LolKillEnum.class));
    }

    @Test
    public void getBySort(){
        System.out.println(EnumUtils.getEnumsBySort(LolKillEnum.class));
        System.out.println(EnumUtils.getKeysBySort(LolKillEnum.class));
        System.out.println(EnumUtils.getValuesBySort(LolKillEnum.class));
    }
}
