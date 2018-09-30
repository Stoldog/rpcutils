package com.eduhzy.annotations;

import java.lang.annotation.*;

/**
 * 此注解为RPC远程调用的类注解
 * Created by lewis ren on 2018-09-30.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface ApiService {
    /**
     * 服务名
     * @return
     */
    String serviceName();

    /**
     * 模块名
     * @return
     */
    String mouduleName();

    /**
     * 所属应用的appId，可通过AppIdType枚举获取，也可以自己填
     * @return
     */
    int appId();
}
