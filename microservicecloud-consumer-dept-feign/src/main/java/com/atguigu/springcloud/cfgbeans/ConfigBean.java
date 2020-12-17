package com.atguigu.springcloud.cfgbeans;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@Configuration
public class ConfigBean
{
    @Bean
    @LoadBalanced  //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端负载均衡的工具
    //一个@LoadBalanced注解，就能让这个RestTemplate在请求时拥有客户端负载均衡的能力
    public RestTemplate getRestTemplate()
    {
         return new RestTemplate();
    }
     
    /*@Bean
    public IRule myRule() 
    {
    	return new RoundRobinRule();//轮询
    	//return new RandomRule();//重新定义方法，选择用随机算法代替默认的轮询。
    }*/
}


