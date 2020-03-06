package com.qc.springcloud.enums;

import lombok.Getter;


/**
 * 返回结果枚举类
 * @author qc
 * @create 2019-10-10 20:55
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(true,20000,"成功"),
    LIMIT_IP_ERROR(false,30000,"访问频繁"),
    REDIS_RW_ERROR(false,40000,"redis处理异常"),
    UNKNOWN_REASON(false, 20000, "未知错误"),
    BAD_SQL_GRAMMAR(false, 20000, "sql语法错误"),
    JSON_PARSE_ERROR(false, 20000, "json解析异常"),
    PARAM_ERROR(false, 20000, "参数不正确"),
    FILE_UPLOAD_ERROR(false, 20000, "文件上传错误"),
    EXCEL_DATA_IMPORT_ERROR(false, 20000, "Excel数据导入错误");
    private Boolean success;
    private Integer code;
    private String message;

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public static void main(String[] args){
        System.out.println(ResultCodeEnum.SUCCESS.success);
        System.out.println(ResultCodeEnum.SUCCESS.code);
    }
}
