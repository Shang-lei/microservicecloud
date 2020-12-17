package com.atguigu.springcloud.service;
 
import java.util.List;
 
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.atguigu.springcloud.entities.Dept;
//只针对这个微服务名称进行Feign负载均衡
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class) 

public interface DeptClientService
{
  @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
  public Dept get(@PathVariable("id") long id);
 
  @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
  public List<Dept> list();
 
  @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
  public boolean add(Dept dept);
}
 

