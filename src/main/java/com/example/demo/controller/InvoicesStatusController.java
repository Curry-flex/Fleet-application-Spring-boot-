package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.invoiceStatus;
import com.example.demo.model.vehicleMake;
import com.example.demo.service.InvoiceStatusService;


@Controller
public class InvoicesStatusController {
	

	@Autowired
	private InvoiceStatusService statusService;
;
	
	@GetMapping("/invoices-status")
	
	String getInvoiceStatusList(Model model) {
		
		List<invoiceStatus> invoicestatus =statusService.getAllInvoiceStatus() ;
		
		
		model.addAttribute("invoicestatus", invoicestatus);
		
		return "Invoices-status-values";
	}
	
	@PostMapping("/invoiceStatus/addinvoiceStatus")
	
	public String addInvoiceStatus(invoiceStatus status) {
		
		statusService.addinvoiceStatus(status);
		
		
		return "redirect:/invoices-status";
	}
	
	@RequestMapping("/invoiceStatus/edit/")
	@ResponseBody
	public invoiceStatus getInvoiceID(int id) {
		
		return statusService.getSInvoiceStatusID(id);
	}
	
	@RequestMapping(value="/invoiceStatus/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (invoiceStatus status) {
		
		statusService.addinvoiceStatus(status);
		
		return "redirect:/invoices-status";
	}
	
	@RequestMapping(value="/invoiceStatus/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteInvoiceStatus(int id) {
		
		statusService.delete(id);
		
		return "redirect:/invoices-status";
	}
	
	
	
	
//	
//	@GetMapping("/invoices-status")
//	
//	String getVehicleData() {
//		return "Invoices-status-values";
//	}

}
