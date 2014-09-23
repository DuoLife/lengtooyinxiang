/**
* <p>Title: ILengtooEmoji.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-22
* @version 1.0
*/
package com.lengtoo.impress.service;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: ILengtooEmoji.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public interface ILengtooEmojirollimgService {
	/**
	 * 获取贴图页的轮播图列表
	 * 
	 * @author xuming
	 * 
	 * @param 
	 * 
	 * @return List<Map> 结构轮播图信息
	 * 
	 * @date 2014-9-22
	 */
	List<Map> getAllRollimg_client(Map paramsMap);
}
