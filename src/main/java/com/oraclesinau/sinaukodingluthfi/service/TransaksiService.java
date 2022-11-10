package com.oraclesinau.sinaukodingluthfi.service;


import com.oraclesinau.sinaukodingluthfi.model.Transaksi;
import com.oraclesinau.sinaukodingluthfi.model.TransaksiDTO;
import com.oraclesinau.sinaukodingluthfi.repository.TransaksiRepository;
import com.oraclesinau.sinaukodingluthfi.utils.ManyData;
import com.oraclesinau.sinaukodingluthfi.utils.RestResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransaksiService {
    private final TransaksiRepository repository;

    public RestResult getData(){
        ManyData<Transaksi> result = new ManyData<>(repository.getTransaksi(), Transaksi.class);

        return new RestResult(
                result.getData(),
                result.getMessage(),
                result.getError()
        );
    }

    public RestResult saveTransaksi(TransaksiDTO param){
        ManyData<Transaksi> result = new ManyData<>(repository.saveTransaksi(param), Transaksi.class);

        return new RestResult(
                result.getData(),
                result.getMessage(),
                result.getError()
        );
    }


}

