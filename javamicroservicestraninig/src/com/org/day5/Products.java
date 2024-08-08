package com.org.day5;
class ProductNotFound extends Exception
{
	static String notFound="product key Invalid, Try some other key";
	public ProductNotFound()
	{
		super(notFound);
	}
}

public class Products {
	static String[] ProductList= {"Phone","washingMachine","Geyser","Television","Laptop"};
	static int validKey=ProductList.length;
	
	public static void bring(int productNo) throws ProductNotFound
	{
		if(productNo>=validKey || productNo<0)
		{
			throw new ProductNotFound();
		}
		else
		{
			System.out.println(ProductList[productNo-1]);
		}
	}

	public static void main(String[] args) throws ProductNotFound
	{
		System.out.println("fetching some products...");
		bring(2);
		bring(6);

	}

}
