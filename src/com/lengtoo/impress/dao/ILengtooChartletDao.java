/**
* <p>Title: ILengtooEmojiDao.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-19
* @version 1.0
*/
package com.lengtoo.impress.dao;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: ILengtooEmojiDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-19
 * Email: vip6ming@126.com
 */
public interface ILengtooChartletDao {

	/**
	 * 获取表情详细列表信息
	 * 
	 * @author xuming
	 * 
	 * @param 表情包id
	 * 
	 * @return list<Map>结构的冷兔表情详细信息
	 * 
	 * @date 2014-09-19
	 */
	List<Map> getAllChartlet_client(Map paramsMap);
}
