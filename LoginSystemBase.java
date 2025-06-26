package com.mycompany.StudentLoginSystem;

// Abstraction
public abstract class LoginSystemBase {
    //jo baad me override hoga
    public abstract Student verifyLogin(int id, int password);
}
