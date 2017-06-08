package com.viettech.springjpa.repository;

import com.viettech.springjpa.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tuananh on 06/08/17.
 */
@Repository
public interface BookRepository  extends CrudRepository<BookEntity, Integer>{
}
