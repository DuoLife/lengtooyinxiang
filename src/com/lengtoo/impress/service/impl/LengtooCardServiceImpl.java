/**
* <p>Title: LengtooCardServiceImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-7-2
* @version 1.0
*/
package com.lengtoo.impress.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lengtoo.impress.dao.ILengtooCardDao;
import com.lengtoo.impress.dao.po.LengtooCard;
import com.lengtoo.impress.service.ILengtooCardService;
import com.lengtoo.impress.tools.GetRealIp;

/**
 * <p>Title: LengtooCardServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-7-2
 * Email: vip6ming@126.com
 */
public class LengtooCardServiceImpl implements ILengtooCardService{

	private ILengtooCardDao dao;
	public void setDao(ILengtooCardDao dao) {
		this.dao = dao;
	}

	public List<Map> getAllCardMesg(Map paramsMap) {
		return dao.getAllCardMesg(paramsMap);
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooCardService#getAllCardMesg_Web(java.util.Map)
	 */
	public List<Map> getAllCardMesg_Web(Map paramsMap) {
		return dao.getAllCardMesg_Web(paramsMap);
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooCardService#addLengtooCard(com.lengtoo.impress.dao.po.LengtooCard)
	 */
	public Map addLengtooCard(Map map) {
		LengtooCard card = map2LengtooCard(map);
		
		return dao.addLengtooCard(card);
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooCardService#deleteCard(java.util.Map)
	 */
	public Map deleteCard_web(Map map) {
		return dao.deleteCard_web(map);
	}

	/* (non-Javadoc)
	 * @see com.lengtoo.impress.service.ILengtooCardService#updateCardOnshow_web(java.util.Map)
	 */
	public Map updateCardOnshow_web(Map map) {
		return dao.updateCardOnshow_web(map);
	}

	
	
	//
	public LengtooCard map2LengtooCard(Map map) {
		String WH = (String) map.get("originWH");
		String site = (String) map.get("originsite");
		String imgPath = (String) map.get("imgPath");
		String smallimgPath = (String) map.get("smallimgPath");
		String default_text = (String) map.get("default_text");
		String ip = (String) map.get("ip");
		//map.get("");
		int andOriginWidth = 380;
		int andOriginHeight = 180;
		int originWidth = 380;
		int originHeight = 180;
		if(WH.equals("380-180")) {
			andOriginWidth = 380;
			andOriginHeight = 180;
			originWidth = 380;
			originHeight = 180;
		}
		int andWidth = 500;
		int andHeight = 800;
		int andOriginX = 60;
		int andOriginY = Integer.parseInt(site);
		Date createdate = new Date();;
		
		int width = 500;
		int height = 800;
		int originX = 60;
		int originY = Integer.parseInt(site);
		int smallWidth = 320;
		int smallHeight = 512;
		String bigImgurl = imgPath;
		String smallImgurl = smallimgPath;
		String uploadIp = ip;
		String defaultText = default_text;//"把祝福送给你的小伙伴吧";
		int ontop = 0;
		int onshow = 1;
		
		LengtooCard lengtooCard = new LengtooCard();
		lengtooCard.setAnd_height(andHeight);
		lengtooCard.setAnd_origin_width(andOriginWidth);
		lengtooCard.setAnd_origin_height(andOriginHeight);
		lengtooCard.setAnd_origin_x(andOriginX);
		lengtooCard.setAnd_origin_y(andOriginY);
		lengtooCard.setAnd_width(andWidth);
		lengtooCard.setBig_imgurl(bigImgurl);
		lengtooCard.setCreatedate(createdate);
		lengtooCard.setDefault_text(defaultText);
		lengtooCard.setHeight(height);
		lengtooCard.setOrigin_height(originHeight);
		lengtooCard.setOrigin_width(originWidth);
		lengtooCard.setOrigin_x(originX);
		lengtooCard.setOrigin_y(originY);
		lengtooCard.setSmall_height(smallHeight);
		lengtooCard.setSmall_imgurl(smallImgurl);
		lengtooCard.setSmall_width(smallWidth);
		lengtooCard.setUpload_ip(uploadIp);
		lengtooCard.setWidth(width);
		lengtooCard.setOnshow(onshow);
		lengtooCard.setOntop(ontop);
		return lengtooCard;
	}
}
