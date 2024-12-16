<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>X-Workz Course Registration</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <style>
    body {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      min-height: 100vh;
      margin: 0;
      font-family: Arial, sans-serif;
    }
    header {
      width: 100%;
      text-align: center;
      background-color: #f8f9fa;
      box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
      padding: 20px 0;
    }
    h1 {
      color: #007bff;
      font-weight: bold;
      margin: 0;
    }
    .logo-img {
      display: block;
      margin: 0 auto 15px auto;
      border-radius: 5px;
    }
    .nav {
      display: flex;
      justify-content: center;
      margin-top: 15px;
    }
    .nav-item button {
      font-size: 16px;
      margin: 0 10px;
    }
    footer {
      text-align: center;
      margin-top: auto;
    }
  </style>
</head>
<body>
<header>
  <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" width="140" height="70" alt="Xworkz" class="logo-img">
  <h1>X-Workz Course Registration</h1>
  <ul class="nav">
    <li class="nav-item">
      <button class="btn btn-outline-primary rounded-pill px-4 me-2" type="button" onClick="signUp()">Sign Up</button>
    </li>
    <li class="nav-item">
      <button class="btn btn-outline-success rounded-pill px-4" type="button" onClick="login()">Login</button>
    </li>
  </ul>
</header>
<footer class="text-center py-3 mt-4 border-top">
  <p class="mb-0">&copy; 2024 X-Workz. All rights reserved.</p>
</footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-LjzEemzBo4/loq2Gnv9ufHLu2vLF3N9ZfGgb5SzSv8"></script>
<script>
  function signUp(){
    window.location.href = "signup.jsp";
  }
  function login(){
    window.location.href = "login.jsp";
  }
</script>
</body>
</html>
