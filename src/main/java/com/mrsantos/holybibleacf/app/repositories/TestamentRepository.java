package com.mrsantos.holybibleacf.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrsantos.holybibleacf.app.models.TestamentModel;

public interface TestamentRepository extends JpaRepository<TestamentModel, Integer>{
}
