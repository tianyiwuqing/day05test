<%--
  Created by IntelliJ IDEA.
  User: 天意无情
  Date: 2018/12/5
  Time: 0:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>index.jsp</title>
    <script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" >
        function myclick() {
            // console.log($("#number"));
            var attr = $("#number").attr("value");
            console.log(attr)
            $.ajax({
                type:"get",
                url:"servlet/getInfo",
                data:{
                    "number":attr
                },
                datatype:'json',
                success:function (returnData) {
                    $("#box_table").find("tr").remove();
                    console.log(returnData)
                    var option="<tr><td>"+returnData.number+"</td><td>"+returnData.area+"</td><td>"+returnData.postcode+"</td><td>"+returnData.areacode+"</td><td>"+returnData.type+"</td></tr>"
                    $("#box_table").append(option);
                },
                error:function () {
                    console.log("eeror")
                }

            })

        }
    </script>
</head>
<body>

<form action="getInfo" method="get">
    <input id="number" type="text" name="number">
    <input onclick="javascript:myclick()" type="button" value="查询">
</form>

<div id="box" >
    <table id="box_table" style="" >
        <tr><td></td></tr>
    </table>
</div>
</body>
</html>
