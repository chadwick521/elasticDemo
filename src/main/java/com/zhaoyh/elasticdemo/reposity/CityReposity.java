package com.zhaoyh.elasticdemo.reposity;

import com.zhaoyh.elasticdemo.model.City;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by zhaoyh on 2017/11/9.
 * @author zhaoyh
 */
@Repository
public interface CityReposity extends ElasticsearchRepository<City, Long> {

}
