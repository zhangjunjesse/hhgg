package com.tgb.web;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.tgb.util.WebUtil;

@Controller
public class ManagerController {

	private MultipartFile  uploadFile;// 得到上传的文件
	private String excelFileContentType;// 得到文件的类型
	private String excelFileFileName;// 得到文件的名称
	
	
	public MultipartFile getUploadFile() {
		return uploadFile;
	}


	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}


	public String getExcelFileContentType() {
		return excelFileContentType;
	}


	public void setExcelFileContentType(String excelFileContentType) {
		this.excelFileContentType = excelFileContentType;
	}


	public String getExcelFileFileName() {
		return excelFileFileName;
	}


	public void setExcelFileFileName(String excelFileFileName) {
		this.excelFileFileName = excelFileFileName;
	}


	@RequestMapping("/changeBg")
	public  String  changeBg(MultipartFile uploadFile,HttpServletRequest req) throws Exception{
		if(null!=uploadFile){
			System.out.println(uploadFile.getName()+"--"+uploadFile.getSize()); 
			String filename = uploadFile.getOriginalFilename();
			SaveFileFromInputStream(uploadFile.getInputStream(),req.getSession().getServletContext().getRealPath("/img"),filename);
			changeImgPro(filename,req,"background.img.url");
		}
		return "/MyBlog/Manager/controller";
	}
	

	@RequestMapping("/chooseSliderImg")
	public  String  chooseSliderImg(@RequestParam MultipartFile[] imgs,HttpServletRequest req) throws Exception{
		String imgsName = "";
		for(MultipartFile file : imgs){
			if(null!=file){
				System.out.println(file.getName()+"--"+file.getSize()); 
				String filename = file.getOriginalFilename();
				imgsName+=filename+";";
				SaveFileFromInputStream(file.getInputStream(),req.getSession().getServletContext().getRealPath("/img"),filename);
			}
		}
		changeImgPro(imgsName,req,"slider.imgs.url");
		return "/MyBlog/Manager/controller";
	}




	private  void changeImgPro(String value, HttpServletRequest req,String propertiesName) throws Exception{
		String path = this.getClass().getClassLoader().getResource("/").getPath()+"jspconfig.properties";
		FileInputStream is = new FileInputStream(path);
		Properties properties =new Properties();
		properties.load(is);
		is.close();
		FileOutputStream os = new FileOutputStream(path);
		properties.setProperty(propertiesName, value);
		properties.store(os, "");
		os.close();
	}
	
	
	private static void SaveFileFromInputStream(InputStream inputStream,
			String realPath, String filename) throws Exception {
		FileOutputStream stream = new FileOutputStream(realPath+"/"+filename);
		System.out.println("---------"+realPath+"/"+filename);
		byte[] buffer = new byte[1024*1024];
		int byteread = 0;
		while((byteread = inputStream.read(buffer))!=-1){
			stream.write(buffer,0,byteread	);
			stream.flush();
		}
		stream.close();
		inputStream.close();
	}
}
