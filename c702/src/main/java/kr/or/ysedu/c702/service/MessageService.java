package kr.or.ysedu.c702.service;

import kr.or.ysedu.c702.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    MessageMapper messageMapper;

    public void createMessage(String content){
        String newContent=content+"-new";
        messageMapper.insertMessage(newContent);
    }
}
