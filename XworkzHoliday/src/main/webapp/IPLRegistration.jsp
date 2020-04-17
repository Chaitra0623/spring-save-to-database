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
      <a class="navbar-brand" href="#">IPL Registration</a>
    </div>
    <ul class="nav navbar-nav"></ul>

  </div>
</nav>


<body>

<div class="container">
  <h2>IPL Team  Registration</h2>
  <form action="onRegister.do" method="post">
    <div class="form-group">
      <label for="Team Name">Team Name:</label>
      <input type="text" class="form-control" id="TeamName" placeholder="Enter Team Name" name="TeamName">
    </div>
    <div class="form-group">
      <label for="Franchice Owner">Franchice Owner:</label>
      <input type="text" class="form-control" id="FranchiceOwner" placeholder="Enter Franchice Owner" name="FranchiceOwner">
    </div>
    <div class="Team Captain">
      <label for="Team Captain">Team Captain:</label>
      <input type="text" class="form-control" id="TeamCaptain" placeholder="Enter Team Captain" name="TeamCaptain">
    </div>
 
  <div class="place">
      <label for="place">place:</label>
      <select class="form-control" name=place>
        <option>BLR</option>
        <option>HYD</option>
        <option>MUM</option>
        <option>DEL</option>
      </select>
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
