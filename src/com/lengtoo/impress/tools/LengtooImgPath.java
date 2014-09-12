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
	//http://localhost:2103/lengtooyinxiang
	static int i = 0;
	static int j = 0;

	public static String getUrl() {
		System.out.println("get" + i++);
		return url;
	}

	public static void setUrl(String urlStr) {
		System.out.println("set" + j++);
		url = urlStr;
	}
	
	
}
