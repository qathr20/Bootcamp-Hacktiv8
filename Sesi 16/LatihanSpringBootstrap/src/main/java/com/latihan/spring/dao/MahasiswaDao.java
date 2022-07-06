package com.latihan.spring.dao;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.latihan.spring.entity.Mahasiswa;

@Repository
public interface MahasiswaDao extends PagingAndSortingRepository<Mahasiswa, String>  {

}
