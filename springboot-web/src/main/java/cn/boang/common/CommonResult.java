package cn.boang.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
//200001 产品系统异常
public class CommonResult <T> implements Serializable {

        //0代表正常
        private int code = 0;

        //错误消息
        private String message = "操作成功";

        //核心数据
        private T data;
}
