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

}
