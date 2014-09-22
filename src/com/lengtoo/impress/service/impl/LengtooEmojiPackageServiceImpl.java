/**
* <p>Title: LengtooEmojiPackageServiceImpl.java</p>
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

import com.lengtoo.impress.dao.ILengtooEmojipackageDao;
import com.lengtoo.impress.service.ILengtooEmojipackageService;
import com.lengtoo.impress.tools.LengtooImgPath;

/**
 * <p>Title: LengtooEmojiPackageServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public class LengtooEmojiPackageServiceImpl implements ILengtooEmojipackageService{

	private ILengtooEmojipackageDao dao;
	public void setDao(ILengtooEmojipackageDao dao) {
		this.dao = dao;
	}
	String url = LengtooImgPath.getUrl();
	public List<Map> getAllEmojipackage_client(Map paramsMap) {
		List<Map> list = dao.getAllEmojipackage_client(paramsMap);
		for (Map m: list) {
			String thumbnaiurl = (String) m.get("thumbnaiurl");
			m.put("thumbnaiurl", url + thumbnaiurl); 
		}
		return list;
	}

}
