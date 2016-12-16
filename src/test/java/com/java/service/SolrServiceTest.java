package com.java.service;

import com.java.domain.SolrResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by liuf on 2016/12/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/application.xml"})
public class SolrServiceTest {
    @Resource
    private SolrService solrService;

    @Test
    public void findByInd() throws Exception {
        List<SolrResult> list=solrService.findByInd(1);
        System.out.println(list);
    }

}