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
public interface ILengtooEmojiService {

	/**
	 * 获取贴图详细列表信息
	 * 
	 * @author xuming
	 * 
	 * @param 贴图包id
	 * 
	 * @return list<Map>结构的冷兔贴图详细信息
	 * 
	 * @date 2014-09-22
	 */
	List<Map> getAllEmoji_client(Map paramsMap);
}
