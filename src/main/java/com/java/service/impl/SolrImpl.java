package com.java.service.impl;

import com.java.domain.SolrResult;
import com.java.service.SolrService;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * Created by liuf on 2016/12/16.
 */
@Service
public class SolrImpl implements SolrService{
    @Resource
    private SolrTemplate solrTemplate;


    @Override
    public List<SolrResult> findByInd(Integer id) {

        SolrClient solrServer = solrTemplate.getSolrClient();

        //创建查询条件
        SolrQuery query = new SolrQuery();
        query.setQuery("id:" + id);

        //查询并返回结果
        QueryResponse queryResponse = null;
        try {
            queryResponse = solrServer.query(query);
        }catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  queryResponse.getBeans(SolrResult.class);
    }
}
