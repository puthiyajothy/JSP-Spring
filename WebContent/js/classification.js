
$(document).ready(function() {
	fetchClassification();
	$("#classificationform").submit(function(event) {
		event.preventDefault();
	console.log($("#classificationform").serialize());
		
		
		$.ajax({
			url :"ClassificationController",
			// contentType : 'application/json',
			type : 'post',
			  data : $('#classificationform').serialize(),
			success : function(data) {
				alert(data);
			//console.log(data);
			}
		});

	});
});
	
	function fetchClassification(){
//		 $("#classificationTable").html("");
		 
		$.ajax({
	       url: 'ClassificationController',
	       type: 'get',
	       success: function(data) {
	        $.each(data.classification,function(key,classificationList){
//	        	console.log(classificationList);
	       	  
	       		  var row=`<tr>
	       			  			<td>${classificationList.classification_id}</td>
	       			  			<td>${classificationList.classification_name}</td>   
	       			  			<td><button class="btn btn-primary">Delete</button></td>   
	       			  			<td><button class="btn btn-danger">Delete</button></td>  			  			
	       			  			</tr>`;
	       		  
	       		  $("#classificationtable tbody").append(row);
	       	  })            	  
	          }
	       	
	      	
	       	
	       	
	       
		  	});
	}


