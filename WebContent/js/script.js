
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
//	
//	$(document).on("click",".deleteaction",function(){
//		var id=$(this).attr("data-id");
//		$.ajax({
//			url:'ClassificationController',
//			type:'post',
//			data:{action:'delete',id:id},
//			success:function(data){
//				console.log(id);
//				fetchClassification();
//			}
//		});
//	});

});


$(document).on("click",".deleteaction",function(){
	var id=$(this).attr("data-id");
	console.log(id);
	$.ajax({
		url :"ClassificationController",
		type:"post",
		data:{action:'delete',id:id},
		success:function(data){
			console.log(id);
			fetchClassification();
		}
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
	       			  			<td><button class="deleteaction" data-id='${classificationList.classification_id}'>Delete</button></td>   
	       			  			<td><button class="btn btn-danger">Edit</button></td>  			  			
	       			  			</tr>`;
	       		  
	       		  $("#classificationtable tbody").append(row);
	       	  })            	  
	          }
	       	
	      	
	       	
	       	
	       
		});
	}


	
	

	
	
/**
 * 
 */