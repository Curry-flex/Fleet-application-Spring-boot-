
$('document').ready(function(){
	
	//country script
	$('table #editButton').on('click',function(event){
		
		event.preventDefault();
		
		var href = $(this).attr('href');
		
		$.get(href,function(country,status)
		{  
			$('#editID').val(country.id);
			$('#editcapital').val(country.capital);
			$('#editcode').val(country.code);
			$('#editcontinent').val(country.continent);
			$('#editdesc').val(country.description);
			$('#editnationality').val(country.nationality);
			
			$('#createdByC').val(country.createdBy);
			$('#createdDateC').val(country.createdDate);
		});
		$('#EditModal').modal();
	});
	
	$('table #deleteButton').on('click' ,function(event){
		event.preventDefault();
		var href =$(this).attr('href')
		$('#confirmDelete').attr('href',href)
		$('#deleteModal').modal();
	});
	
	//view country
	
	$('table #viewCountry').on('click',function(event){
		
		event.preventDefault();
		
		var href = $(this).attr('href');
		
		$.get(href,function(country,status)
		{  
				$('#VeditID').val(country.id);
				$('#Veditcapital').val(country.capital);
				$('#Veditcode').val(country.code);
				$('#Veditcontinent').val(country.continent);
				$('#Veditdesc').val(country.description);
				$('#Veditnationality').val(country.nationality);
				 $('#createdBy').val(country.createdBy);
				$('#createdDate').val(country.createdDate);
				$('#lastModifiedDate').val(country.lastModifiedDate);
				$('#lastModifiedBy').val(country.lastModifiedBy);
		
		});
		$('#viewModal').modal();
	});
	
	
	
 //State script
	
	$('table #editState').on('click',function(event){
			event.preventDefault();
			
			var href = $(this).attr('href')
			$.get(href,function(state,status){
				$('#id').val(state.id);
				$('#name').val(state.name);
				$('#capital').val(state.capital);
				$('#code').val(state.code);
				$('#description').val(state.details);
				$('#countryID').val(state.country_id);
				$('#createdByEdit').val(state.createdBy);
	           $('#createdDateEdit').val(state.createdDate);

			})
		$('#editModal').modal();
	});
	
	$('table #deleteState').on('click', function(){
		event.preventDefault();
		
		var href =$(this).attr('href')
		$('#confirmDeleteState').attr('href',href)
		$('#deleteModal').modal();
	})
	
	
	//view state
	
	$('table #viewState').on('click',function(event){
			event.preventDefault();
			
			var href = $(this).attr('href')
			$.get(href,function(state,status){
				$('#vid').val(state.id);
				$('#vname').val(state.name);
				$('#vcapital').val(state.capital);
				$('#vcode').val(state.code);
				$('#vdescription').val(state.details);
				$('#vcountryID').val(state.country_id);
				 $('#createdBy').val(state.createdBy);
				$('#createdDate').val(state.createdDate);
				$('#lastModifiedDate').val(state.lastModifiedDate);
				$('#lastModifiedBy').val(state.lastModifiedBy);
			})
		$('#viewModal').modal();
	});

//location script

  $('table #editLocation').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(location,statuss){
		$('#id').val(location.id);
		$('#names').val(location.name);
		$('#addressess').val(location.address);
		$('#countries').val(location.country);
		$('#states').val(location.state);
		$('#clocation').val(location.country_id);
		$('#slocation').val(location.state_id);
		
		$('#createdByEdit').val(location.createdBy);
		$('#createdDateEdit').val(location.createdDate);
	})
	$('#editModal').modal()
})	

$('table #deleteLocation').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteLocation').attr('href',href)
	$('#deleteModal').modal()
})


//view location
 $('table #viewLocation').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(location,statuss){
		$('#id').val(location.id);
		$('#lnames').val(location.name);
		$('#laddressess').val(location.address);
		$('#lcountries').val(location.country);
		$('#lstates').val(location.state);
		$('#lclocation').val(location.country_id);
		$('#lslocation').val(location.state_id);
		 $('#createdBy').val(location.createdBy);
		$('#createdDate').val(location.createdDate);
		$('#lastModifiedDate').val(location.lastModifiedDate);
		$('#lastModifiedBy').val(location.lastModifiedBy);
	})
	$('#viewModal').modal()
})	


	
//vehicleType script


	
//vehicle Make Script

