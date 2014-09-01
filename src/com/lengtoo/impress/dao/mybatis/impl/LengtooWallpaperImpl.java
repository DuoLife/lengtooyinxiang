/**
* <p>Title: LengtooWallpaperImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-22
* @version 1.0
*/
package com.lengtoo.impress.dao.mybatis.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lengtoo.impress.dao.ILengtooWallpaperDao;
import com.lengtoo.impress.dao.po.LengtooWallpaper;

/**
 * <p>Title: LengtooWallpaperImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-22
 * Email: vip6ming@126.com
 */
public class LengtooWallpaperImpl extends SqlSessionDaoSupport implements ILengtooWallpaperDao{

	public Map addLengtooWallpaper(LengtooWallpaper lengtooWallpaper) {
		Map result = new HashMap();
		int isOk = getSqlSession().insert("LengtooWallpaper.insertOne", lengtooWallpaper);
		result.put("isOk", isOk);
		return result;
	}
	
	public List<Map> getAllWallpaperMesg(Map paramsMap) {
		String date = (String) paramsMap.get("date");
		int limit = (Integer) paramsMap.get("limit");
		List result = new ArrayList();
		List<LengtooWallpaper> list = getSqlSession().selectList("LengtooWallpaper.selectAll", paramsMap);
		for(LengtooWallpaper lw: list) {
			Map map = new HashMap();
			map.put("Wallpaperid", lw.getWallpaperid());
			map.put("Width", lw.getWidth());
			map.put("Height", lw.getHeight());
			map.put("Small_width", lw.getSmall_width());
			map.put("Small_height", lw.getSmall_height());
			//map.put("Default_text", lw.getDefault_text());
			map.put("Small_imgurl", lw.getSmall_imgurl());
			map.put("Big_imgurl", lw.getBig_imgurl());
			//map.put("Upload_ip", lw.getUpload_ip());
			Date d = lw.getCreatedate();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dStr = sdf.format(d);
			map.put("Createdate", dStr);
			result.add(map);
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooWallpaperDao#getAllWallpaperMesg_Web(java.util.Map)
	 */
	public List<Map> getAllWallpaperMesg_Web(Map paramsMap) {
		String date = (String) paramsMap.get("date");
		int limit = (Integer) paramsMap.get("limit");
		List result = new ArrayList();
		List<LengtooWallpaper> list = getSqlSession().selectList("LengtooWallpaper.selectAllWeb", paramsMap);
		for(LengtooWallpaper lw: list) {
			Map map = new HashMap();
			map.put("Wallpaperid", lw.getWallpaperid());
			//map.put("Width", lw.getWidth());
			//map.put("Height", lw.getHeight());
			//map.put("Small_width", lw.getSmall_width());
			//map.put("Small_height", lw.getSmall_height());
			//map.put("Default_text", lw.getDefault_text());
			map.put("Small_imgurl", lw.getSmall_imgurl());
			map.put("Big_imgurl", lw.getBig_imgurl());
			map.put("OnTop", lw.getOntop());
			map.put("OnShow", lw.getOnshow());
			//map.put("Upload_ip", lw.getUpload_ip());
			Date d = lw.getCreatedate();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String dStr = sdf.format(d);
			map.put("Createdate", dStr);
			result.add(map);
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooWallpaperDao#deleteWallpaper_web(java.util.Map)
	 */
	public Map deleteWallpaper_web(Map map) {
		Map result = new HashMap();
		int isOk = getSqlSession().insert("LengtooWallpaper.deleteWallpaper", map);
		result.put("isOk", isOk);
		return result;
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooWallpaperDao#updateWallpaperOnshow_web(java.util.Map)
	 */
	public Map updateWallpaperOnshow_web(Map map) {
		Map result = new HashMap();
		int isOk = getSqlSession().insert("LengtooWallpaper.updateShow", map);
		result.put("isOk", isOk);
		return result;
	}

}
