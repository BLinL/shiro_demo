package com.bliu.sd.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OpenResultDTO {

    private int code;
    private String content;

    public OpenResultDTO(StatusCode statusCode){
        this.code = statusCode.getCode();
        this.content = statusCode.getMsg();
    }

    public OpenResultDTO(StatusCode statusCode,String content){
        this.code = statusCode.getCode();
        this.content = content;
    }

    public static OpenResultDTO ok(){
        return new OpenResultDTO(StatusCode.OK);
    }

    public static OpenResultDTO ok(String content){
        return new OpenResultDTO(StatusCode.OK, content);
    }

    public static OpenResultDTO fail(){
        return new OpenResultDTO(StatusCode.FAIL);
    }

    public static OpenResultDTO fail(String content){
        return new OpenResultDTO(StatusCode.FAIL, content);
    }
}
