package kr.or.ysedu.c702.Controller;

import kr.or.ysedu.c702.Fruit;
import kr.or.ysedu.c702.Mapper.InsertFruitMapper;
import kr.or.ysedu.c702.Service.InsertFruitService;
import kr.or.ysedu.c702.Service.InsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class InsertController {

    @Autowired
    InsertService insertService;

    @Autowired
    InsertFruitService insertFruitService;

    @GetMapping("insertFruit/{name}/{count}")
    @ResponseBody
    public String insertFruit(@PathVariable("name") String name,@PathVariable("count") Long count){
        insertService.insertService(name,count);

                return "저장성공";

    }

    @PostMapping("/create")
    @ResponseBody
    public createFruit(@RequestBody Fruit fruit){
        insertFruitService.getFruit(fruit);
    }




}
