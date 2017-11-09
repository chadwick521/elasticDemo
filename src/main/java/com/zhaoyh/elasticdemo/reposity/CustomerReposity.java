package com.zhaoyh.elasticdemo.reposity;

import com.zhaoyh.elasticdemo.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by zhaoyh on 2017/11/9.
 * @author zhaoyh
 */
public interface CustomerReposity extends ElasticsearchRepository<Customer, String> {

    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);
}
