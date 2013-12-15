package Hostel21;


// --------------------------------------------------------------------------------------------------------
// CS445 - Fall 2013 - Project  - Submitted by Student: Muntaser Khan email:mkhan12@iit.edu
// --------------------------------------------------------------------------------------------------------

public class BedDetail {
	
	protected
		long	numBeds; // number of Beds booked in this room
		long	pricePerBed; // price of that specific bed
		
	public
		BedDetail(long	numBeds,long	pricePerBed) // constructor...
		{
			this.numBeds = numBeds;
			this.pricePerBed = pricePerBed;
		}
	
		BedDetail() // constructor...
		{
			this(0, 0);
		}
	
		BedDetail(BedDetail copyFrom) // copy constructor...
		{
			this(copyFrom.numBeds, copyFrom.pricePerBed);
		}
	
		long	getNumBeds()
		{
			return numBeds;
		}
	
		long	setNumBeds(long newNumBeds)
		{
			if (newNumBeds <= 0)
				return -1;
			
			long	old = numBeds;
			numBeds = newNumBeds;
			return old;
		}
		
		long	getPrice()
		{
			return pricePerBed;
		}
		
		long	setPrice(long newPrice)
		{
			if (newPrice <= 0)
				return -1;
			
			long	old = pricePerBed;
			pricePerBed = newPrice;
			return old;
		}

}
