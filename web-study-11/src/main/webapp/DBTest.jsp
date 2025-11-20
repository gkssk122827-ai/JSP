<%@page import="util.DBMenager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	Connection con = DBMenager.getConnection();

	out.println("con: " + con);
%>