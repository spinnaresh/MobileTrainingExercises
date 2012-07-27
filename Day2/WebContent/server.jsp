<%

String name = request.getParameter("name");
name = name.toUpperCase();
//JSON {"output":"naresh"}
String json = "{\"output\":\"" + name +"\"}";
out.println(json);
%> 