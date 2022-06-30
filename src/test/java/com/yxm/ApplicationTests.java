package com.yxm;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
      /*  String path1 = Excute.class.getResource("/").getPath();*/
        String path3 = System.getProperty("user.dir");
        System.out.println(System.getProperty("user.dir")+"\\src\\main\\resources\\public\\images\\");
        String sum1 = "96034.45";
        String  fdMoney = "96034.45";
        String fd_castotalAmount = "96034.45";
        BigDecimal hasPay = new BigDecimal("0");
        //出纳金额
        BigDecimal chuNa = new BigDecimal("0");
        if(fdMoney != null){
            chuNa = new BigDecimal(fdMoney);
            hasPay = hasPay.add(chuNa);
        }
        //记录出纳填写金额
        BigDecimal hasChu = new BigDecimal("0");
        if(fd_castotalAmount != null){
            hasChu = new BigDecimal(fd_castotalAmount);
            System.out.println(hasChu);
        }
        hasChu = hasChu.add(chuNa);
        System.out.println("出纳金额hasPay："+hasPay);
        System.out.println("纳填写金额hasChu:"+hasChu);




        BigDecimal sum = new BigDecimal("0");
        if(sum1 == null){

        }else{
            sum = new BigDecimal(sum1.toString());//.parseDouble(modelData.get("fd_sum").toString());
            sum = sum.setScale(6, BigDecimal.ROUND_HALF_UP);
        }
        System.out.println(sum.doubleValue());
        System.out.println(hasPay.doubleValue());
        BigDecimal remain = new BigDecimal("0");
        System.out.println(remain);


        BigDecimal chuNa1 = new BigDecimal(34899.12);
        String Credit = "";
        chuNa1 = chuNa.subtract(remain);
        Credit = remain.toString();
        System.out.println(chuNa1);
        System.out.println(Credit);
    }

}
