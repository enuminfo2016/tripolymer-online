package com.enuminfo.cloud.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.enuminfo.cloud.data.model.UserOrderDeliveryLocation;

@Repository
public interface IUserOrderDeliveryLocationRepository
		extends PagingAndSortingRepository<UserOrderDeliveryLocation, Long> {

}
