<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%
Map<String,String> map = new HashMap<String,String>();
map.put("India", "{'cities':['Chennai','Mumbai']}" );
map.put("USA", "{'cities':['Newyork','California']}" );
map.put("UK", "{'cities':['London','Italy']}" );

String countryName = request.getParameter("countryName");
out.println(map.get(countryName));
%>
