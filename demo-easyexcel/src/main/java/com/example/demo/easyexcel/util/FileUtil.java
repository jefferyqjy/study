package com.example.demo.easyexcel.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import sun.misc.BASE64Encoder;

/**
 * 
 * @author 刘俊
 * @time 2015年5月6日
 */
public class FileUtil {

	/**
	 * 下载文件时，针对不同浏览器，进行附件名的编码
	 * 
	 * @param filename  下载文件名
	 * @param agent  客户端浏览器
	 * @return 编码后的下载附件名
	 * @throws IOException
	 */
	@SuppressWarnings("restriction")
	public static String encodeDownloadFilename(String filename, String agent)
			throws IOException {
		if (agent.contains("Firefox")) { // 火狐浏览器
			filename = "=?UTF-8?B?"
					+ new BASE64Encoder().encode(filename.getBytes("utf-8"))
					+ "?=";
			filename = filename.replaceAll("\r\n", "");
		} else { // IE及其他浏览器
			filename = URLEncoder.encode(filename, "utf-8");
			filename = filename.replace("+"," ");
		}
		return filename;
	}
}