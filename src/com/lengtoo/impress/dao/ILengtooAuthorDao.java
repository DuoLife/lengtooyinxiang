/**
* <p>Title: ILengtooAuthorDao.java</p>
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
 * <p>Title: ILengtooAuthorDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-19
 * Email: vip6ming@126.com
 */
public interface ILengtooAuthorDao {

	/**
	 * 获取作者信息
	 * 
	 * @author xuming
	 * 
	 * @param 作者id
	 * 
	 * @return Map 结构的作者信息
	 * 
	 * @date 2014-09-19
	 */
	Map getAuthorMesgById_client(Map paramsMap);
}
