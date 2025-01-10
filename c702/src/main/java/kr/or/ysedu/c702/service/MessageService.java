package kr.or.ysedu.c702.service;

import kr.or.ysedu.c702.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    MessageMapper messageMapper;
    public void createMessage(String title){
//       비즈니스 로직 업무
        String newTitle=title+"-new";
//        디비에 저장
        messageMapper.insertMessage(newTitle);



    }

}
