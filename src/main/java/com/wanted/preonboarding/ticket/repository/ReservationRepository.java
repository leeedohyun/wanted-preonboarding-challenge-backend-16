package com.wanted.preonboarding.ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanted.preonboarding.ticket.domain.entity.Performance;
import com.wanted.preonboarding.ticket.domain.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    List<Reservation> findAllByNameAndPhoneNumber(final String name, final String phoneNumber);

    List<Reservation> findAllByPerformanceAndRound(final Performance findPerformance, final int round);
}
