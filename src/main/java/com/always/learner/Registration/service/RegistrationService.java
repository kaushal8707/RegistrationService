package com.always.learner.Registration.service;
import com.always.learner.Registration.dto.SellerDto;
import java.util.List;

public interface RegistrationService {

    String addSeller(SellerDto sellerDto);

    List<SellerDto> getSellersList();
}
