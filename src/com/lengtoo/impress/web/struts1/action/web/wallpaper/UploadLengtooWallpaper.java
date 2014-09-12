/**
* <p>Title: UploadLengtooCard.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-12
* @version 1.0
*/
package com.lengtoo.impress.web.struts1.action.web.wallpaper;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.lengtoo.impress.service.ILengtooWallpaperService;
import com.lengtoo.impress.tools.GetRealIp;

/**
 * <p>Title: UploadLengtooCard.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-12
 * Email: vip6ming@126.com
 */
public class UploadLengtooWallpaper extends Action{

	private ILengtooWallpaperService service;
	public void setService(ILengtooWallpaperService service) {
		this.service = service;
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map map = new HashMap();
		String imgPath = null;
		String smallimgPath = null;
		
		final long MAX_SIZE = 512 * 1024;// 设置上传文件最大为 512k   
		// 允许上传的文件格式的列表   
		final String[] allowedExt = new String[] { "jpg", "jpeg", "png","JPG", "JPEG", "PNG"};
		// 实例化一个硬盘文件工厂,用来配置上传组件ServletFileUpload   
		DiskFileItemFactory dfif = new DiskFileItemFactory();   
		dfif.setSizeThreshold(4096);// 设置上传文件时用于临时存放文件的内存大小,这里是4K.多于的部分将临时存在硬盘   
		String temppath = request.getRealPath("/")+"ImagesUploadTemp/";
		File tempfile=new File(temppath);
		if(!tempfile.exists()){
			tempfile.mkdirs();
		}else{
			//System.out.println("判断为路径存在！");
		}
		dfif.setRepository(tempfile);// 设置存放临时文件的目录,web根目录下的ImagesUploadTemp目录   
		
		// 用以上工厂实例化上传组件   
		ServletFileUpload sfu = new ServletFileUpload(dfif);   
		// 设置最大上传尺寸   
		sfu.setSizeMax(MAX_SIZE);   
		
		PrintWriter out = response.getWriter();   
		// 从request得到 所有 上传域的列表   
		List fileList = null;   
		try {   
			fileList = sfu.parseRequest(request);   
		} catch (FileUploadException e) {
			// 处理文件尺寸过大异常   
			//e.printStackTrace();   
			if (e instanceof SizeLimitExceededException) {
				//msg = 211;//图片超过规定大小
				//System.out.println("图片大小");
				return null;   
			}   
		}   
		// 得到所有上传的文件   
		Iterator fileItr = fileList.iterator();
		// 循环处理所有文件
		while (fileItr.hasNext()) {   
			FileItem fileItem = null;   
			String path = null;   
			long size = 0;   
			// 得到当前文件   
			fileItem = (FileItem) fileItr.next();
			//**** 通过此方法获取表单中的其他字段信息！****
			//*** action
			if(fileItem.isFormField()){
//				if(((String)fileItem.getFieldName()).equals("default_text")) {  
//					default_text = fileItem.getString("utf-8");  
//					System.out.println(default_text);
//				}
			}
			// 忽略简单form字段而不是上传域的文件域(<input type="text" />等)   
			if (fileItem == null || fileItem.isFormField()) {   
				continue;
			}   
			// 得到文件的完整路径   
			path = fileItem.getName();
			//System.out.println(fileItem.getFieldName()+"    能否获取到上传文件的key呢？？？？");  
			//判断是原图还是缩略图
			String isThumbnail = "";
			boolean isBig = false;
			if(fileItem.getFieldName().equals("img")) {
				//原图
				isBig = true;
				isThumbnail = "";
			}else if(fileItem.getFieldName().equals("thumbnail")) {
				//缩略图
				isThumbnail = "smallwallpaper/small_";
			}
			// 得到文件的大小
			size = fileItem.getSize();
			if (!"".equals(path) || size != 0) {   
				// 得到去除路径的文件名   
				String t_name = path.substring(path.lastIndexOf("\\") + 1);   
				// 得到文件的扩展名(无扩展名时将得到全名)
				String t_ext = t_name.substring(t_name.lastIndexOf(".") + 1);  
				//System.out.println("文件扩展名为："+t_ext);
				// 拒绝接受规定文件格式之外的文件类型
				boolean isAllowe = false;   
				int allowedExtCount = allowedExt.length;   
				for (int allowFlag= 0; allowFlag < allowedExtCount; allowFlag++) {
					if (allowedExt[allowFlag].equals(t_ext))
						isAllowe = true;
				}   
				if (!isAllowe) {   
					out.println("请上传以下类型的文件<p />");   
					for (int allowFlag = 0; allowFlag < allowedExtCount; allowFlag++)   
					//失败返回
					//msg = 212;//图片类型不正确
					return null;   
				}   
				
				long now = System.currentTimeMillis();   
				// 根据系统时间生成上传后保存的文件名   
				String prefix = String.valueOf(now);   
				
				//************************ 上传附件保存 ************************
				
				// 保存的最终文件完整路径,保存在web根目录下的ImagesUploaded目录下   
				File uploadfile=new File(request.getRealPath("/") + "ImagesUploaded");
				File uploadCardfile=new File(request.getRealPath("/") + "ImagesUploaded/wallpaper");
				File uploadSCardfile=new File(request.getRealPath("/") + "ImagesUploaded/wallpaper/smallwallpaper");
				//System.out.println(uploadfile);
				if(!uploadfile.exists()){
					uploadfile.mkdirs();
				}
				if(!uploadCardfile.exists()){
					uploadCardfile.mkdirs();
				}
				if(!uploadSCardfile.exists()){
					uploadSCardfile.mkdirs();
				}
				//数据库 保存文件的"/ImagesUploaded/prefix(服务器端保存名称).t_ext(格式)"
				String relativePath = "ImagesUploaded/wallpaper/" + isThumbnail + prefix + "." + t_ext;
				String u_name = request.getRealPath("/") + relativePath; 
				//保存数据至本地
				fileItem.write(new File(u_name));
				if(isBig) {
					imgPath = "/" + relativePath;
				}else {
					smallimgPath = "/" + relativePath;
				}
			}
		}
		//service
		String ip = GetRealIp.getIpAddr(request);
		map.put("ip", ip);
		map.put("imgPath", imgPath);  
		map.put("smallimgPath", smallimgPath);  
		//
		service.addLengtooWallpaper(map);
	return null;
	}
}
