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
public interface ILengtooChartletpackageService {
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
	List<Map> getAllChartletpackage_client(Map paramsMap);
	
	/**
	 * 根据包id获取一个贴图包信息
	 * 
	 * @author xuming
	 * 
	 * @param packageid
	 * 
	 * @return Map结构的冷兔贴图包信息
	 * 
	 * @date 2014-10-20
	 */
	Map getOneChartletpackageByPid_client(Map paramsMap);
	
	/**
	 * 增加贴图使用次数
	 * 
	 * @author xuming
	 * 
	 * @param 表情id
	 * 
	 * @return Map 操作实行状态
	 * 
	 * @date 2014-09-24
	 */
	Map updateNumberofuse_client(int packageid);
}
