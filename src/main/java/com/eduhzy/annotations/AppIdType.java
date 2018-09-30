package com.eduhzy.annotations;

/**
 * Created by lewis ren on 2018-09-30.
 */
public enum AppIdType {
    RES_PLAT(1);

    AppIdType(int code) {
        this.code = code;
    }

    private int code;

    public int getCode() {
        return code;
    }
}
