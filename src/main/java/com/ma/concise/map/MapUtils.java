package com.ma.concise.map;

import com.ma.concise.enumutil.util.EnumUtils;
import com.ma.concise.enumutil.util.INameValueEnum;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description: Map工具类
 * @Package: com.hex.hdc.service.source.common.util
 * @ClassName: MapUtils
 *
 * @Author: xiaoma
 * @Date: 2022/5/23 11:07
 * @Version: v1.0
 **/
public class MapUtils {

    /**
     * @Description: 过滤出有效的key
     * @Method: filter
     * @Param: map 1
     * @Param: validKeys 2
     * @Return: java.util.Map<K, V>
     *
     * @Author: xiaoma
     * @Date: 2022/5/23 12:14
     * @Version: V1.0
     */
    public static <K, V, T> Map<K, V> filterValidKeys(Map<K, V> map, List<T> validKeys) {
        return map.entrySet().stream().filter(entry -> validKeys.contains(entry.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /**
     * @Description: 过滤出有效的key
     * @Method: filter
     * @Param: list 1
     * @Param: validKeys 2
     * @Return: java.util.List<java.util.Map < K, V>>
     *
     * @Author: xiaoma
     * @Date: 2022/5/23 12:15
     * @Version: V1.0
     */
    public static <K, V, T> List<Map<K, V>> filterValidKeys(List<Map<K, V>> list, List<T> validKeys) {
        return list.stream().map(e -> filterValidKeys(e, validKeys)).collect(Collectors.toList());
    }

    /**
     * @Description: 过滤出有效的key
     * @Method: filter
     * @Param: map 1
     * @Param: enumClass 2
     * @Return: java.util.Map<K, V>
     *
     * @Author: xiaoma
     * @Date: 2022/5/23 12:16
     * @Version: V1.0
     */
    public static <K, V, E extends INameValueEnum<T>, T> Map<K, V> filterValidKeys(Map<K, V> map, Class<E> enumClass) {
        return map.entrySet().stream().filter(entry -> EnumUtils.getValues(enumClass).contains(entry.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /**
     * @Description: 过滤出有效的key
     * @Method: filter
     * @Param: list 1
     * @Param: enumClass 2
     * @Return: java.util.List<java.util.Map < K, V>>
     *
     * @Author: xiaoma
     * @Date: 2022/5/23 12:16
     * @Version: V1.0
     */
    public static <K, V, E extends INameValueEnum<T>, T> List<Map<K, V>> filterValidKeys(List<Map<K, V>> list, Class<E> enumClass) {
        return list.stream().map(e -> filterValidKeys(e, enumClass)).collect(Collectors.toList());
    }

    /**
     * @Description: 过滤掉无效的key
     * @Method: filterUnValidKeys
     * @Param: map 1
     * @Param: validKeys 2
     * @Return: java.util.Map<K,V>
     *
     * @Author: xiaoma
     * @Date: 2022/5/24 10:32
     * @Version: V1.0
     */
    public static <K, V, T> Map<K, V> filterUnValidKeys(Map<K, V> map, List<T> validKeys) {
        return map.entrySet().stream().filter(entry -> !validKeys.contains(entry.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /**
     * @Description: 过滤掉无效的key
     * @Method: filterUnValidKeys
     * @Param: list 1
     * @Param: validKeys 2
     * @Return: java.util.List<java.util.Map<K,V>>
     *
     * @Author: xiaoma
     * @Date: 2022/5/24 10:32
     * @Version: V1.0
     */
    public static <K, V, T> List<Map<K, V>> filterUnValidKeys(List<Map<K, V>> list, List<T> validKeys) {
        return list.stream().map(e -> filterUnValidKeys(e, validKeys)).collect(Collectors.toList());
    }

    /**
     * @Description: 过滤掉无效的key
     * @Method: filterUnValidKeys
     * @Param: map 1
     * @Param: enumClass 2
     * @Return: java.util.Map<K,V>
     *
     * @Author: xiaoma
     * @Date: 2022/5/24 10:32
     * @Version: V1.0
     */
    public static <K, V, E extends INameValueEnum<T>, T> Map<K, V> filterUnValidKeys(Map<K, V> map, Class<E> enumClass) {
        return map.entrySet().stream().filter(entry -> !EnumUtils.getValues(enumClass).contains(entry.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /**
     * @Description: 过滤掉无效的key
     * @Method: filterUnValidKeys
     * @Param: list 1
     * @Param: enumClass 2
     * @Return: java.util.List<java.util.Map<K,V>>
     *
     * @Author: xiaoma
     * @Date: 2022/5/24 10:32
     * @Version: V1.0
     */
    public static <K, V, E extends INameValueEnum<T>, T> List<Map<K, V>> filterUnValidKeys(List<Map<K, V>> list, Class<E> enumClass) {
        return list.stream().map(e -> filterUnValidKeys(e, enumClass)).collect(Collectors.toList());
    }

    /**
     * @Description: 获取某一列的所有值
     * @Method: filterOneColumnValues
     * @Param: list 1
     * @Param: columnName 2
     * @Return: java.util.List<V>
     *
     * @Author: xiaoma
     * @Date: 2022/5/24 10:35
     * @Version: V1.0
     */
    public static <K, V> List<V> filterOneColumnValues(List<Map<K, V>> list, String columnName) {
        return list.stream().map(t -> t.get(columnName)).collect(Collectors.toList());
    }
}
