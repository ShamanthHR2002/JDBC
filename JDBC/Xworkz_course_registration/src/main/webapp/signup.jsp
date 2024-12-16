<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .form-container {
          border: 1px solid #ddd; /* Light border */
          border-radius: 10px; /* Rounded corners */
          box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); /* Subtle shadow for shading */
          padding: 20px; /* Space inside the form */
          background-color: #f9f9f9; /* Light background color */
          max-width: 500px; /* Limit form width */
          margin: 20px auto; /* Center form on the page */
        }
    </style>
</head>
<body>
<div class="form-container">
    <h3 class="text-center mb-4">Register</h3>
    <form action = "getData" method = "post">
        <div class="mb-3">
            <label for="name" class="form-label">Name</label>
            <input type="text" class="form-control" id="name" name = "name" value = "Name" placeholder="Enter your name">
        </div>
        <div class="mb-3">
            <label for="age" class="form-label">Age</label>
            <input type="number" class="form-control" id="age" name = "age" placeholder="Enter your age">
            <p>${Age}</p>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input type="email" class="form-control" id="email" name = "email" placeholder="Enter your email">
            <p>${email}</p>
        </div>
        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password" name = "password" placeholder="Enter your password">
            <p>${password}</p>
        </div>
        <div class="mb-3">
            <label for="confirmPassword" class="form-label">Confirm Password</label>
            <input type="password" class="form-control" id="confirmPassword" name = "confirmPassword" placeholder="Confirm your password">
        </div>
        <div class="mb-3">
            <label for="phno" class="form-label">Phone Number</label>
            <input type="tel" class="form-control" id="phno" name = "phno" placeholder="Enter your phone number">
            <p>${phno}</p>
        </div>
        <div class="text-center">
            <button type="submit" class="btn btn-primary" onclick = "submit">Register</button>
        </div>
    </form>
</div>
</body>
</html>