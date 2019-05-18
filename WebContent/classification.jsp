<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@include file="fragments/header.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>  
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
  <script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>


 <title>library</title>

    
    

</head>
<body>
<div style="width:90%">
<button  type="button" class="btn btn-primary " style="float:right;" data-toggle="modal" data-target="#myModal">Add Classifiaction</button>
</div>
    

<div class="container" >
<div class="row">


<div class="col-xs-9">
<table class="table table-hover" id="classificationtable">
<thead>
<tr>
<th>Classification ID</th>
<th>Classification Name</th>
<th>Delete</th>
<th>Edit</th>
</tr>
</thead>

<tbody>


</tbody>


</table>
</div>
</div>

</div>

</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  
    
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
 
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">New Main Classification</h4>
      </div>
      
      <div class="modal-body">
      <form id="classificationform"  method="post">
      <label for="classificationid">Main Classification ID</label>
  		<input type="text" class="form-control" name="classification_id">
  		
  		<label for="classificationname">Main Classification Name</label>
  		<input type="text" class="form-control" name="classification_name">
  			<input type="submit" value="submit"/>
      </form>
      
      <script src="js/script.js"></script>
      
</body>
</html>