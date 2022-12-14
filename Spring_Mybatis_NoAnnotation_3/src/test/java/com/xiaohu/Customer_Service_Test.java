package com.xiaohu;

import com.xiaohu.entity.Customers;
import com.xiaohu.service.CustomersServiceInterface;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@MapperScan("com.xiaohu.dao")
public class Customer_Service_Test {

    @Test
    public void Test_FindAll(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        CustomersServiceInterface customers = (CustomersServiceInterface) ac.getBean("customersServiceImpl");
        System.out.println(customers);
        //调用方法
        List<Customers> all = customers.findAll();
        System.out.println("打印customers表数据："+all);
    }
}
-0