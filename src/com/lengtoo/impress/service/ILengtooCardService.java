/**
* <p>Title: ILengtooCardService.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-2
* @version 1.0
*/
package com.lengtoo.impress.service;

import java.util.List;
import java.util.Map;

import com.lengtoo.impress.dao.po.LengtooCard;

/**
 * <p>Title: ILengtooCardService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-2
 * Email: vip6ming@126.com
 */
public interface ILengtooCardService {
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
	 * @param map信息
	 * 
	 * @return 操作状态码，成功与否
	 * 
	 * @date 2014-7-4
	 */
	Map addLengtooCard(Map map);

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
