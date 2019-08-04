package com.zensar.entities;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("Zigma");
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
