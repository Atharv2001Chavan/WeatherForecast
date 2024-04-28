<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Weather Forecast</title>

<style type="text/css">
body
        {
            background: lightblue;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }

        #weather-container
        {
            background-color: rgba(255, 255, 255, 0.3);
            min-width: 400px;
            
            padding: 20px;
            border-radius: 15px;
            box-shadow: 0 8px 32px rgba(0, 0, 0, 0.1);
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.1);
            text-align: center;
        }
        h2
        {
            color: blue;
            margin: 8px 0;
        }
        h3
        {
         margin: 8px 0;
        }

        input
        {
            width: 300px;
            padding: 8px;
            box-sizing: border-box;
            border-radius: 10px;
            border: 1px solid white;
            margin-top: 20px;
        }
        button
        {
            background: #ace5ff;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 10px;
            cursor: pointer;
            margin-top: 20px;
            width: 200px;
            font-size: 15px;
        }
        
</style>
</head>
<body>
		<div id="weather-container">
        <h2>Weather Forecast</h2>
        <h3>For Summary :</h3>
        <form action="/weather/summary">
        <input type="text" name="city" placeholder="ex. India"><br>
        <button>Get Summary</button></form><br>
        <h3>For Hourly :</h3>
        <form action="/weather/hourly">
        <input type="text" name="city1" placeholder="ex. India"><br>	
       	<button>Get Hourly Data</button></form>

    </div>
</body>
</html>