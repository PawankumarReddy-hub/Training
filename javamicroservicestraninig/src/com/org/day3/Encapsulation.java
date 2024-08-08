package com.org.day3;

class Phone
{
	private String model;
	private String brand;
	private String[] messages=new String[10];
	private int messageCount=0;
	private String[] gallery=new String[10];
	private int galleryCount=0;
	public Phone(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void makeCall(String phoneNumber,String string)
	{
		System.out.println("Calling...."+phoneNumber+"......");
	}
	
	public void receiveCall(String callerName)
	{
		System.out.println("Receiving a Call From "+ callerName+"........");
	}
	
	public void sendMessage(String phoneNumber,String message)
	{
		System.out.println("Sending message to "+phoneNumber+": "+message);
		if(messageCount<messages.length)
		{
			messages[messageCount++]="To: "+phoneNumber+" - "+message;
		}
		else
		{
			System.out.println("Message storage is full");
		}
	}
	
	public void readMessage()
	{
		System.out.println("Reading Messages......");
		for(int i=0;i<messageCount;i++)
		{
			System.out.println(messages[i]);
		}
	}
	
	public void clickPicture(String photoname)
	{
		System.out.println("Clicking Picture: "+photoname);
		if(galleryCount<gallery.length)
		{
			gallery[galleryCount++]=photoname;
		}
		else
		{
			System.out.println("Gallery is full");
		}
	}
	
	public void lookIntoGallery()
	{
		System.out.println("Looking into gallery.....");
		for(int i=0;i<galleryCount;i++)
		{
			
		}
	}
}

public class Encapsulation {

	public static void main(String[] args) 
	{
		
	}

}
