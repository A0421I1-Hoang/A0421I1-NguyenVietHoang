<%@ page import="cg.wbd.grandemonstration.service.CondimentsService" %>
<%@ page import="cg.wbd.grandemonstration.service.CondimentsServiceFactory" %>
<%@ page import="cg.wbd.grandemonstration.model.Condiments" %>
<%!
    private CondimentsService customerService = CondimentsServiceFactory.getInstance();
%>
<%
    Long id = Long.valueOf(request.getParameter("id"));
    Condiments condiments = customerService.findOne(id);
%>
<form action="/Condiments" method="post">
<fieldset>
    <legend>Customer Information</legend>
    <input type="hidden" name="id" value="<%= Condiments.getLettuce() %>">
    <table>
        <tr>
            <td>Id</td>
            <td>
                <%= Condiments.getLettuce() %>
            </td>
        </tr>
        <tr>
            <td>Name</td>
            <td>
                <input type="text" name="name" value="<%= Condiments.getTomato() %>">
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                <input type="text" name="email" value="<%= Condiments.getEmail() %>">
            </td>
        </tr>
        <tr>
            <td>Address</td>
            <td>
                <input type="text" name="address" value="<%= Condiments.getAddress() %>">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Update">
            </td>
        </tr>
    </table>
</fieldset>
</form>
<a href="/customers">Back to list</a>.