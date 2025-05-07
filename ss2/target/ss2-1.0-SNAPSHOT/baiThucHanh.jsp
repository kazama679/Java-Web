<!DOCTYPE html>
<html lang="vi">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Đăng ký tài khoản</title>
</head>
<body>
<h2>Đăng ký tài khoản</h2>
<form action="RegisterAccountServlet" method="post">
  <label for="username">Tên đăng nhập:</label>
  <input type="text" id="username" name="username" required><br><br>

  <label for="password">Mật khẩu:</label>
  <input type="password" id="password" name="password" required><br><br>

  <label for="fullName">Họ tên:</label>
  <input type="text" id="fullName" name="fullName" required><br><br>

  <label for="age">Tuổi:</label>
  <input type="number" id="age" name="age"><br><br>

  <label for="address">Địa chỉ:</label>
  <input type="text" id="address" name="address"><br><br>

  <input type="submit" value="Đăng ký">
</form>
</body>
</html>