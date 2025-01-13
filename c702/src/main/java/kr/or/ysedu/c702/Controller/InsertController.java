package kr.or.ysedu.c702.Controller;

import kr.or.ysedu.c702.Service.InsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InsertController {
@Autowired
    InsertService insertService;

    @GetMapping("insertFruit/{name}/{count}")
    @ResponseBody
    public String insertFruit(@PathVariable("name") String name,@PathVariable("count") Long count){
        insertService.insertService(name,count);

                return "저장성공";

    }
}
