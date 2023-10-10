package br.dev.gustavosouza.todolistjava.user;

import lombok.Data;

@Data
public class UserModel {
    private String username;
    private String name;
    private String password;    
}