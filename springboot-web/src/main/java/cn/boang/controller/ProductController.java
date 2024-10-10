package cn.boang.controller;


import cn.boang.bean.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//Rest风格的Controller，相当于@Controller+@ResponseBody
@RequestMapping("/prod")
@Slf4j
@Api(tags = "产品管理模块")
public class ProductController {

//    @ResponseBody//返回的是json数据
    @GetMapping
    @ApiOperation(value = "获取产品列表")
    public List<Product> queryAll(){
        return List.of(
                new Product("aaa",1,"产品一",100.0,"asfaf"),
                new Product("bbb",2,"产品二",200.0,"asfaf"),
                new Product("ccc",3,"产品三",300.0,"asfaf")
        );
    }

    @GetMapping("/{id}")
    public Product queryById(@PathVariable String id) {
        return new Product(id, 2,
                "abc", 50.5, "qwerty");
    }

    @PostMapping
    public Product addOne(@RequestBody Product product) {
        log.info("添加了一个product is {}",product);
        return product;
    }

    @PutMapping("/{id}")
    public Product modOne(@PathVariable String id,@RequestBody Product product) {
        log.info("修改了一个product is {}",product);
        return product;
    }

    @DeleteMapping("/{id}")
    public Product delOne(@PathVariable String id) {
        Product product = new Product(id,
                6, "ppp", 23.5, "qaz");
        log.info("删除了一个product is {}",product);
        return product;
    }
}
