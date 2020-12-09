package com.pharmacie.app.models;

import java.util.ArrayList;

public class Client extends Person{
	

	private int itemsPurchased;
	private boolean isLoyal;
	
	
	public int getItemsPurchased() {
		return itemsPurchased;
	}
	public void setItemsPurchased(int itemsPurchased) {
		this.itemsPurchased= itemsPurchased;
	}
	
	public boolean getIsLoyal() {
		return isLoyal;
	}
	public void setIsLoyal(boolean isLoyal) {
		this.isLoyal= isLoyal;
	}
	
	public Client(int id, String firstName, String lastName, int itemsPurchased, boolean isLoyal) {
		super (id , firstName, lastName);
		this.itemsPurchased= itemsPurchased;
		this.isLoyal= isLoyal;
	}
	
	public Client() {		
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n Items purchased: " + itemsPurchased + "\n Is loyal: " + isLoyal;
	}
	

	

    public String addPerson(ArrayList<Client> listClient, Client client) {
	try {
		listClient.add(client);
		return "Person Added";
		
	}catch(Exception ex) {
		return ex.getMessage();
		
	}
		
	}
    
    
    
    public String editPerson(ArrayList<Client> listClient, Client client, int index) {
		try {
			
			listClient.set(index, client);
			return "Person Edited !";
			
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
			
		}
    



	

}
