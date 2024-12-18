
<%@ page isELIgnored = "false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SignUp</title>
    <!-- Bootstrap CSS CDN -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #e9ecef;
            padding: 20px;
        }
        .form-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-container h2 {
            margin-bottom: 20px;
            text-align: center;
        }
        .form-container .btn {
            display: block;
            width: 100%;
            margin-top: 20px;
     }
    </style>
</head>
<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="form-container">
                <h2>Sign Up</h2>
                <form action="signup" method="post">
                    <div class="form-group">
                        <label for="name">Name</label>
                        <input type="text" class="form-control" id="name" name="name" placeholder="Enter name" onblur="validData(event)">
                        <span id="nameValid"></span>
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" id="email" name="email" placeholder="Enter email" onblur="validData(event)">
                        <span id="emailvalid"></span>
                    </div>
                    <div class="form-group">
                        <label for="phoneNo">Phone Number</label>
                        <input type="text" class="form-control" id="phoneNo" name="phoneNo" placeholder="Enter phone number" onblur="validData(event)">
                        <span id="phonevalid"></span>
                    </div>
                    <div class="form-group">
                        <label for="altEmail">Alternate Email</label>
                        <input type="email" class="form-control" id="altEmail" name="altEmail" placeholder="Enter alternate email"  onblur="validData(event)">
                        <span id="altEmailvalid"></span>
                    </div>
                    <div class="form-group">
                        <label for="altPhoneNo">Alternate Phone Number</label>
                        <input type="text" class="form-control" id="altPhoneNo" name="altPhoneNo" placeholder="Enter alternate phone number" onblur="validData(event)">
                        <span id="altPhonevalid"></span>
                    </div>
                    <div class="form-group">
                        <label for="location">Location</label>
                        <input type="text" class="form-control" id="location" name="location" placeholder="Enter location">

                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </div>
    </div>
</div>
<script>
const validData=(event)=>{
    const {name,value}=event.target;
    if(name==="name" && value.length>=2){
        console.log("valid name");
      document.getElementById("nameValid").innerHTML="<span></span>"
    }
    else if(name==="name" && value.length<2){
    console.log("name not valid");
    document.getElementById("nameValid").innerHTML="<span style='color:red'}> name invalid</span>"
    }

    if(name==="email" && value.includes("@gmail.com")){
        console.log("valid email");
        document.getElementById("emailvalid").innerHTML="<span}></span>"
    }
    else if(name==="email" && !value.includes("@gmail.com")){
    console.log("email not valid");
    document.getElementById("emailvalid").innerHTML="<span style='color:red'}> Email invalid</span>"
    }

    if(name==="phoneNo" && value.length==10){
        console.log("phoneNo valid");
        document.getElementById("phonevalid").innerHTML="<span}></span>"
    }
    else if(name==="phoneNo" && value.length!=10){
    console.log("phoneNo invalid");
    document.getElementById("phonevalid").innerHTML="<span style='color:red'}> Phone Number invalid</span>"
    }

    if(name==="altEmail" && value.includes("@gmail.com")){
        console.log("altvalid email");
        document.getElementById("altEmailvalid").innerHTML="<span}></span>"
    }
    else if(name==="altEmail" && !value.includes("@gmail.com")){
    console.log("altemail not valid");
    document.getElementById("altEmailvalid").innerHTML="<span style='color:red'}> Email invalid</span>"
    }

    if(name==="altPhoneNo" && value.length==10){
        console.log("altphoneNo valid");
        document.getElementById("altPhonevalid").innerHTML="<span}></span>"
    }
    else if(name==="altPhoneNo" && value.length!=10){
    console.log("altphoneNo invalid");
    document.getElementById("altPhonevalid").innerHTML="<span style='color:red'}> Phone Number invalid</span>"
    }
}
</script>


<!-- Bootstrap JS and dependencies (optional but recommended) -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
</body>
</html>
