/**
* <p>Title: LengtooChartletpackageServiceImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-22
* @version 1.0
*/
package com.lengtoo.impress.service.impl;

import java.util.List;
import java.util.Map;

import com.lengtoo.impress.dao.ILengtooChartletpackageDao;
import com.lengtoo.impress.service.ILengtooChartletpackageService;
import com.lengtoo.impress.tools.LengtooImgPath;

/**
 * <p>Title: LengtooChartletpackageServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public class LengtooChartletpackageServiceImpl implements ILengtooChartletpackageService{

	private ILengtooChartletpackageDao dao;
	public void setDao(ILengtooChartletpackageDao dao) {
		this.dao = dao;
	}
	
	String url = LengtooImgPath.getUrl();
	public List<Map> getAllChartletpackage_client(Map paramsMap) {
		List<Map> list = dao.getAllChartletpackage_client(paramsMap);
		for (Map m: list) {
			String thumbnaiurl = (String) m.get("thumbnaiurl");
			m.put("thumbnaiurl", url + thumbnaiurl); 
		}
		return list;
	}
	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooChartletpackageService#updateNumberofuse_client(int)
	 */
	public Map updateNumberofuse_client(int packageid) {
		return dao.updateNumberofuse_client(packageid);
	}
	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooChartletpackageService#getOneChartletpackageByPid_client(java.util.Map)
	 */
	public Map getOneChartletpackageByPid_client(Map paramsMap) {
		Map result = dao.getOneChartletpackageByPid_client(paramsMap);
		String thumbnaiurl = (String) result.get("thumbnaiurl");
		result.put("thumbnaiurl", url + thumbnaiurl); 
		return result;
	}

}
