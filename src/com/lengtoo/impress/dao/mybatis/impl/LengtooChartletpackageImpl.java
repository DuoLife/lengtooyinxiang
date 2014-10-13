/**
* <p>Title: LengtooCharletpackageImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-19
* @version 1.0
*/
package com.lengtoo.impress.dao.mybatis.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lengtoo.impress.dao.ILengtooChartletpackageDao;
import com.lengtoo.impress.dao.po.LengtooChartletpackage;

/**
 * <p>Title: LengtooCharletpackageImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-19
 * Email: vip6ming@126.com
 */
public class LengtooChartletpackageImpl extends SqlSessionDaoSupport implements ILengtooChartletpackageDao{

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooChartletpackageDao#getAllChartletpackage_client(java.util.Map)
	 */
	public List<Map> getAllChartletpackage_client(Map paramsMap) {
		List result = new ArrayList();
		List<LengtooChartletpackage> list = getSqlSession().selectList("LengtooChartletpackage.selectAll", paramsMap);
		for(LengtooChartletpackage c: list) {
			Map m = new HashMap();
			m.put("chartletpackageid", c.getChartletpackageid());
			m.put("title", c.getTitle());
			m.put("description", c.getDescription());
			m.put("chartlettotal", c.getChartlettotal());
			m.put("thumbnaiurl", c.getThumbnailurl());
			m.put("imgwidth", c.getImgwidth());
			m.put("imgheight", c.getImgheight());
			m.put("numberofuse", c.getNumberofuse());
			m.put("authorid", c.getAuthorid());
			Date d = c.getCreatedate();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dStr = sdf.format(d);
			m.put("createdate", dStr);
			m.put("isnew", c.getIsnew());
			result.add(m);
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooChartletpackageDao#updateNumberofuse_client(int)
	 */
	public Map updateNumberofuse_client(int packageid) {
		Map result = new HashMap();
		Map paramsMap = new HashMap();
		paramsMap.put("chartletpackageid", packageid);
		int isOk = getSqlSession().update("LengtooChartletpackage.numberofusePlus", paramsMap);
		result.put("isOk", isOk);
		return result;
	}

}
