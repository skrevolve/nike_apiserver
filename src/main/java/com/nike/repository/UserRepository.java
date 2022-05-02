package com.nike.repository;

public interface UserRepository<User> {
    User findByIdAndPassword(String name);
}
