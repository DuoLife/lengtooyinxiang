/**
* <p>Title: LengtooChartlet.java</p>
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

import com.lengtoo.impress.dao.ILengtooChartletDao;
import com.lengtoo.impress.service.ILengtooChartletService;
import com.lengtoo.impress.tools.LengtooImgPath;

/**
 * <p>Title: LengtooChartlet.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public class LengtooChartletServiceImpl implements ILengtooChartletService{

	private ILengtooChartletDao dao;
	public void setDao(ILengtooChartletDao dao) {
		this.dao = dao;
	}
	String url = LengtooImgPath.getUrl();
	public List<Map> getAllChartlet_client(Map paramsMap) {
		List<Map> list = dao.getAllChartlet_client(paramsMap);
		for (Map m: list) {
			String chartleturl = (String) m.get("chartleturl");
			m.put("chartleturl", url + chartleturl); 
		}
		return list;
	}

}
