package com.java.service;

import com.java.domain.SolrResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuf on 2016/12/16.
 */
public interface SolrService {

    List<SolrResult> findByInd(Integer id);
}
