<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100">
    <div class="container mx-auto mt-10">
        <div class="flex justify-center">
            <div class="w-full max-w-md">
                <div class="bg-white p-8 rounded-lg shadow-lg">
                    <h2 class="text-center text-2xl font-semibold mb-6">Login</h2>
                    <form action="getNameByEmailAndPassword" method="post">
                        <div class="mb-4">
                            <label for="email" class="block text-sm font-medium text-gray-700">Email</label>
                            <input type="email" class="w-full px-4 py-2 border border-gray-300 rounded-md" id="email" name="email" required>
                        </div>
                        <div class="mb-6">
                            <label for="password" class="block text-sm font-medium text-gray-700">Password</label>
                            <input type="password" class="w-full px-4 py-2 border border-gray-300 rounded-md" id="password" name="password" required>
                        </div>
                        <div class="mb-4">
                            <input type="submit" class="w-full py-2 bg-blue-500 text-white font-semibold rounded-md hover:bg-blue-600 cursor-pointer" value="Login">
                        </div>
                    </form>

                    <p class="mt-3 text-center text-red-500">${message}</p>

                    <c:if test="${not empty user}">
                        <!-- Display the "Name" button -->
                        <button id="showDetailsButton" class="w-full py-2 bg-gray-300 text-black rounded-md hover:bg-gray-400 mt-3">${user.name}</button>

                        <div id="userDetails" style="display:none;" class="mt-4">
                            <table class="w-full table-auto border-collapse">
                                <thead>
                                    <tr>
                                        <th class="px-4 py-2 border-b">Name</th>
                                        <th class="px-4 py-2 border-b">Age</th>
                                        <th class="px-4 py-2 border-b">Email</th>
                                        <th class="px-4 py-2 border-b">Phone Number</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td class="px-4 py-2 border-b">${user.name}</td>
                                        <td class="px-4 py-2 border-b">${user.age}</td>
                                        <td class="px-4 py-2 border-b">${user.email}</td>
                                        <td class="px-4 py-2 border-b">${user.phonenumber}</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </c:if>
                </div>
            </div>
        </div>
    </div>

    <script>
        document.getElementById('showDetailsButton').onclick = function() {
            var userDetailsDiv = document.getElementById('userDetails');
            if (userDetailsDiv.style.display === "none") {
                userDetailsDiv.style.display = "block";
            } else {
                userDetailsDiv.style.display = "none";
            }
        };
    </script>
</body>
</html>
