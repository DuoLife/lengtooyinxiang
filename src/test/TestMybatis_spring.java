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
import com.lengtoo.impress.dao.ILengtooEmojiDao;
import com.lengtoo.impress.dao.ILengtooWallpaperDao;
import com.lengtoo.impress.dao.po.LengtooCard;
import com.lengtoo.impress.dao.po.LengtooWallpaper;

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
	private static ILengtooWallpaperDao wdao;
	private static ILengtooEmojiDao edao;
	
	public static void main(String[] args) {
		int[] aH = {1,1,2,2,1,2,1,1,2,1,1,2,1,1,2,2,1,1,2,1,1,1,2,2,1,1,1,1,2,2,2,1,1,1,1,1,2,1,1,1,1,1,1,2,1,1};
		System.out.println(aH.length);
		update();
//		for(int i=70; i<=74; i++) {
////			String s = i + ".jpg";
////			int y = 0;
////			if(i<10) {
////				s = "0" + i + ".jpg";
////			}
////			if(aH[i-1]==1) {
////				y=50;
////			}else {
////				y=110;
////			}
////			System.out.println(y);
////			addLengtooCard( y, s);  //添加冷兔card信息
////			addLengtooWallpaper(i + ".jpg");
//			try {
//				Thread.sleep(10000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}
	
	public static void addLengtooCard(int y, String imgName) {
		int andWidth = 500;
		int andHeight = 800;
		int andOriginWidth = 380;
		int andOriginHeight = 180;
		int andOriginX = 60;
		int andOriginY = y;
		Date createdate = new Date();;
		
		int width = 500;
		int height = 800;
		int originWidth = 380;
		int originHeight = 180;
		int originX = 60;
		int originY = y;
		int smallWidth = 320;
		int smallHeight = 512;
		String smallImgurl = "/img/card/small_"+imgName;
		String bigImgurl = "/img/card/"+imgName;
		String uploadIp = "127.0.0.1";
		String defaultText = "把祝福送给你的小伙伴吧";
		int ontop = 0;
		int onshow = 1;
		
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
		
		dao.addLengtooCard(lengtooCard);
//		List<Map> l = dao.getAllCardMesg("");
//		for(Map m: l) {
//			System.out.println(m);
//		}
		
	}
	public static void addLengtooWallpaper(String imgName) {
		Date createdate = new Date();
		
		int width = 1440;
		int height = 1280;
		int smallWidth = 320;
		int smallHeight = 284;
		int ontop = 0;
		int onshow = 1;
		String smallImgurl = "/img/bizhi/small_"+imgName;
		String bigImgurl = "/img/bizhi/"+imgName;
		String uploadIp = "127.0.0.1";
		String defaultText = "把祝福送给你的小伙伴吧";
		
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		wdao = (ILengtooWallpaperDao) context.getBean("wallPaperDao");
		
		LengtooWallpaper lengtooWallpaper = new LengtooWallpaper();
		lengtooWallpaper.setBig_imgurl(bigImgurl);
		lengtooWallpaper.setCreatedate(createdate);
		lengtooWallpaper.setDefault_text(defaultText);
		lengtooWallpaper.setHeight(height);
		lengtooWallpaper.setSmall_height(smallHeight);
		lengtooWallpaper.setSmall_imgurl(smallImgurl);
		lengtooWallpaper.setSmall_width(smallWidth);
		lengtooWallpaper.setUpload_ip(uploadIp);
		lengtooWallpaper.setWidth(width);
		lengtooWallpaper.setOnshow(onshow);
		lengtooWallpaper.setOntop(ontop);
		
		wdao.addLengtooWallpaper(lengtooWallpaper);
	}
	public static void update() {
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		edao = (ILengtooEmojiDao) context.getBean("emojiDao");
		
		edao.updateNumberofuse_client(1);
	}
}
