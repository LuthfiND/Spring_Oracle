package com.oraclesinau.sinaukodingluthfi.controller;


import com.oraclesinau.sinaukodingluthfi.model.TransaksiDTO;
import com.oraclesinau.sinaukodingluthfi.service.TransaksiService;
import com.oraclesinau.sinaukodingluthfi.utils.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transaksi")
public class TransaksiController {
    @Autowired
    private TransaksiService service;

    @GetMapping("/find-all")
    public RestResult getData(){
        return service.getData();
    }

    @PostMapping("/save-transaksi")
    public RestResult saveTransaksi(@RequestBody TransaksiDTO param){
        return service.saveTransaksi(param);
    }
}