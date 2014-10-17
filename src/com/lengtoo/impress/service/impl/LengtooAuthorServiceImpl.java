/**
* <p>Title: LengtooAuthorServiceImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-22
* @version 1.0
*/
package com.lengtoo.impress.service.impl;

import java.util.Map;

import com.lengtoo.impress.dao.ILengtooAuthorDao;
import com.lengtoo.impress.service.ILengtooAuthorService;

/**
 * <p>Title: LengtooAuthorServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public class LengtooAuthorServiceImpl implements ILengtooAuthorService{

	private ILengtooAuthorDao dao;
	public void setDao(ILengtooAuthorDao dao) {
		this.dao = dao;
	}
	
	public Map getAuthorMesgById_client(Map paramsMap) {
		String requestType = (String) paramsMap.get("requestType");
		if("list".equals(requestType)){
			return dao.getAuthorMesgById_client(paramsMap);
		}else if("emojirollimg".equals(requestType)) {
//			return dao.getAuthorMesgByEmojipackageId_client(paramsMap);
			return getAuthorMesgByEmojipackageId_client(paramsMap);
		}else if("chartletrollimg".equals(requestType)) {
			//return dao.getAuthorMesgByChartletpackageId_client(paramsMap);
			return getAuthorMesgByChartletpackageId_client(paramsMap);
		}else {
			return null;
		}
		
	}

	public Map getAuthorMesgByChartletpackageId_client(Map paramsMap) {
		return dao.getAuthorMesgByChartletpackageId_client(paramsMap);
	}

	public Map getAuthorMesgByEmojipackageId_client(Map paramsMap) {
		return dao.getAuthorMesgByEmojipackageId_client(paramsMap);
	}

}
