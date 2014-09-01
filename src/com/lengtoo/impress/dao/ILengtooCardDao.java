/**
* <p>Title: ILengtooCardDao.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-6-27
* @version 1.0
*/
package com.lengtoo.impress.dao;

import java.util.List;
import java.util.Map;

import com.lengtoo.impress.dao.po.LengtooCard;

/**
 * <p>Title: ILengtooCardDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-6-27
 * Email: vip6ming@126.com
 */
public interface ILengtooCardDao {

	/**
	 * 
	 * @author xuming
	 * 
	 * @param 最后一张图片的上传日期
	 * 
	 * @return list<Map>结构的冷兔card信息
	 * 
	 * @date 2014-6-27
	 */
	List<Map> getAllCardMesg(Map paramsMap);
	
	/**
	 * 
	 * @author xuming
	 * 
	 * @param lengtooCard信息
	 * 
	 * @return 操作状态码，成功与否
	 * 
	 * @date 2014-7-4
	 */
	Map addLengtooCard(LengtooCard lengtooCard);

	/**
	 * @author xuming
	 * 
	 * @param 最后一张图片的上传日期
	 * 
	 * @return web端list<Map>结构的冷兔card信息
	 * 
	 * @date 2014-8-29
	 */
	List<Map> getAllCardMesg_Web(Map paramsMap);
	
	/**
	 * 
	 * @author xuming
	 * 
	 * @param onshow: 1(显示),0(隐藏); cardid: 变更项的id。
	 * 
	 * @return 操作状态码，成功与否
	 * 
	 * @date 2014-08-29
	 */
	Map updateCardOnshow_web(Map map);
	
	/**
	 * 
	 * @author xuming
	 * 
	 * @param cardid: 删除项的id。
	 * 
	 * @return 操作状态码，成功与否
	 * 
	 * @date 2014-08-29
	 */
	Map deleteCard_web(Map map);
}