$('table #editvehicleMake').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(vehicleMake,statuss){
		$('#vehicleID').val(vehicleMake.id);
		$('#vehicledesc').val(vehicleMake.descrption);
		$('#vehicleDetails').val(vehicleMake.details);
		$('#createdByEdit').val(vehicleMake.createdBy);
		$('#createdDateEdit').val(vehicleMake.createdDate);

	})
	$('#editModal').modal()
})	

$('table #deletevehicleMake').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeletevehicleMake').attr('href',href)
	$('#deleteModal').modal()
})

//View vehicle Make audit



$('table #viewvehicleMake').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(vehicleMake,statuss){
	
		$('#veiwdesc').val(vehicleMake.descrption);
		$('#viewDetails').val(vehicleMake.details);
		$('#createdBy').val(vehicleMake.createdBy);
		$('#createdDate').val(vehicleMake.createdDate);
		$('#lastModifiedDate').val(vehicleMake.lastModifiedDate);
		$('#lastModifiedBy').val(vehicleMake.lastModifiedBy);

	})
	$('#viewModal').modal()
})	


//Vehicle Type

$('table #editvehicleType').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(vehicleType,statuss){
		$('#vehicleID').val(vehicleType.id);
		$('#vehicledesc').val(vehicleType.descrption);
		$('#vehicleDetails').val(vehicleType.details);
		$('#createdByEdit').val(vehicleType.createdBy);
		$('#createdDateEdit').val(vehicleType.createdDate);
		

	})
	$('#editModal').modal()
})	

$(' table #deletevehicleType').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeletevehicleType').attr('href',href)
	$('#deleteModal').modal()
})

//view vehicle type

$('table #viewvehicleType').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(vehicleType,statuss){
	
		$('#veiwdesc').val(vehicleType.descrption);
		$('#viewDetails').val(vehicleType.details);
		$('#createdBy').val(vehicleType.createdBy);
		$('#createdDate').val(vehicleType.createdDate);
		$('#lastModifiedDate').val(vehicleType.lastModifiedDate);
		$('#lastModifiedBy').val(vehicleType.lastModifiedBy);

	})
	$('#viewModal').modal()
})

//vehicle model script

$('table #editvehicleModel').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(model,statuss){
		$('#vehicleID').val(model.id);
		$('#vehicledesc').val(model.descrption);
		$('#vehicleDetails').val(model.details);
		$('#createdByEdit').val(model.createdBy);
		$('#createdDateEdit').val(model.createdDate);

	})
	$('#editModal').modal()
})	

$('table #deletevehicleModel').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeletevehicleModel').attr('href',href)
	$('#deleteModal').modal()
})

//view model script
$('table #viewvehicleModel').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(vehicleMake,statuss){
	
		$('#veiwdesc').val(vehicleMake.descrption);
		$('#viewDetails').val(vehicleMake.details);
		$('#createdBy').val(vehicleMake.createdBy);
		$('#createdDate').val(vehicleMake.createdDate);
		$('#lastModifiedDate').val(vehicleMake.lastModifiedDate);
		$('#lastModifiedBy').val(vehicleMake.lastModifiedBy);

	})
	$('#viewModal').modal()
})	

		

//client script	


$('table #editClient').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(client,statuss){
		$('#editID').val(client.id);
		$('#editname').val(client.name);
	    $('#editcity').val(client.city);
        $('#editemail').val(client.email);
		$('#editphone').val(client.phone);
        $('#editaddress').val(client.address);
		$('#editwebsite').val(client.website);
		$('#stateID').val(client.state_id);
		$('#countryID').val(client.country_id);
		$('#createdByEdit').val(client.createdBy);
	

	    $('#createdDateEdit').val(client.createdDate);
		

	})
	$('#editModal').modal()
})	

$('table #deleteClient').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteClient').attr('href',href)
	$('#deleteModal').modal()
})


//view client

