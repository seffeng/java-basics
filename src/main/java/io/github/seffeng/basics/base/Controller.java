package io.github.seffeng.basics.base;

public class Controller {

    /**
     * 成功返回
     * @return Response
     */
    public static Response success() {
        return Response.success();
    }

    /**
     * 成功返回
     * @param data 返回数据
     * @return Response
     */
    public static Response success(Object data) {
        return Response.success(data);
    }

    /**
     * 成功返回
     * @param data 返回数据
     * @param message 返回消息
     * @return Response
     */
    public static Response success(Object data, String message) {
        return Response.success(data, message);
    }

    /**
     * 成功返回
     * @param data 返回数据
     * @param code 状态码
     * @return Response
     */
    public static Response success(Object data, Integer code) {
        return Response.success(data, code);
    }

    /**
     * 成功返回
     * @param data 返回数据
     * @param message 返回消息
     * @param code 状态码
     * @return Response
     */
    public static Response success(Object data, String message, Integer code) {
        return Response.success(data, message, code);
    }

    /**
     * 错误返回
     * @return Response
     */
    public static Response error() {
        return Response.error();
    }

    /**
     * 错误返回
     * @param message 返回消息
     * @return Response
     */
    public static Response error(String message) {
        return Response.error(message);
    }

    /**
     * 错误返回
     * @param message 返回消息
     * @param code 状态码
     * @return Response
     */
    public static Response error(String message, Integer code) {
        return Response.error(message, code);
    }

    /**
     * 错误返回
     * @param message 返回消息
     * @param data 返回数据
     * @return Response
     */
    public static Response error(String message, Object data) {
        return Response.error(message, data);
    }

    /**
     * 错误返回
     * @param message 返回消息
     * @param data 返回数据
     * @param code 状态码
     * @return Response
     */
    public static Response error(String message, Object data, Integer code) {
        return Response.error(message, data, code);
    }
}
