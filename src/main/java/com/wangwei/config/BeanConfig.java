package com.wangwei.config;

import com.github.tobato.fastdfs.conn.FdfsConnectionPool;
import com.github.tobato.fastdfs.conn.TrackerConnectionManager;
import com.github.tobato.fastdfs.service.DefaultFastFileStorageClient;
import com.github.tobato.fastdfs.service.DefaultTrackerClient;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.github.tobato.fastdfs.service.TrackerClient;
import org.n3r.idworker.Sid;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther wangwei
 * @Date 2018/12/12 10:29 PM
 */
@Configuration
public class BeanConfig {

    @Bean
    public Sid sid(){
        Sid sid = new Sid();

        return sid;
    }


    @Bean
    public FastFileStorageClient fastFileStorageClient(){
        FastFileStorageClient fastFileStorageClient = new DefaultFastFileStorageClient();
        return fastFileStorageClient;
    }


    @Bean
    public TrackerClient trackerClient(){
        TrackerClient trackerClient = new DefaultTrackerClient();
        return trackerClient;
    }


    @Bean
    public TrackerConnectionManager trackerConnectionManager(){
        TrackerConnectionManager trackerConnectionManager = new TrackerConnectionManager();
        return trackerConnectionManager;
    }


    @Bean
    public FdfsConnectionPool fdfsConnectionPool(){
        FdfsConnectionPool fdfsConnectionPool = new FdfsConnectionPool();
        return fdfsConnectionPool;
    }
}
