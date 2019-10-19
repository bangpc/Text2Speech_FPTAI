<%-- 
    Document   : t2s
    Created on : Oct 4, 2019, 11:41:42 PM
    Author     : BangPC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>Text to Speech</title>
    <head>
        <jsp:include page="header.jsp"/>
    </head>
    <body>
        <form action="ControlSevlet">
            <div style="background-color: whitesmoke; text-align: center; height:100px ; padding: 8px">
                <h1>Welcome to text to speech application</h1>
            </div>
            <div style="background-color: whitesmoke; text-align:  center">


                <div style="background-color: whitesmoke; text-align: center ">
                    <table border="0" align="center">
                        <tbody>
                            <tr>
                                <td>Nhập văn bản</td><td> <p><textarea name="text" rows="8" cols="35">
                                        </textarea></td>
                                <td>

                                    <table border="0">

                                        <tbody>
                                            <tr>
                                                <td>Chọn giọng</td>
                                                <td align="left"><select name="voice" >
                                                        <option>----------------</option>
                                                        <option value="banmai">Ban Mai</option>
                                                        <option value="leminh">Lê Minh</option>
                                                        <option value="lannhi">Lan Nhi</option>
                                                        <option value="thudung">Thu Dung</option>
                                                        <option value="caochung">Cao Chung</option>
                                                        <option value="hatieumai">Hà Tiểu Mai</option>
                                                    </select></td>
                                            </tr>
                                            <tr>
                                                <td>Tốc độ</td>
                                                <td align="left"><select name="speed">
                                                        <option>-----------------</option>
                                                        <option value="-3">Cực chậm</option>
                                                        <option value="-2">Rất chậm</option>
                                                        <option value="-1">Chậm</option>
                                                        <option value="0">Bình thường</option>
                                                        <option value="1">Nhanh</option>
                                                        <option value="2">Rất nhanh</option>
                                                        <option value="3">Cực nhanh</option>
                                                    </select></td>
                                            </tr>
                                            <tr>
                                                <td>Ngữ điệu</td>
                                                <td align="left"><input type="checkbox" name="prosody" /></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                    <p><input type="submit" name="submit" value="Tạo file âm thanh" />

                                </td>
                            </tr>
                        </tbody>
                    </table>




                </div>

                <table border ="1" align ="center">
                    <th></th>
                    <td>
                        <div style="visibility: visible" >
                            <audio controls autoplay="true">
                                <source src="${link}" width="240" height="120">
                            </audio>
                        </div>
                    <td>

                </table>
            </div>  
        </form>
    </body>
    <jsp:include page="footer.jsp"/>
</html>
