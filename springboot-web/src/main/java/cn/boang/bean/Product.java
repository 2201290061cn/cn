package cn.boang.bean;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 产品
 */
@Data
@ApiModel(value = "产品")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    //产品ID
    private String prodId;

    //供应商ID
    private Integer vendId;

    //产品名称
    private String prodName;

    //产品价格
    private Double prodPrice;

    //产品描述
    private String prodDesc;


}
