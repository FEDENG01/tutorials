package com.baeldung.web.controller;

import java.util.HashMap;
import java.util.Map;

import com.baeldung.model.Invoice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.baeldung.model.Employee;

@Controller
public class InvoiceController {

    @RequestMapping(value = "/invoice", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("invoiceHome", "invoice", new Invoice());
    }


    @RequestMapping(value = "/addInvoice", method = RequestMethod.POST)
    public String submit(@ModelAttribute("invoice") final Invoice invoice, final BindingResult result, final ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }

        // Calcular la cantidad después de la retención
        double cantidadDespuesRetencion = invoice.getCantidad() - (invoice.getCantidad() * (invoice.getPorcentajeRetencion() / 100.0));

        model.addAttribute("Concepto", invoice.getConcepto());
        model.addAttribute("Cantidad", invoice.getCantidad());
        model.addAttribute("PorcentajeRetencion", invoice.getPorcentajeRetencion());
        model.addAttribute("CantidadDespuesRetencion", cantidadDespuesRetencion);


        //employeeMap.put(employee.getId(), employee);

        return "invoiceView";
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception ex) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", ex.getMessage());
        return modelAndView;
    }



}
