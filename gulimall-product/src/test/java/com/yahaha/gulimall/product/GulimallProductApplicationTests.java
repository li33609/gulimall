package com.yahaha.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yahaha.gulimall.product.entity.BrandEntity;
import com.yahaha.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("三星");
//
////        brandEntity.setDescript("华为");
////        brandService.save(brandEntity);
////        System.out.println("保存成功!");
//
//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item) -> {
            System.out.println(item);
        });
    }

}
