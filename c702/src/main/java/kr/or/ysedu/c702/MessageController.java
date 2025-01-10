package kr.or.ysedu.c702;

import kr.or.ysedu.c702.mapper.MessageMapper;
import kr.or.ysedu.c702.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
    @GetMapping("/message")
    public String message1(){
        return "message";
    }

    @Autowired
    MessageService messageService;
    @GetMapping("/message/{content}")
    @ResponseBody
    public String message(@PathVariable ("content")String myContent){
        messageService.createMessage(myContent);
        return "저장성공: "+ myContent;

    }
}
