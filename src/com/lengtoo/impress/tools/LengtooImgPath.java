/**
* <p>Title: LengtooImgPath.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-9-12
* @version 1.0
*/
package com.lengtoo.impress.tools;

/**
 * <p>Title: LengtooImgPath.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-9-12
 * Email: vip6ming@126.com
 */
public class LengtooImgPath {

	private static String url = "http://lengtucao.com/lengtooyinxiang";
//	private static String url = "http://192.168.1.110:2103/lengtooyinxiang";
//	private static String url = "http://localhost:2103/lengtooyinxiang";

	private static String uploadBizhiSuccessUrl = "/lengtooyinxiang/admin/allbizhi.html";
	private static String uploadCardSuccessUrl = "/lengtooyinxiang/admin/allcard.html";

	public static String getUrl() {
		return url;
	}
	public static String getUploadBizhiSuccessUrl() {
		return uploadBizhiSuccessUrl;
	}
	public static String getUploadCardSuccessUrl() {
		return uploadCardSuccessUrl;
	}

	public static void setUrl(String urlStr) {
		url = urlStr;
	}
	
	
}
