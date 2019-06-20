package com.example.demo.easyexcel.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

public class ExcelListener extends AnalysisEventListener {

    @Override
    public void invoke(Object o, AnalysisContext analysisContext) {
        System.out.println("current row number:" + analysisContext.getCurrentRowNum());
        System.out.println(o);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