$('table #viewClient').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(client,statuss){
		$('#veditID').val(client.id);
		$('#veditname').val(client.name);
	    $('#veditcity').val(client.city);
        $('#veditemail').val(client.email);
		$('#veditphone').val(client.phone);
        $('#veditaddress').val(client.address);
		$('#veditwebsite').val(client.website);
		$('#vstateID').val(client.state_id);
		$('#vcountryID').val(client.country_id);
		 $('#createdBy').val(client.createdBy);
		$('#createdDate').val(client.createdDate);
		$('#lastModifiedDate').val(client.lastModifiedDate);
		$('#lastModifiedBy').val(client.lastModifiedBy);
		

	})
	$('#viewModal').modal()
})	


//invoice status script

$('table #editinvoiceStatus').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(invoiceStatus,statuss){
		$('#invoiceStatusID').val(invoiceStatus.id);
		$('#invoiceStatus').val(invoiceStatus.status);
		$('#invoiceDesc').val(invoiceStatus.description);
		$('#createdByEdit').val(invoiceStatus.createdBy);
	    $('#createdDateEdit').val(invoiceStatus.createdDate);

	})
	$('#editModal').modal()
})	

$('table #deleteinvoiceStatus').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteinvoiceStatus').attr('href',href)
	$('#deleteModal').modal()
})

// view  invoice status s

$('table #viewinvoiceStatus').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(invoiceStatus,statuss){
		$('#invoiceStatusID').val(invoiceStatus.id);
		$('#vinvoiceStatus').val(invoiceStatus.status);
		$('#vinvoiceDesc').val(invoiceStatus.description);
		 $('#createdBy').val(invoiceStatus.createdBy);
		$('#createdDate').val(invoiceStatus.createdDate);
		$('#lastModifiedDate').val(invoiceStatus.lastModifiedDate);
		$('#lastModifiedBy').val(invoiceStatus.lastModifiedBy);

	})
	$('#viewModal').modal()
})	

//invoice script

$('table #editinvoice').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(invoice,status){
		$('#invoiceid').val(invoice.id);
		$('#invoicedate').val(invoice.invoiceDate);
		$('#invoiceclient').val(invoice.client);
		$('#invoicestatus').val(invoice.invoiceStatus);
		$('#invoiceclient').val(invoice.client_id);
		$('#ivoiceStatusID').val(invoice. invoiceStatus_id)
		$('#seto').val(invoice.remark);
		$('#createdByEdit').val(invoice.createdBy);
	    $('#createdDateEdit').val(invoice.createdDate);

	})
	$('#editModal').modal()
})	

$('table #deleteinvoice').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteinvoice').attr('href',href)
	$('#deleteModal').modal()
})

//view invoice

$('table #viewinvoice').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(invoice,status){
		$('#vinvoiceid').val(invoice.id);
		$('#vinvoicedate').val(invoice.invoiceDate);
		$('#vinvoiceclient').val(invoice.client);
		$('#vinvoicestatus').val(invoice.invoiceStatus);
		$('#vinvoiceclient').val(invoice.client_id);
		$('#vivoiceStatusID').val(invoice. invoiceStatus_id)
		$('#vseto').val(invoice.remark);
		$('#createdBy').val(invoice.createdBy);
		$('#createdDate').val(invoice.createdDate);
		$('#lastModifiedDate').val(invoice.lastModifiedDate);
		$('#lastModifiedBy').val(invoice.lastModifiedBy);


	})
	$('#viewModal').modal()
})	


//Supplier script

$('table #editsupplier').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(client,statuss){
		$('#editID').val(client.id);
		$('#editname').val(client.name);
	    $('#editcity').val(client.city);
        $('#editemail').val(client.email);
		$('#editphone').val(client.phone);
        $('#editaddress').val(client.address);
		$('#editwebsite').val(client.website);
		$('#stateID').val(client.state_id);
		$('#countryID').val(client.country_id);
		

	  $('#createdByEdit').val(client.createdBy);
	

	  $('#createdDateEdit').val(client.createdDate);
		

	})
	$('#editModal').modal()
})	

$('table #deletesupplier').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteSupplier').attr('href',href)
	$('#deleteModal').modal()
})



//view supplier

