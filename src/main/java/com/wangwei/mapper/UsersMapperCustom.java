package com.wangwei.mapper;

import com.wangwei.pojo.Users;
import com.wangwei.pojo.vo.FriendRequestVO;
import com.wangwei.pojo.vo.MyFriendsVO;
import com.wangwei.utils.MyMapper;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
public interface UsersMapperCustom extends MyMapper<Users> {
	
	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);
	
	public List<MyFriendsVO> queryMyFriends(String userId);
	
	public void batchUpdateMsgSigned(List<String> msgIdList);
	
}