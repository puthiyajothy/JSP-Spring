$(function() {
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