$('table #viewsupplier').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(client,statuss){
		$('#veditID').val(client.id);
		$('#veditname').val(client.name);
	    $('#veditcity').val(client.city);
        $('#veditemail').val(client.email);
		$('#veditphone').val(client.phone);
        $('#veditaddress').val(client.address);
		$('#veditwebsite').val(client.website);
		$('#vstateID').val(client.state_id);
		$('#vcountryID').val(client.country_id);
		$('#createdBy').val(client.createdBy);
		$('#createdDate').val(client.createdDate);
		$('#lastModifiedDate').val(client.lastModifiedDate);
		$('#lastModifiedBy').val(client.lastModifiedBy);
		

	})
	$('#viewModal').modal()
})	
	
	
//contact script

$('table #editcontact').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(contact,statuss){
		$('#cID').val(contact.id);
		$('#fname').val(contact.firstname);
	    $('#lname').val(contact.lastname);
        $('#cphone').val(contact.phone);
		$('#cemail').val(contact.email);
        $('#cmobile').val(contact.mobile);
         
	$('#createdByEdit').val(contact.createdBy);
	

	$('#createdDateEdit').val(contact.createdDate);
	
		

	})
	$('#editModal').modal()
})	

$('table #deletecontact').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteContact').attr('href',href)
	$('#deleteModal').modal()
})
	

//contact view
$('table #viewcontact').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(contact,statuss){
		$('#vcID').val(contact.id);
		$('#vfname').val(contact.firstname);
	    $('#vlname').val(contact.lastname);
        $('#vcphone').val(contact.phone);
		$('#vcemail').val(contact.email);
        $('#vcmobile').val(contact.mobile);
         $('#createdBy').val(contact.createdBy);
		$('#createdDate').val(contact.createdDate);
		$('#lastModifiedDate').val(contact.lastModifiedDate);
		$('#lastModifiedBy').val(contact.lastModifiedBy);
	
		

	})
	$('#viewModal').modal()
})		
	
	
	//Maintanance script
	
	$('table #editmaintanance').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(maintanance,statuss){
		$('#mID').val(maintanance.id);
		$('#vm').val(maintanance.vehicle_id);
		$('#ms').val(maintanance.startDate);
		$('#me').val(maintanance.endDate);
		$('#mp').val(maintanance.price);
		$('#msa').val(maintanance.supplier_id);
		$('#mr').val(maintanance.remarks);
		$('#createdByEdit').val(maintanance.createdBy);
	

     	$('#createdDateEdit').val(maintanance.createdDate);
	
	
		

	})
	$('#editModal').modal()
})	

$('table #deletemaintanance').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteMaintanance').attr('href',href)
	$('#deleteModal').modal()
})

//view maintanance

	$('table #viewMaintanance').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(maintanance,statuss){
		$('#mID').val(maintanance.id);
		$('#vvm').val(maintanance.vehicle_id);
		$('v#ms').val(maintanance.startDate);
		$('#vme').val(maintanance.endDate);
		$('#vmp').val(maintanance.price);
		$('#vmsa').val(maintanance.supplier_id);
		$('#vmr').val(maintanance.remarks);
		$('#createdBy').val(maintanance.createdBy);
		$('#createdDate').val(maintanance.createdDate);
		$('#lastModifiedDate').val(maintanance.lastModifiedDate);
		$('#lastModifiedBy').val(maintanance.lastModifiedBy);
	
	
		

	})
	$('#viewModal').modal()
})
		

//Movement script	


	
	$('table #editmovement').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(movement,statuss){
		$('#vmID').val(movement.id);
		$('#vmm').val(movement.vehicle_id);
		$('#loc1').val(movement.location1_id);
		$('#ddate').val(movement.date1);
		$('#loc2').val(movement.location2_id);
		$('#adate').val(movement.date2);
		$('#rema').val(movement.remarks);
		$('#createdByEdit').val(movement.createdBy);
	   $('#createdDateEdit').val(movement.createdDate);
	
	
	
		

	})
	$('#editModal').modal()
})	

$('table #deletemovement').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteMovement').attr('href',href)
	$('#deleteModal').modal()
})


