package org.toughproxy.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.toughproxy.entity.Config;

import java.util.List;


@Repository
@Mapper
public interface ConfigMapper {

    void insertConfig(Config config);

    void updateConfig(Config config);

    void deleteById(Integer id);

    void deleteConfig(@Param(value = "type") String type, @Param(value = "name") String name);

    Config findConfig(@Param(value = "type") String type, @Param(value = "name") String name);

    List<Config> queryForList(@Param(value = "type") String type);

}