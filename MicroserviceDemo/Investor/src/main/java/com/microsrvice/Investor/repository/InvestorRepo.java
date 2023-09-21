package com.microsrvice.Investor.repository;

import com.microsrvice.Investor.entity.Investor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestorRepo extends JpaRepository<Investor,Long> {
}
