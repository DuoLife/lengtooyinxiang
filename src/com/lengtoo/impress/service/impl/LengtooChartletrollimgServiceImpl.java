/**
* <p>Title: LengtooChartletrollimgServiceImpl.java</p>
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

import com.lengtoo.impress.dao.ILengtooChartletrollimgDao;
import com.lengtoo.impress.service.ILengtooChartletrollimgService;
import com.lengtoo.impress.tools.LengtooImgPath;

/**
 * <p>Title: LengtooChartletrollimgServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public class LengtooChartletrollimgServiceImpl implements ILengtooChartletrollimgService{

	private ILengtooChartletrollimgDao dao;
	public void setDao(ILengtooChartletrollimgDao dao) {
		this.dao = dao;
	}
	String url = LengtooImgPath.getUrl();
	public List<Map> getAllChartletpackage_client(Map paramsMap) {
		List<Map> list = dao.getAllRollimg_client();
		for (Map m: list) {
			String rollimgurl = (String) m.get("rollimgurl");
			m.put("rollimgurl", url + rollimgurl); 
		}
		return list;
	}

}
