package com.yxm.dao;

import com.yxm.vo.Game;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface GameDao {
    //    index游戏模块
    List<Game> getBuy();

    List<Game> getHot();

    List<Game> getNew();

    List<Game> getNewGame_admin();
    //    底部导航分类
    List<Game> getType1game();

    List<Game> getType2game();

    List<Game> getType3game();

    List<Game> getType4game();

    Game getGame(Game game);

    List<Game> getGames(Game game);

    int deleteGame(Game game);

    int insert(@Param("pojo") Game pojo);

    int insertSelective(@Param("pojo") Game pojo);

    int insertList(@Param("pojos") List<Game> pojo);

    int update(@Param("pojo") Game pojo);

    int updatePoster(@Param("pojo") Game pojo);

    int getPictureNum(Game game);


    void updatePoster(String src, Integer id);
}

