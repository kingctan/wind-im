package com.windchat.im.web.admin.service;

import java.util.List;

import com.windchat.im.storage.bean.GroupMemberBean;
import com.windchat.im.storage.bean.GroupProfileBean;
import com.windchat.im.storage.bean.SimpleGroupBean;

/**
 * 
 * @author Sam{@link an.guoyue254@gmail.com}
 * @since 2018-04-17 18:46:55
 */
public interface IGroupService {

	GroupProfileBean getGroupProfile(String siteGroupId);

	boolean updateGroupProfile(GroupProfileBean bean);

	List<SimpleGroupBean> getGroupList(int pageNum, int pageSize);

	List<GroupMemberBean> getGroupMembers(String siteGroupId, int pageNum, int pageSize);

	List<GroupMemberBean> getNonGroupMembers(String siteGroupId, int pageNum, int pageSize);

	boolean addGroupMembers(String siteGroupId, List<String> newMemberList);

	boolean removeGroupMembers(String siteGroupId, List<String> groupMemberList);

	boolean dismissGroup(String siteGroupId);

}
