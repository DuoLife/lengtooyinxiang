/**
* <p>Title: LengtooChartletIllustration.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-22
* @version 1.0
*/
package com.lengtoo.impress.dao.mybatis.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.lengtoo.impress.dao.ILengtooChartletIllustrationDao;
import com.lengtoo.impress.dao.po.LengtooChartletIllustration;

/**
 * <p>Title: LengtooChartletIllustration.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public class LengtooChartletIllustrationImpl extends SqlSessionDaoSupport implements ILengtooChartletIllustrationDao{

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.dao.ILengtooChartletIllustration#getAllRollimg_client(java.util.Map)
	 */
	public List<Map> getIllustrationByPackageId_client(Map paramsMap) {
		List<Map> result = new ArrayList();
		List<LengtooChartletIllustration> list = getSqlSession().selectList("LengtooChartletIllustration.selectAll", paramsMap);
		for(LengtooChartletIllustration e: list) {
			Map m = new HashMap();
			m.put("illustrationid", e.getIllustrationid());
			m.put("illustrationurl", e.getIllustrationurl());
			m.put("illustrationwidth", e.getIllustrationwidth());
			m.put("illustrationheight", e.getIllustrationheight());
//			m.put("", e.getDescription());
//			m.put("", e.get);
			result.add(m);
		}
		return result;
	}
}
