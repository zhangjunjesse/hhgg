package com.tgb.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.PropertyResourceBundle;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.jni.File;
import org.apache.tomcat.util.http.fileupload.FileUtils;

public class WebUtil {

	public  String getWebBgImg(HttpServletRequest req) throws Exception {
		String conp=req.getSession().getServletContext().getRealPath("/img")+"\\";
		String url  = conp + new WebUtil().getImgPro("background.img.url");
		url = url.replaceAll("\\\\", "\\\\\\\\");
		return url;
	}
	
	public  String getImgPro(String propertiesName) throws Exception{
		Properties properties = new Properties();
		String path = this.getClass().getClassLoader().getResource("/").getPath()+"jspconfig.properties";
		FileInputStream fileInputStream = new FileInputStream(new java.io.File(path));
		properties.load(fileInputStream);
		String url  = properties.getProperty(propertiesName);
		fileInputStream.close(); 
		return url;
	}

	
	public static  List<String> getWebSliderImg(HttpServletRequest req) throws Exception{
		String[] imgs = new WebUtil().getImgPro("slider.imgs.url").split(";");
		for (int i = 0; i < imgs.length; i++) {
			imgs[i] = "/img/"+imgs[i];
		}
		return Arrays.asList(imgs);
	}
	
	public static void test(){
		System.out.println(System.getProperty("user.dir"));
	}
}
