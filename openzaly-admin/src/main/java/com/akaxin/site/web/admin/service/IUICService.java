package com.akaxin.site.web.admin.service;

import java.util.List;

import com.windchat.im.storage.bean.UicBean;

public interface IUICService {

	boolean addUIC(int num, int length);

	List<UicBean> getUsedUicList(int pageNum, int pageSize, int status);

}
