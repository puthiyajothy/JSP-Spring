$(document).ready(function() {
	fetchAuthor();
	$("#authorform").submit(function(event) {
		event.preventDefault();
	console.log($("#authorform").serialize());
		
		$.ajax({
			url :"AuthorController",
			type : 'post',
			  data : $('#authorform').serialize(),
			success : function(data) {
				alert(data);
			//console.log(data);
			}
		});

	});
});
	

function fetchAuthor(){
	 
	$.ajax({
       url: 'AuthorController',
       type: 'get',
       success: function(data) {
    	   console.log(data);
        $.each(data.author,function(key,authorList){
//        	console.log(data.authorList);
       	  
       		  var row=`<tr>
       			  			<td>${authorList.author_id}</td>
       			  			<td>${authorList.author_name}</td>   
       			  			<td><button class="btn btn-primary">Delete</button></td>   
       			  			<td><button class="btn btn-danger">Edit</button></td>  			  			
       			  			</tr>`;
       		  
       		  $("#authortable tbody").append(row);
       	  })            	  
          }
    
  	});
}

 	