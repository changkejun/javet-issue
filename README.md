## 环境

  javet-3.1.8.jar
  
  javet-4.1.1.jar,
  javet-node-windows-x86_64-4.1.1.jar,
  javet-v8-windows-x86_64-4.1.1.jar,
  
## 代码
期待V8ValueGlobalObject里可以放置各种类型的数据。
```js
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.caoccao.javet.interop.V8Host" %>
<%@ page import="com.caoccao.javet.interop.V8Runtime" %>
<%@ page import="com.caoccao.javet.values.reference.V8ValueGlobalObject" %>
<%
		V8Runtime v8Runtime=V8Host.getNodeInstance().createV8Runtime();
		V8ValueGlobalObject g=v8Runtime.getGlobalObject();
		String str="hello world";
		g.set("str",str);
		byte[] bt=str.getBytes();
		g.set("btary",bt);
		g.close();
%>
```
测试字符串时，javet3.1.8和javet4.1.1都正常。
测试byte[]时，javet3.1.8正常，javet4.1.1失败当掉没有log输出。

## 总结
这应该是4.1.1的bug. 期待新版修正之，或提供回避方法。

