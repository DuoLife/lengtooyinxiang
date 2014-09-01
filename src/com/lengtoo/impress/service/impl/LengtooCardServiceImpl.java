/**
* <p>Title: LengtooCardServiceImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-2
* @version 1.0
*/
package com.lengtoo.impress.service.impl;

import java.util.List;
import java.util.Map;

import com.lengtoo.impress.dao.ILengtooCardDao;
import com.lengtoo.impress.dao.po.LengtooCard;
import com.lengtoo.impress.service.ILengtooCardService;

/**
 * <p>Title: LengtooCardServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-2
 * Email: vip6ming@126.com
 */
public class LengtooCardServiceImpl implements ILengtooCardService{

	private ILengtooCardDao dao;
	public void setDao(ILengtooCardDao dao) {
		this.dao = dao;
	}

	public List<Map> getAllCardMesg(Map paramsMap) {
		return dao.getAllCardMesg(paramsMap);
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooCardService#getAllCardMesg_Web(java.util.Map)
	 */
	public List<Map> getAllCardMesg_Web(Map paramsMap) {
		return dao.getAllCardMesg_Web(paramsMap);
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooCardService#addLengtooCard(com.lengtoo.impress.dao.po.LengtooCard)
	 */
	public Map addLengtooCard(LengtooCard lengtooCard) {
		return dao.addLengtooCard(lengtooCard);
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooCardService#deleteCard(java.util.Map)
	 */
	public Map deleteCard_web(Map map) {
		return dao.deleteCard_web(map);
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooCardService#updateCardOnshow_web(java.util.Map)
	 */
	public Map updateCardOnshow_web(Map map) {
		return dao.updateCardOnshow_web(map);
	}

}
