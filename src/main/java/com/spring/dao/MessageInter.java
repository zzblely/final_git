package com.spring.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring.dto.MessageDTO;

public interface MessageInter {


	//user 보낸 리스트
	ArrayList<MessageDTO> messageList(HashMap<String, Object> map);
	//user 받은 리스트
	ArrayList<MessageDTO> GmessageList(HashMap<String, Object> map);
	
	int listCnt(HashMap<String, Object> map);

	int messagewrite(MessageDTO dto);//쪽지 작성 
	
	MessageDTO UmessageDetail(String message_no);
	
	int messagedetail(String message_no);

	int messageCount(String id);


}
