package com.whitefancy.demo.jpa;


import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
//创建存储库
//您需要创建保存用户记录的存储库
public interface UserRepository extends CrudRepository<User, Integer> {

}