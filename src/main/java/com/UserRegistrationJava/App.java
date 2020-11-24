package com.UserRegistrationJava;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO USER REGISTRATION PROGRAM" );
        Person person =new Person();
        Validator validate=new Validator();
        validate.validatefirstName(person);
        validate.validatelastName(person);
    }
}
