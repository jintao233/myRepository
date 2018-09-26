package com.dayuan.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dayuan.entity.Movie;
import com.dayuan.provider.mapper.MovieMapper;
import com.dayuan.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.annotation.Resource;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private static Logger log = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Resource
    private MovieMapper movieMapper;

    @Override
    public List<Movie> listMovies() {
        log.info("有消费者调用了listMovies接口");
        return movieMapper.listMovies();

    }
    @Override
    public Movie selectMoviesByMovidId(Integer id) {
        log.info("selectMoviesByMovidId");
        return movieMapper.selectByPrimaryKey(id);
    }
}

