<%--
  Created by IntelliJ IDEA.
  User: adi11
  Date: 2018/9/27
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome</title>
  </head>
  <body>
    <div align="center">
  <h3>Login</h3>
  <hr>
  <form action="/LoginServlet" method="post">
    <table>

      <tr>
        <td>
          User Name
        </td>
        <td>
          <input type="text" name="username">
        </td>
      </tr>

      <tr>
        <td>
          Password
        </td>
        <td>
          <input type="password" name="password">
        </td>
      </tr>

      <tr>
        <td><input type="submit" name="upload" value="Upload"></td>
      </tr>

    </table>
  </form>
</div>
  </body>
</html>
