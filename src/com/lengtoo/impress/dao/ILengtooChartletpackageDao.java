/**
* <p>Title: ILengtooChartletpackageDao.java</p>
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
 * <p>Title: ILengtooChartletpackageDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-19
 * Email: vip6ming@126.com
 */
public interface ILengtooChartletpackageDao {

	/**
	 * 获取贴图包列表信息
	 * 
	 * @author xuming
	 * 
	 * @param 最后一个贴图包的上传日期
	 * 
	 * @return list<Map>结构的冷兔贴图包信息
	 * 
	 * @date 2014-09-19
	 */
	List<Map> getAllChartletpackage_client(Map paramsMap);
	
	/**
	 * 根据包id获取一个贴图包信息
	 * 
	 * @author xuming
	 * 
	 * @param packageid
	 * 
	 * @return list<Map>结构的冷兔贴图包信息
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
