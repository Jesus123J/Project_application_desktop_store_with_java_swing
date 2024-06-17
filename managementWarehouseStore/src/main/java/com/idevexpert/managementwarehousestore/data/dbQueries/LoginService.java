/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.idevexpert.managementwarehousestore.data.dbQueries;

import com.idevexpert.managementwarehousestore.data.ConnectionDb;
import java.sql.Connection;

/**
 *
 * @author Jesus Gutierrez
 */
public class LoginService{
   
    private Connection connection;
    
    public LoginService(Connection connection){
        this.connection = connection;
    }
    
    public Integer incomeServiceLogIn(){
        
        return 1;
    }
}
