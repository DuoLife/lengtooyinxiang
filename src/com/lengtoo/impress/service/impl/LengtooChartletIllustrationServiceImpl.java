/**
* <p>Title: LengtooChartletIllustrationServiceImpl.java</p>
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

import com.lengtoo.impress.dao.ILengtooChartletIllustrationDao;
import com.lengtoo.impress.service.ILengtooChartletillustrationService;
import com.lengtoo.impress.tools.LengtooImgPath;

/**
 * <p>Title: LengtooChartletIllustrationServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public class LengtooChartletIllustrationServiceImpl implements ILengtooChartletillustrationService{

	private ILengtooChartletIllustrationDao dao;
	public void setDao(ILengtooChartletIllustrationDao dao) {
		this.dao = dao;
	}
	String url = LengtooImgPath.getUrl();
	public List<Map> getIllustrationByPackageId_client(Map paramsMap) {
		List<Map> list = dao.getIllustrationByPackageId_client(paramsMap);
		for (Map m: list) {
			String illustrationurl = (String) m.get("illustrationurl");
			m.put("illustrationurl", url + illustrationurl); 
		}
		return list;
	}

}
