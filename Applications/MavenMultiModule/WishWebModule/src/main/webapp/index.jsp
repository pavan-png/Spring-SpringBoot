<%@ page import="in.Honeybadger.service.WishMessageService" %>
<h1 style='color:red; text-align: service'>
<%= new WishMessageService().wishMsg ("pavan") %>
</h1>