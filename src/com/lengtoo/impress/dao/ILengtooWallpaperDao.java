/**
* <p>Title: IlengtooWallpaperDao.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-22
* @version 1.0
*/
package com.lengtoo.impress.dao;

import java.util.List;
import java.util.Map;

import com.lengtoo.impress.dao.po.LengtooWallpaper;


/**
 * <p>Title: IlengtooWallpaperDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-22
 * Email: vip6ming@126.com
 */
public interface ILengtooWallpaperDao {
	/**
	 * 
	 * @author xuming
	 * 
	 * @param 最后一张图片的上传日期
	 * 
	 * @return list<Map>结构的冷兔壁纸信息
	 * 
	 * @date 2014-07-22
	 */
	List<Map> getAllWallpaperMesg(String date);

	/**
	 * 
	 * @author xuming
	 * 
	 * @param lengtooWallpaper信息
	 * 
	 * @return 操作状态码，成功与否
	 * 
	 * @date 2014-7-22
	 */
	Map addLengtooWallpaper(LengtooWallpaper lengtooWallpaper);
}
