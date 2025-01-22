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