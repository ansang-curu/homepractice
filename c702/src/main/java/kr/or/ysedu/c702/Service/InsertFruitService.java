package kr.or.ysedu.c702.Service;

import kr.or.ysedu.c702.Fruit;
import kr.or.ysedu.c702.Mapper.InsertFruitMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertFruitService {
    @Autowired
     InsertFruitMapper insertFruitMapper;

    public void getFruit(Fruit f){
     insertFruitMapper.insertFruit(f);
    };

}
