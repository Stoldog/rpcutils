package com.eduhzy.annotations;

import java.lang.annotation.*;

/**
 * 启用RpcUtils
 * Created by lewis ren on 2018-09-30.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface EnableRpcUtils {
}
