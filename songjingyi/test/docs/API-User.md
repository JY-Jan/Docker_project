## 创建用户


**URL**: 

请求类型: POST
请求路径: http://127.0.0.1:12345/user/addUser

**功能描述**: 

:暂无


**前置条件**: 

暂无


**请求格式**: 

```
{
	"user":{
		"habits":"java.lang.String",
		"name":"java.lang.String",
		"id":"int",
		"pwd":"java.lang.String",
		"age":"int"
	}
}
```

**正确返回**: 

```
{
	"code":20000
}
```


## 根据name查询用户


**URL**: 

请求类型: POST/GET
请求路径: http://127.0.0.1:12345/user/getUser

**功能描述**: 

:暂无


**前置条件**: 

暂无


**请求格式**: 

```
{
	"name":"java.lang.String"
}
```

**正确返回**: 

```
{
	"code":20000,
	"data":{
		"habits":"java.lang.String",
		"name":"java.lang.String",
		"id":"java.lang.String",
		"pwd":"java.lang.String",
		"age":"java.lang.String"
	}
}
```


