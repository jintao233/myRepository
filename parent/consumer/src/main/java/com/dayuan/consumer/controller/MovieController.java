package com.dayuan.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dayuan.entity.Movie;
import com.dayuan.service.MovieService;
import com.dayuan.util.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MovieController {
    private static Logger log = LoggerFactory.getLogger(MovieController.class);

    @Reference
    private MovieService movieService;

    /**
     * 首页返回所有movie信息
     *
     * @return
     */
    @RequestMapping("/listMovies")
    @ResponseBody
    public AjaxResult listMovies() {
        List<Movie> movies = movieService.listMovies();
        log.info("成功调用了productor的listMovies接口");
        return AjaxResult.success(movies);
    }

    /**
     * 详情页面返回选中movie的详情信息
     *
     * @return
     */
    @RequestMapping("/getMovieInfo/{movieId}")
    @ResponseBody
    public AjaxResult movieInfo(@PathVariable("movieId") Integer id) {
        log.info("成功调用了productor的selectMoviesByMovidId接口");
        return AjaxResult.success(movieService.selectMoviesByMovidId(id));
    }

}

