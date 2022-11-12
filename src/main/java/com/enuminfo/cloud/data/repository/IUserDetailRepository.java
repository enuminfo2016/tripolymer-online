package com.enuminfo.cloud.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.enuminfo.cloud.data.model.UserDetail;

@Repository
public interface IUserDetailRepository extends PagingAndSortingRepository<UserDetail, Long> {

	UserDetail findByEmail(String email);

	UserDetail findByPhone(String phone);
}
