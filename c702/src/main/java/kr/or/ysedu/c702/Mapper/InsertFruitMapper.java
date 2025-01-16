package kr.or.ysedu.c702.Mapper;

import kr.or.ysedu.c702.Fruit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InsertFruitMapper {

    void insertFruit(Fruit fruit);
}
