/**
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-6-27
* @version 1.0
*/
package test;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lengtoo.impress.dao.ILengtooCardDao;
import com.lengtoo.impress.dao.po.LengtooCard;

/**
 * <p>Title: TestMybatis_spring.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-6-27
 * Email: vip6ming@126.com
 */
public class TestMybatis_spring {

	private static String path = "applicationContext.xml";
	private static ILengtooCardDao dao;
	
	public static void main(String[] args) {
		
		int andWidth = 500;
		int andHeight = 800;
		int andOriginWidth = 380;
		int andOriginHeight = 180;
		int andOriginX = 60;
		int andOriginY = 540;
		Date createdate = new Date();;
		
		int width = 500;
		int height = 800;
		int originWidth = 380;
		int originHeight = 180;
		int originX = 60;
		int originY = 540;
		int smallWidth = 320;
		int smallHeight = 512;
		String smallImgurl = "/img/small_08.png";
		String bigImgurl = "/img/08.png";
		String uploadIp = "127.0.0.1";
		String defaultTest = "把祝福送给你的小伙伴吧";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		dao = (ILengtooCardDao) context.getBean("cardDao");
		
		LengtooCard lengtooCard = new LengtooCard();
		lengtooCard.setAnd_height(andHeight);
		lengtooCard.setAnd_origin_width(andOriginWidth);
		lengtooCard.setAnd_origin_height(andOriginHeight);
		lengtooCard.setAnd_origin_x(andOriginX);
		lengtooCard.setAnd_origin_y(andOriginY);
		lengtooCard.setAnd_width(andWidth);
		lengtooCard.setBig_imgurl(bigImgurl);
		lengtooCard.setCreatedate(createdate);
		lengtooCard.setDefault_test(defaultTest);
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
		
		dao.addLengtooCard(lengtooCard);
//		List<Map> l = dao.getAllCardMesg("");
//		for(Map m: l) {
//			System.out.println(m);
//		}
	}
}
