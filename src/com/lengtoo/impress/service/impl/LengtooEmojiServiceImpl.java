/**
* <p>Title: LengtooEmojiServiceImpl.java</p>
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

import com.lengtoo.impress.dao.ILengtooEmojiDao;
import com.lengtoo.impress.service.ILengtooEmojiService;
import com.lengtoo.impress.tools.LengtooImgPath;

/**
 * <p>Title: LengtooEmojiServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-22
 * Email: vip6ming@126.com
 */
public class LengtooEmojiServiceImpl implements ILengtooEmojiService{

	private ILengtooEmojiDao dao;
	public void setDao(ILengtooEmojiDao dao) {
		this.dao = dao;
	}

	String url = LengtooImgPath.getUrl();
	public List<Map> getAllEmoji_client(Map paramsMap) {
		List<Map> list = dao.getAllEmoji_client(paramsMap);
		for (Map m: list) {
			String emojiurl = (String) m.get("emojiurl");
			m.put("emojiurl", url + emojiurl); 
		}
		return list;
	}
	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooEmojiService#updateNumberofuse_client(int)
	 */
	public Map updateNumberofuse_client(int emojiid) {
		return dao.updateNumberofuse_client(emojiid);
	}

}
