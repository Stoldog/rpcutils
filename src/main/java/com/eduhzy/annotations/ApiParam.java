package com.eduhzy.annotations;

import java.lang.annotation.*;

/**
 * 此注解为RPC远程调用的参数注解（该参数的参数名扫描的时候）
 * Created by lewis ren on 2018-09-30.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@Documented
public @interface ApiParam {
    /**
     * 该参数数据类型（目前RPC暂时只支持String，Integer，Long，为了不出现除这些以外的类型，所以定义了个枚举）
     * @return
     */
    DataType dataType ();

    /**
     * 该参数的长度
     * @return
     */
    int length ();

    /**
     * 是否必填
     * @return
     */
    boolean isRequire () default true;

    /**
     * 排序的值
     * @return
     */
    int sortNum () default 0;

    /**
     * 描述
     * @return
     */
    String description () default "";
}
