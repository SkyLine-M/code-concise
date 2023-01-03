package com.ma.concise.enumutil.util;

/**
 * @Description: 枚举Name接口
 * @Package: com.hex.hdc.source.common.enumutils
 * @ClassName: INameValueEnum
 *
 * @Author: xiaoma
 * @Date: 2022/4/19 14:05
 * @Version: v1.0
 **/
public interface INameValueEnum<T> {

    /**
     * @Description: 获取key
     * @Method: getKey
     * @Param: 1
     * @Return: java.lang.String
     *
     * @Author: xiaoma
     * @Date: 2022/5/11 12:09
     * @Version: V1.0
     */
    String getKey();

    /**
     * @Description: 获取value
     * @Method: getValue
     * @Param: 1
     * @Return: T
     *
     * @Author: xiaoma
     * @Date: 2022/5/11 12:09
     * @Version: V1.0
     */
    T getValue();

    /**
     * @Description: 获取排序编号
     * @Method: getSort
     * @Param: 1
     * @Return: java.lang.Integer
     *
     * @Author: xiaoma
     * @Date: 2022/5/11 12:09
     * @Version: V1.0
     */
    Integer getSort();

    /**
     * @Description: 获取描述
     * @Method: getDescription
     * @Param: 1
     * @Return: java.lang.String
     *
     * @Author: xiaoma
     * @Date: 2022/5/11 12:09
     * @Version: V1.0
     */
    String getDescription();
}