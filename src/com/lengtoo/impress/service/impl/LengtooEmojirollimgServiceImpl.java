/**
* <p>Title: LengtooEmojirollimgServiceImpl.java</p>
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

import com.lengtoo.impress.dao.ILengtooEmojirollimgDao;
import com.lengtoo.impress.service.ILengtooEmojirollimgService;
import com.lengtoo.impress.tools.LengtooImgPath;

/**
 * <p>Title: LengtooEmojirollimgServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public class LengtooEmojirollimgServiceImpl implements ILengtooEmojirollimgService{

	private ILengtooEmojirollimgDao dao;
	public void setDao(ILengtooEmojirollimgDao dao) {
		this.dao = dao;
	}
	String url = LengtooImgPath.getUrl();
	public List<Map> getAllRollimg_client() {
		List<Map> list = dao.getAllRollimg_client();
		for (Map m: list) {
			String rollimgurl = (String) m.get("rollimgurl");
			m.put("rollimgurl", url + rollimgurl); 
		}
		return list;
	}

}
