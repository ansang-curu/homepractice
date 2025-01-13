package kr.or.ysedu.c702.Service;

import kr.or.ysedu.c702.Mapper.InsertMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertService {
    @Autowired
    InsertMapper insertMapper;
    public void insertService(String name, Long count){

        if(count>=10){
            System.out.println("10이상이다");
            name = name+"대량";
        }
//        String myName=name;
//        Long myCount=count;
        insertMapper.insertMapper(name,count);
    }
}
