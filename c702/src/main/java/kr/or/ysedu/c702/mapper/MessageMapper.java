package kr.or.ysedu.c702.mapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {
    void insertMessage(String title);
}
