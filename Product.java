import java.util.GregorianCalendar;

class Product{
	private int price;
	private GregorianCalendar bestUntil;
	private String manufactureCountry;
	private String name;
	private float weight;
	private boolean isBanned;

	public Product(int price, GregorianCalendar bestUntil, String manufactureCountry, String name, float weight){
		this.price = price;
		this.bestUntil = bestUntil;
		this.manufactureCountry = manufactureCountry;
		this.name = name;
		this.weight = weight;

		this.isBanned = true;
		if(manufactureCountry == "Russia" || manufactureCountry == "Kazakhstan")
			this.isBanned = false;
	}

	public boolean isFresh()
	{
		return bestUntil.after(GregorianCalendar.getInstance());
	}

	public boolean isBanned()
	{
		return this.isBanned;
	}

	public float getWeight()
	{
		return this.weight;
	}

	public String getMadeIn()
	{
		return this.manufactureCountry;
	}

	public int getPrice()
	{
		return this.price;
	}

	public String getName()
	{
		return this.name;
	}

	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Product p = (Product) obj;   
        if (price != p.price)
            return false;
        if (bestUntil != p.bestUntil)
            return false;
        if (manufactureCountry != p.manufactureCountry)
            return false;
        if (name != p.name)
            return false;
        if (weight != p.weight)
            return false;
        if (isBanned != p.isBanned)
            return false;
            
        return true;
    }

    @Override
    public String toString()
    {
    	return "Product name: " + name + " price: " + Integer.toString(price) + 
    		" made in " + manufactureCountry + " weight " + Float.toString(weight);
    }
}