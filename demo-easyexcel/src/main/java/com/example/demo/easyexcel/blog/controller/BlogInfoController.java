package com.example.demo.easyexcel.blog.controller;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.example.demo.easyexcel.blog.domain.BlogInfo;
import com.example.demo.easyexcel.blog.service.BlogInfoService;
import com.example.demo.easyexcel.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequestMapping("/api/blog")
public class BlogInfoController {

    @Autowired
    BlogInfoService blogInfoService;

    @GetMapping(value = "/export")
    public Object export(HttpServletRequest request, HttpServletResponse response) {
        ServletOutputStream out = null;

        try {
            response = setResponseHeader("test.xlsx", request, response);
            out = response.getOutputStream();
            ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX);
            Sheet sheet = new Sheet(1, 0, BlogInfo.class);
            writer.write(blogInfoService.queryAll(), sheet);
            writer.finish();

            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return "succeed";
    }

    /**
     * 设置响应头
     *
     * @author guojianxia 2016年9月22日
     * @param request
     * @param response
     * @param fileName
     * @throws IOException
     */
    public HttpServletResponse setResponseHeader(String fileName, HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        // 通过名称：User-Agent，获取浏览器类型。（在浏览器里firebug可以找到）
        String agent = request.getHeader("User-Agent");
        // 根据浏览器、文件名称设置文件名编码
        fileName = FileUtil.encodeDownloadFilename(fileName, agent);
        // 根据文件名称设置文件类型
        String mimeType = request.getSession().getServletContext().getMimeType(fileName);
        // 文件下载的输出流
        // 文件下载的类型头
        response.setContentType(mimeType);
        // 文件下载的？
        response.setHeader("content-disposition", "attachment;filename=" + fileName);
        return response;
    }
}