//view vehicle Movement


	$('table #viewmovement').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(movement,statuss){
		$('#vmID').val(movement.id);
		$('#vvmm').val(movement.vehicle_id);
		$('#vloc1').val(movement.location1_id);
		$('#vddate').val(movement.date1);
		$('#vloc2').val(movement.location2_id);
		$('#vadate').val(movement.date2);
		$('#vrema').val(movement.remarks);
		$('#createdByV').val(movement.createdBy);
		$('#createdDateV').val(movement.createdDate);
		$('#lastModifiedDate').val(movement.lastModifiedDate);
		$('#lastModifiedBy').val(movement.lastModifiedBy);
	
	
	
		

	})
	$('#viewModal').modal()
})	

//Hire script

	
	$('table #edithire').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(hire,statuss){
		
		$('#hID').val(hire.id);
		$('#vh').val(hire.vehicle_id);
		$('#dout').val(hire.dateOut);
		$('#din').val(hire.dateIn);
		$('#hID').val(hire.id);
		$('#cname').val(hire.client_id);
		$('#clocation').val(hire.location_id);
		$('#hprice').val(hire.price);
		$('#rema').val(hire.remarks);
		
	  $('#createdByEditV').val(hire.createdBy);
	

	  $('#createdDateEditV').val(hire.createdDate);
		
	})
	$('#editModal').modal()
})	



//view hire


	$('table #viewhire').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(hire,statuss){
		
		$('#hID').val(hire.id);
		$('#vvh').val(hire.vehicle_id);
		$('#vdout').val(hire.dateOut);
		$('#vdin').val(hire.dateIn);
		$('#vhID').val(hire.id);
		$('#vcname').val(hire.client_id);
		$('#vclocation').val(hire.location_id);
		$('#vhprice').val(hire.price);
		$('#vrema').val(hire.remarks);
		$('#createdBy').val(hire.createdBy);
		$('#createdDate').val(hire.createdDate);
		$('#lastModifiedDate').val(hire.lastModifiedDate);
		$('#lastModifiedBy').val(hire.lastModifiedBy);
		
	})
	
		$('#vieHireModal').modal()
	
})	







//vehicle Script

	
	$('table #editvehicle').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(vehicle,statuss){
		
		$('#vID').val(vehicle.id);
		$('#vname').val(vehicle.name);
		$('#vtype').val(vehicle.vehicleType_id);
		$('#vnumber').val(vehicle.vehicleNumber);
		$('#vregDate').val(vehicle.registrationDate);
		$('#vacDate').val(vehicle.acquisitionDate);
		$('#vemployee').val(vehicle.employee_id);
		$('#vmake').val(vehicle.vehicleMake_id);
		$('#vmodel').val(vehicle.vehicleModel_id);
		$('#vacDate').val(vehicle.acquisitionDate);
		$('#vlocation').val(vehicle.location_id);
		$('#vcapacity').val(vehicle.fuelCapacity);
		$('#vweight').val(vehicle.netWeight);
		$('#vafile').val(vehicle.file);
		

	   $('#createdByEdit').val(vehicle.createdBy);
	

	   $('#createdDateEdit').val(vehicle.createdDate);

		
		
	})
	$('#editModal').modal()
})	


//view vehicle

	
	$('table #viewvehicle').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(vehicle,statuss){
		
		$('#vID').val(vehicle.id);
		$('#vvname').val(vehicle.name);
		$('#vvtype').val(vehicle.vehicleType_id);
		$('#vvnumber').val(vehicle.vehicleNumber);
		$('#vvregDate').val(vehicle.registrationDate);
		$('#vvacDate').val(vehicle.acquisitionDate);
		$('#vvemployee').val(vehicle.employee_id);
		$('#vvmake').val(vehicle.vehicleMake_id);
		$('#vvmodel').val(vehicle.vehicleModel_id);
		$('#vvacDate').val(vehicle.acquisitionDate);
		$('#vvlocation').val(vehicle.location_id);
		$('#vvcapacity').val(vehicle.fuelCapacity);
		$('#vvweight').val(vehicle.netWeight);
		$('#vafile').val(vehicle.file);
		$('#createdBy').val(vehicle.createdBy);
		$('#createdDate').val(vehicle.createdDate);
		$('#lastModifiedDate').val(vehicle.lastModifiedDate);
		$('#lastModifiedBy').val(vehicle.lastModifiedBy);
		
		
	})
	$('#viewModal').modal()
})

$('table #deletevehicle').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteVehicle').attr('href',href)
	$('#deleteModal').modal()
})
	

