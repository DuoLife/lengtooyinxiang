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

import java.util.List;
import java.util.Map;

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
	public Map addLengtooWallpaper(LengtooWallpaper lengtooWallpaper) {
		return dao.addLengtooWallpaper(lengtooWallpaper);
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
