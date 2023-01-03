package com.ma.concise.enumutil.util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EnumUtils {

    /**
     * @Description: 根据枚举key获取value
     * @Method: getValueByName
     * @Param: enums 1
     * @Param: name 2
     * @Return: T
     *
     * @Author: xiaoma
     * @Date: 2022/4/19 14:03
     * @Version: V1.0
     */
    public static <E extends INameValueEnum<V>, V, T> V getValueByKey(Class<E> enumClass, String key) {
        return Arrays.stream(enumClass.getEnumConstants()).filter(e -> e.getKey().equals(key)).findFirst().map(INameValueEnum::getValue).orElse(null);
    }

    /**
     * @Description: 根据枚举value获取枚举key
     * @Method: getNameByValue
     * @Param: enums 1
     * @Param: value 2
     * @Return: java.lang.String
     *
     * @Author: xiaoma
     * @Date: 2022/4/19 14:03
     * @Version: V1.0
     */
    public static <E extends INameValueEnum<V>, V, T> String getKeyByValue(Class<E> enumClass, T value) {
        return Arrays.stream(enumClass.getEnumConstants()).filter(e -> e.getValue().equals(value)).findFirst().map(INameValueEnum::getKey).orElse(null);
    }

    /**
     * @Description: 获取枚举所有key
     * @Method: getNames
     * @Param: enumClass 1
     * @Return: java.util.List<java.lang.String>
     *
     * @Author: xiaoma
     * @Date: 2022/4/19 14:03
     * @Version: V1.0
     */
    public static <E extends INameValueEnum<V>, V> List<String> getKeys(Class<E> enumClass) {
        return Arrays.stream(enumClass.getEnumConstants()).map(INameValueEnum::getKey).collect(Collectors.toList());
    }

    /**
     * @Description: 获取value列表
     * @Method: getValues
     * @Param: enumClass 1
     * @Return: java.util.List<T>
     *
     * @Author: xiaoma
     * @Date: 2022/4/19 14:03
     * @Version: V1.0
     */
    public static <E extends INameValueEnum<V>, V> List<V> getValues(Class<E> enumClass) {
        return Arrays.stream(enumClass.getEnumConstants()).map(INameValueEnum::getValue).collect(Collectors.toList());
    }

    /**
     * @Description: 排序后获取枚举
     * @Method: getEnumsBySort
     * @Param: enumClass 1
     * @Return: java.util.List<E>
     *
     * @Author: xiaoma
     * @Date: 2022/4/19 14:03
     * @Version: V1.0
     */
    public static <E extends INameValueEnum<V>, V> List<E> getEnumsBySort(Class<E> enumClass) {
        return Arrays.stream(enumClass.getEnumConstants()).sorted(Comparator.comparingInt(e -> e.getSort() == null ? 0 : e.getSort())).collect(Collectors.toList());
    }

    /**
     * @Description: 排序后获取枚举所有key
     * @Method: getNamesBySort
     * @Param: enumClass 1
     * @Return: java.util.List<java.lang.String>
     *
     * @Author: xiaoma
     * @Date: 2022/4/19 14:03
     * @Version: V1.0
     */
    public static <E extends INameValueEnum<V>, V> List<String> getKeysBySort(Class<E> enumClass) {
        return Arrays.stream(enumClass.getEnumConstants()).sorted(Comparator.comparingInt(e -> e.getSort() == null ? 0 : e.getSort())).map(INameValueEnum::getKey).collect(Collectors.toList());
    }

    /**
     * @Description: 排序后获取枚举所有value
     * @Method: getValuesBySort
     * @Param: enumClass 1
     * @Return: java.util.List<T>
     *
     * @Author: xiaoma
     * @Date: 2022/4/19 14:04
     * @Version: V1.0
     */
    public static <E extends INameValueEnum<V>, V> List<V> getValuesBySort(Class<E> enumClass) {
        return Arrays.stream(enumClass.getEnumConstants()).sorted(Comparator.comparingInt(e -> e.getSort() == null ? 0 : e.getSort())).map(INameValueEnum::getValue).collect(Collectors.toList());
    }

    /**
     * @Description: 根据枚举value获取对应的枚举对象
     * @Method: getEnumByValue
     * @Param: enumClass 1
     * @Param: value 2
     * @Return: E
     *
     * @Author: xiaoma
     * @Date: 2022/4/19 14:04
     * @Version: V1.0
     */
    public static <E extends INameValueEnum<V>, V> E getEnumByValue(Class<E> enumClass, V value) {
        return Arrays.stream(enumClass.getEnumConstants()).filter(e -> e.getValue().equals(value)).findFirst().orElse(null);
    }

    /**
     * @Description: 根据key获取对应的枚举对象
     * @Method: getEnumByName
     * @Param: enumClass 1
     * @Param: name 2
     * @Return: E
     *
     * @Author: xiaoma
     * @Date: 2022/4/19 14:04
     * @Version: V1.0
     */
    public static <E extends INameValueEnum<V>, V> E getEnumByKey(Class<E> enumClass, String key) {
        return Arrays.stream(enumClass.getEnumConstants()).filter(e -> e.getKey().equals(key)).findFirst().orElse(null);
    }

    /**
     * @Description: 判断value是否存在指定枚举类中
     * @Method: isExistValue
     * @Param: enumClass 1
     * @Param: value 2
     * @Return: boolean
     *
     * @Author: xiaoma
     * @Date: 2022/4/19 14:04
     * @Version: V1.0
     */
    public static <E extends INameValueEnum<V>, V> boolean isExistValue(Class<E> enumClass, V value) {
        return Arrays.stream(enumClass.getEnumConstants()).anyMatch(e -> e.getValue().equals(value));
    }

    /**
     * @Description: 判断key是否存在指定枚举类中
     * @Method: isExistName
     * @Param: enumClass 1
     * @Param: name 2
     * @Return: boolean
     *
     * @Author: xiaoma
     * @Date: 2022/4/19 14:04
     * @Version: V1.0
     */
    public static <E extends INameValueEnum<V>, V> boolean isExistKey(Class<E> enumClass, String name) {
        return Arrays.stream(enumClass.getEnumConstants()).anyMatch(e -> e.getKey().equals(name));
    }
}