//Employee script



	$('table #editemployee').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(employee,statuss){
		
		$('#veID').val(employee.id);
		$('#vephoto').val(employee.photo);
		$('#vefname').val(employee.firstname);
		$('#velname').val(employee.lastname);
		$('#vegender').val(employee.gender);
		$('#vedate').val(employee.hireDate);
		$('#veemail').val(employee.email);
		$('#vephone').val(employee.phone);
		$('#vecountry').val(employee.country_id);
		$('#vestate').val(employee.state_id);
		
	$('#createdByEditE').val(employee.createdBy);
	

	$('#createdDateEditE').val(employee.createdDate);
	
		
		
	})
	$('#editModal').modal()
})	

$('table #deleteemployee').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteEmployee').attr('href',href)
	$('#deleteModal').modal()
})


$('table #empphoto').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$(' #photoModal #employeephoto').attr('src',href)
	$('#photoModal').modal()
})

var pass1 = document.getElementById("pass1");
var pass2 = document.getElementById("pass2");

	function validatePassword(){
		if(pass1.value != pass2.value){
			alert("incorrect password")
		}
	}
	
	
	
	
	
	//employee view
	
	$('table #viewemployee').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(employee,statuss){
		
		$('#vveID').val(employee.id);
		$('#vvephoto').val(employee.photo);
		$('#vvefname').val(employee.firstname);
		$('#vvelname').val(employee.lastname);
		$('#vvegender').val(employee.gender);
		$('#vvedate').val(employee.hireDate);
		$('#empemail').val(employee.email);
		$('#empphone').val(employee.phone);
		$('#vvecountry').val(employee.country_id);
		$('#vvestate').val(employee.state_id);
		
        $('#createdByEditEmp').val(employee.createdBy);
		$('#createdDateEditEmp').val(employee.createdDate);
		$('#lastModifiedDate').val(employee.lastModifiedDate);
		$('#lastModifiedBy').val(employee.lastModifiedBy);

	
		
		
	})
	$('#viewModal').modal()
})	
	
	
	
	
	
	
	//Role Script

$('table #editrole').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(role,statuss){
		$('#role1').val(role.id);
		$('#role2').val(role.descrption);
		$('#role3').val(role.details);
	    $('#createdByEdit').val(role.createdBy);
	

	    $('#createdDateEdit').val(role.createdDate);


	})
	$('#editModal').modal()
})	

$('table #deleterole').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleterole').attr('href',href)
	$('#deleteModal').modal()
})

//View vehicle Make audit



$('table #viewrole').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(role,statuss){
	
		$('#veiwdesc').val(role.descrption);
		$('#viewDetails').val(role.details);
		$('#createdBy').val(role.createdBy);
		$('#createdDate').val(role.createdDate);
		$('#lastModifiedDate').val(role.lastModifiedDate);
		$('#lastModifiedBy').val(role.lastModifiedBy);

	})
	$('#viewModal').modal()
})	

	
	
	
	
	

//user script


$('table #edituser').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(user,statuss){
		$('#eid').val(user.id);
		$('#fname').val(user.firstname);
		$('#lname').val(user.lastname);
		$('#user').val(user.username);
		$('#pass').val(user.password);
	  $('#createdByEdit').val(user.createdBy);
	

	 $('#createdDateEdit').val(user.createdDate);
		

	})
	$('#editModal').modal()
})	

$('table #deleteuser').on('click' ,function(event){
	event.preventDefault()
	var href = $(this).attr('href')
	
	$('#confirmDeleteUser').attr('href',href)
	$('#deleteModal').modal()
})

//View vehicle Make audit



$('table #viewuser').on('click',function(event){
	
	
	event.preventDefault()
	var href = $(this).attr('href')
	
	$.get(href,function(user,statuss){
	
		$('#vfname').val(user.firstname);
		$('#vlname').val(user.lastname);
		$('#vuser').val(user.username);
		$('#createdBy').val(user.createdBy);
		$('#createdDate').val(user.createdDate);
		$('#lastModifiedDate').val(user.lastModifiedDate);
		$('#lastModifiedBy').val(user.lastModifiedBy);

	})
	$('#viewModal').modal()
})	

	
	
		
	
	
	
	
			
});