package io.github.seffeng.basics.constant;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ErrorConst {

    /**
     * 无错误
     */
    NOT(0, "操作成功！"),

    /**
     * 默认错误
     */
    DEFAULT(1, "服务器异常错误！"),

    /**
     * 未登录
     */
    UNAUTHORIZED(401, "用户未登录！"),

    /**
     * 无权限
     */
    PERMISSION_DENIED(403, "权限错误！"),

    /**
     * 资源不存在
     */
    NOT_FOUND(404, "请求资源不存在！"),

    /**
     * 请求方式不支持
     */
    METHOD_NOT_SUPPORTED(405, "请求方式不支持！");

    /**
     * 错误码
     */
    private final Integer id;

    /**
     * 错误说明
     */
    private final String name;

    /**
     *
     * @param id 错误码
     * @param name 错误名称
     */
    private ErrorConst(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
