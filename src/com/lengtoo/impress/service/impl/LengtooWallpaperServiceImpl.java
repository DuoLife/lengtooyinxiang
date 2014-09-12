/**
* <p>Title: LengtooWallpaperServiceImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-22
* @version 1.0
*/
package com.lengtoo.impress.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lengtoo.impress.dao.ILengtooWallpaperDao;
import com.lengtoo.impress.dao.po.LengtooWallpaper;
import com.lengtoo.impress.service.ILengtooWallpaperService;

/**
 * <p>Title: LengtooWallpaperServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-22
 * Email: vip6ming@126.com
 */
public class LengtooWallpaperServiceImpl implements ILengtooWallpaperService{

	private ILengtooWallpaperDao dao;
	public void setDao(ILengtooWallpaperDao dao) {
		this.dao = dao;
	}

	public List<Map> getAllWallpaperMesg(Map paramsMap) {
		return dao.getAllWallpaperMesg(paramsMap);
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooWallpaperService#getAllWallpaperMesg_Web(java.util.Map)
	 */
	public List<Map> getAllWallpaperMesg_Web(Map paramsMap) {
		return dao.getAllWallpaperMesg_Web(paramsMap);
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooWallpaperService#addLengtooWallpaper(com.lengtoo.impress.dao.po.LengtooWallpaper)
	 */
	public Map addLengtooWallpaper(Map map) {
		LengtooWallpaper lengtooWallpaper = map2LengtooWallpaper(map);
		return dao.addLengtooWallpaper(lengtooWallpaper);
	}

	/**
	 * @author xuming
	 * 
	 * @param map
	 * 
	 * @return LengtooWallpaper
	 * 
	 * @date 2014-9-12
	 */
	private LengtooWallpaper map2LengtooWallpaper(Map map) {
		Date createdate = new Date();
		String imgPath = (String) map.get("imgPath");
		String smallimgPath = (String) map.get("smallimgPath");
		String ip = (String) map.get("ip");
		int width = 1440;
		int height = 1280;
		int smallWidth = 320;
		int smallHeight = 284;
		int ontop = 0;
		int onshow = 1;
		String smallImgurl = imgPath;
		String bigImgurl = smallimgPath;
		String uploadIp = ip;
		String defaultText = "把祝福送给你的小伙伴吧";
		
		LengtooWallpaper lengtooWallpaper = new LengtooWallpaper();
		lengtooWallpaper.setBig_imgurl(bigImgurl);
		lengtooWallpaper.setCreatedate(createdate);
		lengtooWallpaper.setDefault_text(defaultText);
		lengtooWallpaper.setHeight(height);
		lengtooWallpaper.setSmall_height(smallHeight);
		lengtooWallpaper.setSmall_imgurl(smallImgurl);
		lengtooWallpaper.setSmall_width(smallWidth);
		lengtooWallpaper.setUpload_ip(uploadIp);
		lengtooWallpaper.setWidth(width);
		lengtooWallpaper.setOnshow(onshow);
		lengtooWallpaper.setOntop(ontop);
		return lengtooWallpaper;
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooWallpaperService#deleteWallpaper_web(java.util.Map)
	 */
	public Map deleteWallpaper_web(Map map) {
		return dao.deleteWallpaper_web(map);
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooWallpaperService#updateWallpaperOnshow_web(java.util.Map)
	 */
	public Map updateWallpaperOnshow_web(Map map) {
		return dao.updateWallpaperOnshow_web(map);
	}

}
