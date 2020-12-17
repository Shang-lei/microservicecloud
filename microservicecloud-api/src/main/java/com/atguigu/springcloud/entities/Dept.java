package com.atguigu.springcloud.entities;

import java.io.Serializable;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
 
@SuppressWarnings("serial")  //引入lombok小辣椒编程
@NoArgsConstructor
@Data   //此注解的作用就是包含了get/set
@Accessors(chain=true) //启动链式编程,会自动帮我们修改生成的set方法，从viod类型修改成类名类型
@Getter
@Setter

public class Dept implements Serializable //必须序列化,类表关系映射
{
	
	private Long  deptno;   //主键
	private String  dname;   //部门名称
	private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

	public Dept() {
		
	}
	public Long getDeptno() {
		return deptno;
	}

	public Dept setDeptno(Long deptno) {
		this.deptno = deptno;
		return this;
	}

	public String getDname() {
		return dname;
	}

	public Dept setDname(String dname) {
		this.dname = dname;
		return this;
	}

	public String getDb_source() {
		return db_source;
	}

	public Dept setDb_source(String db_source) {
		this.db_source = db_source;
		return this;
	}

	public Dept(String dname)
	{
		super();
		this.dname=dname;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", db_source=" + db_source + "]";
	}
	

}