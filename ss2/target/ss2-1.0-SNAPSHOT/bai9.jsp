<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head><title>Game Đoán Chữ</title></head>
<body>
<h2>Game Đoán Chữ</h2>

<h3>Từ bạn đang phải đoán như sau: ${tuDoan}</h3>
<p>Bạn còn: ${soLuot} lượt đoán</p>

<c:choose>
    <c:when test="${ketQua == null}">
        <form method="post" action="Bai9">
            <input type="text" name="tuNguoiChoi" placeholder="Nhập từ bạn đoán" required>
            <button type="submit">Đoán</button>
        </form>
    </c:when>
    <c:when test="${ketQua == 'thua'}">
        <p style="color:purple;">Bạn đã thua sau 3 lần đoán! Từ đúng là: ${tuBiMat}</p>
        <form method="get" action="Bai9"><button>Chơi lại</button></form>
    </c:when>
    <c:when test="${ketQua == 'thang'}">
        <p style="color:blue;">Bạn đã đoán đúng!</p>
        <form method="get" action="Bai9"><button>Chơi lại</button></form>
    </c:when>
</c:choose>

</body>
</html>