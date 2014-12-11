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

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.lengtoo.impress.dao.ILengtooEmojipackageDao;
import com.lengtoo.impress.dao.po.LengtooEmojipackage;
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
	
	public Map insertEmojipackage_web(Map paramsMap) {
		LengtooEmojipackage emojiPackage = map2EmojiPackage(paramsMap);
		return dao.insertEmojipackage_web(emojiPackage);
	}
	
	/**
	 * @author xuming
	 * 
	 * @param 
	 * 
	 * @return 
	 * 
	 * @date 2014-12-11
	 */
	private LengtooEmojipackage map2EmojiPackage(Map map) {
//		int emojipackageid;
		String thumbnailurl = (String) map.get("thumbnailurl");
		String title = (String) map.get("title");
		String description = (String) map.get("description");
		Date createdate = new Date();//(Date) map.get("createdate");
		int numberofuse = (Integer) map.get("numberofuse");
		int emojitotal = (Integer) map.get("emojitotal");
		int authorid = 1;//(Integer) map.get("authorid");
		int imgwidth = 90;//(Integer) map.get("imgwidth");;
		int imgheight = 90;//(Integer) map.get("imgheight");;
		int isshow = 0;//(Integer) map.get("isshow");
		int istop = 1;// (Integer) map.get("istop");
		int isnew = 1;//(Integer) map.get("isnew");
		
		
		LengtooEmojipackage emojiPackage = new LengtooEmojipackage();
//		emojiPackage.setEmojipackageid(emojipackageid);
		emojiPackage.setTitle(title);
		emojiPackage.setDescription(description);
		emojiPackage.setAuthorid(authorid);
		emojiPackage.setImgheight(imgheight);
		emojiPackage.setImgwidth(imgwidth);
		emojiPackage.setThumbnailurl(thumbnailurl);
		emojiPackage.setEmojitotal(emojitotal);
		emojiPackage.setNumberofuse(numberofuse);
		emojiPackage.setCreatedate(createdate);
		emojiPackage.setIsnew(isnew);
		emojiPackage.setIsshow(isshow);
		emojiPackage.setIstop(istop);
		return emojiPackage;
	}

}
