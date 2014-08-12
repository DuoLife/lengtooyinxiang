/**
* <p>Title: ILengtooGameDao.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-26
* @version 1.0
*/
package com.lengtoo.game.dao;

import java.util.List;
import java.util.Map;

import com.lengtoo.game.dao.po.LengtooGame;

/**
 * <p>Title: ILengtooGameDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-26
 * Email: vip6ming@126.com
 */
public interface ILengtooGameDao {
	/**
	 * 
	 * @author xuming
	 * 
	 * @param 
	 * 
	 * @return list<Map>结构的游戏排名信息
	 * 
	 * @date 2014-07-26
	 */
	List<Map> getAllRanking(Map paramsMap);
	
	/**
	 * 
	 * @author xuming
	 * 
	 * @param 记录比分信息
	 * 
	 * @return 操作状态码，成功与否
	 * 
	 * @date 2014-07-26
	 */
	Map addLengtooRanking(LengtooGame lengtooGame);
}
