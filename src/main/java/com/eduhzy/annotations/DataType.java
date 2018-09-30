package com.eduhzy.annotations;

/**
 * 目前Rpc远程调用只支持Long String Integer
 * Created by lewis ren on 2018-09-30.
 */
public enum DataType {
    STRING(java.lang.String.class),
    INTEGER(java.lang.Integer.class),
    LONG(java.lang.Long.class);

    private Class<?> cls;

    DataType(Class<?> cls) {
        this.cls = cls;
    }
}
