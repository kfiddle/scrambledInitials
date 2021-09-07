package com.example.demo.controllers;


import com.example.demo.models.*;
//import com.example.demo.repositories.EventRepository;
import com.example.demo.repositories.PayeeRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController
public class RestPayee {

    @Resource
    PayeeRepository payeeRepo;


    @RequestMapping("/get-payees")
    public Collection<Payee> getAllPayees() {
        List<Payee> payeesToSend = new ArrayList<>();
        for (Payee payee : payeeRepo.findAll()) {
            payeesToSend.add(payee);
        }
        Collections.sort(payeesToSend);
        return payeesToSend;
    }

    @PostMapping("/add-payee")
    public Collection<Payee> addPayeeToDatabase(@RequestBody Payee incomingPayee) throws IOException {

        try {

            if (payeeRepo.existsByFirstName(incomingPayee.getFirstName()) && payeeRepo.existsByLastName(incomingPayee.getLastName())) {
                return (Collection<Payee>) payeeRepo.findAll();
            } else if (incomingPayee.getId() == null) {
                Payee payeeToAdd = new Payee(incomingPayee.getFirstName(), incomingPayee.getLastName());

                if (incomingPayee.getEmail() != null) {
                    payeeToAdd.setEmail(incomingPayee.getEmail());
                }

                if (incomingPayee.getPhoneNumber() != null) {
                    payeeToAdd.setPhoneNumber(incomingPayee.getPhoneNumber());
                }

                if (incomingPayee.getAddress() != null) {
                    payeeToAdd.setAddress(incomingPayee.getAddress());
                }

                if (incomingPayee.getW9ed()) {
                    payeeToAdd.setW9ed(true);
                }

                payeeRepo.save(payeeToAdd);
            } else if (payeeRepo.findById(incomingPayee.getId()).isPresent()) {
                Payee payeeToEdit = payeeRepo.findById(incomingPayee.getId()).get();

                if (incomingPayee.getFirstName() != null) {
                    payeeToEdit.setFirstName(incomingPayee.getFirstName());
                }

                if (incomingPayee.getLastName() != null) {
                    payeeToEdit.setLastName(incomingPayee.getLastName());
                }

                if (incomingPayee.getEmail() != null) {
                    payeeToEdit.setEmail(incomingPayee.getEmail());
                }

                if (incomingPayee.getPhoneNumber() != null) {
                    payeeToEdit.setPhoneNumber(incomingPayee.getPhoneNumber());
                }

                if (incomingPayee.getAddress() != null) {
                    payeeToEdit.setAddress(incomingPayee.getAddress());
                }

                payeeToEdit.setW9ed(incomingPayee.getW9ed());

                payeeRepo.save(payeeToEdit);

            }
        } catch (Exception error) {
            error.printStackTrace();
        }
        return (Collection<Payee>) payeeRepo.findAll();
    }


    @PostMapping("/get-items-from-payee")
    public Collection<Item> getAllItemsOfPayee(@RequestBody Payee incomingPayee) throws IOException {

        Collection<Item> itemsToSendBack = new ArrayList<>();

        if (payeeRepo.findById(incomingPayee.getId()).isPresent()) {
            Payee payeeToOfferItems = payeeRepo.findById(incomingPayee.getId()).get();
            itemsToSendBack = payeeToOfferItems.getItems();
        }
        return itemsToSendBack;
    }


}
