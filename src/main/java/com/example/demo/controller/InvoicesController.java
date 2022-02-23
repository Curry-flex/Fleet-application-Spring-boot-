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

import com.example.demo.model.Client;
import com.example.demo.model.Invoice;
import com.example.demo.model.invoiceStatus;

import com.example.demo.service.InvoiceStatusService;
import com.example.demo.service.clientService;
import com.example.demo.service.invoiceService;

@Controller
public class InvoicesController {
	

	@Autowired
	private invoiceService Invoiceservice;
	
	@Autowired
	private InvoiceStatusService statusService;
	
	@Autowired
	private clientService Clientservice;

	@GetMapping("/invoices")
	
	String getInvoiceList(Model model) {
		
		List<Invoice> invoices =Invoiceservice.getAllInvoice() ;
		List<invoiceStatus> invoiceStatus =statusService.getAllInvoiceStatus() ;
		List<Client> client =Clientservice.getAllClient() ;
		
		
		model.addAttribute("invoice", invoices);
		model.addAttribute("invoicestatus", invoiceStatus);
		model.addAttribute("client", client);
		
		return "Invoices";
	}
	

	
     @PostMapping("/invoice/addinvoice")
	
	public String addInvoice(Invoice invoice) {
		
		Invoiceservice.Addinvoice(invoice);
		
		return "redirect:/invoices";
	}
	
	@RequestMapping("/invoice/edit/")
	@ResponseBody
	public Invoice  getInvoiceByID(int id) {
		
		
		return Invoiceservice.getInvoiceByID(id);
	}

	@RequestMapping(value="/invoice/update", method= {RequestMethod.PUT ,RequestMethod.GET})
	
	String update (Invoice invoice) {
		
		Invoiceservice.Addinvoice(invoice);
		
	return "redirect:/invoices";
	}
	
	@RequestMapping(value="/invoice/delete", method= {RequestMethod.DELETE ,RequestMethod.GET})
	
	String deleteInvoice(int id) {		
		Invoiceservice.deleteInvoice(id);
		
		return "redirect:/invoices";
	}
	
	
	
	


}
