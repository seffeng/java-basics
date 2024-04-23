package io.github.seffeng.basics.base;

import io.github.seffeng.basics.constant.ErrorConst;
import java.util.HashMap;
import lombok.Data;

@Data
public class Response {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 结果状态[success-成功，error-错误]
     */
    private String status;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 结果数据
     */
    private Object data = new HashMap<>();

    /**
     * 成功返回
     * @return Response
     */
    public static Response success() {
        Response response = new Response();
        response.setCode(ErrorConst.NOT.getId());
        response.setStatus("success");
        response.setMessage("success");
        return response;
    }

    /**
     * 成功返回
     * @param data 返回数据
     * @return Response
     */
    public static Response success(Object data) {
        Response response = new Response();
        response.setCode(ErrorConst.NOT.getId());
        response.setStatus("success");
        response.setMessage("success");
        response.formatData(data);
        return response;
    }

    /**
     * 成功返回
     * @param data 返回数据
     * @param message 返回消息
     * @return Response
     */
    public static Response success(Object data, String message) {
        Response response = new Response();
        response.setCode(ErrorConst.NOT.getId());
        response.setStatus("success");
        response.setMessage(message);
        response.formatData(data);
        return response;
    }

    /**
     * 成功返回
     * @param data 返回数据
     * @param code 状态码
     * @return Response
     */
    public static Response success(Object data, Integer code) {
        Response response = new Response();
        response.setCode(code);
        response.setStatus("success");
        response.setMessage("success");
        response.formatData(data);
        return response;
    }

    /**
     * 成功返回
     * @param data 返回数据
     * @param message 返回消息
     * @param code 状态码
     * @return Response
     */
    public static Response success(Object data, String message, Integer code) {
        Response response = new Response();
        response.setCode(code);
        response.setStatus("success");
        response.setMessage(message);
        response.formatData(data);
        return response;
    }

    /**
     * 失败返回
     * @return Response
     */
    public static Response error() {
        Response response = new Response();
        response.setCode(ErrorConst.DEFAULT.getId());
        response.setStatus("error");
        response.setMessage("error");
        return response;
    }

    /**
     * 失败返回
     * @param message 返回消息
     * @return Response
     */
    public static Response error(String message) {
        Response response = new Response();
        response.setCode(ErrorConst.DEFAULT.getId());
        response.setStatus("error");
        response.setMessage(message);
        return response;
    }

    /**
     * 失败返回
     * @param message 返回消息
     * @param data 返回数据
     * @return Response
     */
    public static Response error(String message, Object data) {
        Response response = new Response();
        response.setCode(ErrorConst.DEFAULT.getId());
        response.setStatus("error");
        response.setMessage(message);
        response.formatData(data);
        return response;
    }

    /**
     * 失败返回
     * @param message 返回消息
     * @param code 状态码
     * @return Response
     */
    public static Response error(String message, Integer code) {
        Response response = new Response();
        response.setCode(code);
        response.setStatus("error");
        response.setMessage(message);
        return response;
    }

    /**
     * 失败返回
     * @param message 返回消息
     * @param data 返回数据
     * @param code 状态码
     * @return Response
     */
    public static Response error(String message, Object data, Integer code) {
        Response response = new Response();
        response.setCode(code);
        response.setStatus("error");
        response.setMessage(message);
        response.formatData(data);
        return response;
    }

    /**
     *
     * @param data 返回数据
     */
    public void formatData(Object data) {
        if (data != null) {
            this.setData(data);
        }
    }
}
