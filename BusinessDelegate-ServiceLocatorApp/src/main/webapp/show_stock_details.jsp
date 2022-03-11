<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>

<c:choose>
    <c:when test="${!empty stockDetails}">
             <table border="1" bgcolor="cyan">
                <tr> 
                   <th>stockId </th> <th>stockName</th><th>company</th> <th>stockValue</th>
                   <th>listedOn</th> <th>VerifiedOn</th><th>nextOneYearValue</th> <th>nextTwoYearValue</th> 
                   <th>nextThreeYearValue</th> <th>changePercentage</th>
                 </tr>
                 <tr>
                   <td>${stockDetails.stockId} </td>
                   <td>${stockDetails.stockName}</td>
                   <td>${stockDetails.company}</td>
                   <td>${stockDetails.stockValue}</td>
                   <td>${stockDetails.listedOn}</td>
                   <td>${stockDetails.verifiedOn} </td>
                   <td>${stockDetails.nextOneYearStockValue}</td>
                   <td>${stockDetails.nextTwoYearsStockValue} </td>
                   <td>${ stockDetails.nextThreeYearsStockValue} </td>
                   <td>${stockDetails.changePercentage}</td>
                 </tr>
             </table>
    </c:when>
    <c:otherwise>
        <h1 style="color:red;text-align:center"> Stock not found </h1>
    </c:otherwise>
</c:choose>
<br><br>
  <h1 style="color:red;text-align:center"><a href="get_stock_details.jsp"> home</a> </h1>
 