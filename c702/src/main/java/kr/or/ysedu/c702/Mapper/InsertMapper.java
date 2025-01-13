package kr.or.ysedu.c702.Mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InsertMapper {
void insertMapper(
            String name,
            Long count
    ) ;


}
