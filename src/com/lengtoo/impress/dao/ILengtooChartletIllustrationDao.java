/**
* <p>Title: ILengtooChartletIllustration.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-22
* @version 1.0
*/
package com.lengtoo.impress.dao;

import java.util.List;
import java.util.Map;

/**
 * <p>Title: ILengtooChartletIllustration.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public interface ILengtooChartletIllustrationDao {
	/**
	 * 获取贴图页的样例配图信息
	 * 
	 * @author xuming
	 * 
	 * @param 
	 * 
	 * @return List<Map> 结构样例配图信息
	 * 
	 * @date 2014-9-22
	 */
	List<Map> getIllustrationByPackageId_client(Map paramsMap);
}
