package com.eduhzy.annotations;

import java.lang.annotation.*;

/**
 * 此注解为RPC远程调用的方法注解
 * Created by lewis ren on 2018-09-30.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface ApiMethod {
    /**
     * 接口名称
     * @return
     */
    String name ();

    /**
     * 接口描述
     * @return
     */
    String description () default "";

    /**
     * 是否需要鉴权
     * @return
     */
    boolean needAuth () default true;

    /**
     * 是否需要客户端IP地址
     * @return
     */
    boolean needRemoteIP () default true;

    /**
     * 是否需要显示
     * @return
     */
    boolean isShow () default true;

    /**
     * 服务名（默认使用ApiService下的serviceName,如当前serviceName值不为空，则使用当前的serviceName）
     * @return
     */
    String serviceName () default "";

    /**
     * 模块名（默认使用ApiService下的mouduleName,如当前mouduleName值不为空，则使用当前的mouduleName）
     * @return
     */
    String mouduleName () default "";

    /**
     * 所属应用的appId，可通过AppIdType枚举获取，也可以自己填（默认使用ApiService下的mouduleName,如当前mouduleName值不为空，则使用当前的mouduleName）
     * @return
     */
    int appId () default 0;
}
