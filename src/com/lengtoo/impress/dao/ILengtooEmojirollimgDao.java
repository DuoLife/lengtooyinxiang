/**
* <p>Title: ILengtooEmojirollimgDao.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-18
* @version 1.0
*/
package com.lengtoo.impress.dao;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: ILengtooEmojirollimgDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-18
 * Email: vip6ming@126.com
 */
public interface ILengtooEmojirollimgDao {
	/**
	 * 获取贴图页的轮播图列表
	 * 
	 * @author xuming
	 * 
	 * @param 
	 * 
	 * @return List<Map> 结构轮播图信息
	 * 
	 * @date 2014-9-18
	 */
	List<Map> getAllRollimg_client(Map paramsMap);
}
