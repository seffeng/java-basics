package io.github.seffeng.basics.constant;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum StatusConst {

    NORMAL(1, "正常"),

    LOCK(2, "锁定"),

    ON(3, "启用"),

    OFF(4, "停用"),

    SUCCESS(5, "成功"),

    FAILED(6, "失败");

    /**
     *
     * @param id 状态码
     * @param name 状态名称
     */
    private StatusConst(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 状态码
     */
    private final Integer id;

    /**
     * 状态说明
     */
    private final String name;
}

