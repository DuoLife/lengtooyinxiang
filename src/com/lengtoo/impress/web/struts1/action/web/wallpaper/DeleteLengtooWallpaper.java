/**
* <p>Title: DeleteLengtooWallpaper.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2014</p>
* <p>Company: ColdWorks</p>
* @author xuming
* @date 2014-8-29
* @version 1.0
*/
package com.lengtoo.impress.web.struts1.action.web.wallpaper;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.lengtoo.impress.returndata.ReturnData;
import com.lengtoo.impress.service.ILengtooWallpaperService;

/**
 * <p>Title: DeleteLengtooWallpaper.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: ColdWorks</p>
 * @author xuming
 * @date 2014-8-29
 * Email: vip6ming@126.com
 */
public class DeleteLengtooWallpaper extends Action{

	private ILengtooWallpaperService service;
	public void setService(ILengtooWallpaperService service) {
		this.service = service;
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Map result = new HashMap();
		Map paramsMap = new HashMap();
		boolean success = false;
		int msg = 0;
		int wallpaperid;
		try {
			wallpaperid = Integer.parseInt(request.getParameter("wallpaperid"));
		} catch (Exception e) {
			wallpaperid = 0;
		}
		paramsMap.put("wallpaperid", wallpaperid);
		try {
			Map m =  service.deleteWallpaper_web(paramsMap);
			success = (Integer)m.get("isOk") == 1? true:false;
			msg = (Integer)m.get("isOk");
		} catch (Exception e) {
			msg = 2;
		}
		ReturnData.returnData(response, result, success, msg);
		return null;
	}
}
