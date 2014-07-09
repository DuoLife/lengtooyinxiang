# 登录

## Method
POST

## URL
http://lengtucao.com/lengtucao/login.do

## Parameters  
<table>
	<tr>
		<th>Name</th>
		<th>Value</th>
		<th>Notes</th>
	</tr>
	<tr>
		<td>action</td>
		<td>login</td>
		<td>请求操作，所有请求都有，如果与 操作不符，会返回 ‘msg=0’ 状态码</td>
	</tr>
	<tr>
		<td>email</td>
		<td>test</td>
		<td>最多100位，满足邮箱匹配标准</td>
	</tr>
	<tr>
		<td>password</td>
		<td>test</td>
		<td>6~12个数字或者字母</td>
	</tr>
</table>

## Response
**CASE 1**  

    {
        "is_login":"true",                               //登录成功与否 标志位
        "msg": 1,                                        //此次操作 返回的状态码
        "username":"测试账号",                            //登录用户 账号名
        "token":"5dcee507112340fb872c879c58da82d4",      //用户token
        "email":"test",	                                 //用户email
        "userid":220900,				                 //用户id      
        "dead":"off"					                 //是否已被编辑计入黑名单
    }
    
**CASE 2**

    {
        "is_login":"false",
        "msg":20					//用户不存在.
    }
    
**CASE 3**

    {
        "is_login":"false",
        "msg":21					//邮箱或密码不对.
    }
    
**CASE 4**

    {
        "is_login":"false",
        "msg":23					//你被列入黑名单,请联系我们.
    }