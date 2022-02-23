$('document').ready(function(event){
	
	
	$('table #deletehire').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteHire').attr('href',href)
	$('#tryModal').modal()
})

})