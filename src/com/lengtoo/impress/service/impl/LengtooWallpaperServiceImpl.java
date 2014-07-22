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

	public List<Map> getAllWallpaperMesg(String date) {
		return dao.getAllWallpaperMesg(date);
	}

}
