package com.zhaoyh.elasticdemo.service;

import com.zhaoyh.elasticdemo.model.City;

import java.util.List;

/**
 * Created by zhaoyh on 2017/11/9.
 * @author zhaoyh
 */
public interface CityService {

    /**
     * 新增城市信息
     *
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 根据关键词，function score query 权重分页查询
     * @param pageNumber
     * @param pageSize
     * @param searchContent
     * @return
     */
    List<City> searchCity(Integer pageNumber, Integer pageSize, String searchContent);
}
