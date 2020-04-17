<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="footer">
  <p>Footer</p>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Xworkz  Holiday Registration Form</a>
    </div>
    <ul class="nav navbar-nav"></ul>

  </div>
</nav>
${HolidayMessage }

<body>

<div class="container">
  <h2>Holiday Registration </h2>
  <form action="addHoliday.do"  method="post">
    <div class="form-group">
      <label for="holidayDate">holidayDate:</label>
      <input type="text" class="form-control" id="holidayDate" placeholder="Enter holidayDate" name="holidayDate">
    </div>
    <div class="form-group">
      <label for=" holidayType">holidayType :</label>
      <input type="text " class="form-control" id="holidayType" placeholder="Enter holidayType" name="holidayType">
    </div>
    <div class="form-group ">
      <label for="paid">paid:</label>
      <div class="radio">
      <label><input type="radio" name="paid" value="yes" checked>yes</label>
    </div>
    <div class="radio">
      <label><input type="radio" name="paid" value="no" >no</label>
    </div>
    </div>
 
  <div class="NumOfDays">
      <label for="NumOfDays">NumOfDays:</label>
      <input type="text" class="form-control" id="NumOfDays" placeholder="Enter NumOfDays" name="numOfDays">
       </div> 
	
    <button type="submit" class="btn btn-default" value="submit">Submit</button>
  </form>
</div>

</body>

<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color:black;
   color: white;
   text-align: center;
}
</style>


</body>
</html>
