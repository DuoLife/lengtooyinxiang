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
		
		return null;
	}
	
	public List<Map> getAllWallpaperMesg(String date) {
		List result = new ArrayList();
		List<LengtooWallpaper> list = getSqlSession().selectList("LengtooWallpaper.selectAll", date);
		for(LengtooWallpaper lw: list) {
			Map map = new HashMap();
			map.put("mapid", lw.getWallpaperid());
			map.put("Width", lw.getWidth());
			map.put("Default_text", lw.getDefault_text());
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

}
