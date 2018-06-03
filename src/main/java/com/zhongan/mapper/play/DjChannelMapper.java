package com.zhongan.mapper.play;

import com.zhongan.model.play.DjChannel;
import com.zhongan.model.play.DjChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjChannelMapper {
    long countByExample(DjChannelExample example);

    int deleteByExample(DjChannelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DjChannel record);

    int insertSelective(DjChannel record);

    List<DjChannel> selectByExample(DjChannelExample example);

    DjChannel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DjChannel record, @Param("example") DjChannelExample example);

    int updateByExample(@Param("record") DjChannel record, @Param("example") DjChannelExample example);

    int updateByPrimaryKeySelective(DjChannel record);

    int updateByPrimaryKey(DjChannel record);
}