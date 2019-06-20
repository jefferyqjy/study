package com.example.demo.easyexcel;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.demo.easyexcel.listener.ExcelListener;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.InputStream;

@SpringBootTest
class DemoEasyexcelApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testExcel2003NoModel() {
        InputStream inputStream = getInputStream("");
        ExcelListener listener = new ExcelListener();
        ExcelReader excelReader = new ExcelReader(inputStream, ExcelTypeEnum.XLS, null, listener);
        excelReader.read();
    }

    private InputStream getInputStream(String s) {
        return null;

    }

}
