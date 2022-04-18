package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bank.model.AccountDetails;

public interface BankRepository extends JpaRepository<AccountDetails, String> {

}
