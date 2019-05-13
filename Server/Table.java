public class Table {

	private String id;
	private LatLng lat_lng;
	private int seats;
	private int floor;
	private List<Order> order;
	private double balance;
	public enum status{ free, reserved, calling, to_clean };

	Table(String id, LatLng lat_lng, int seats, int floor, double balance)
	{
		this.id = id;
		this.lat_lng = lat_lng;
		this.seats = seats;
		this.floor = floor;
		this.balance = balance;
	
	}
	
	
	public void onCall()
	{
		//kaleitai otan enas pelatis pataei to TableButton
		
		Waiter WaiterObject = new Waiter(); //ftiaxnw ena object gia tin klasi waiter
		WaiterObject.findBestForTable() = w;  //kalw ti sunartisi findBestForTable apo tin klasi Waiter
		WaiterObject.notify(w); //kalw tin notify() apo waiter dinontas tis ws eisodo ton waiter p brike i findBestForTable
		
	}

	public boolean onOrderPaid()
	{
		//kaleitai otan o servitoros epile3ei ena trapezi gia plirwmi apo tin o8oni tou
		
		Order OrderObject = new Order(); //ftiaxnw ena object gia tin klasi Order 
		OrderObject.setPaid(); //kalei tin sunartisi setPaid apo tin klasi Order
		// return true;

	}


	public static Table findFreeTable(WaitingGroup wg)
	{
		//kaleitai apo tin WaitingGroup kai prepei na ekteleite mexri na bre8ei trapezi gia ena waitinggroup
		
		while ( wg <> NULL ) 
		{
			/* if  status == free && seats(enos table) == (ari8mo atomwn tou wg) 
				wg = NULL */
	
		}
		
	}


	public void setTaken()
	{
		//kanei ena table taken an to epile3ei o PR
		
		// edw prepei na allazei to status tou table pou exei bre8ei

	}


	public void setReserved()
	{
		//kalei tin isavailable kai an einai true kalei ti showsuccess alliw showfailure

		if (this.isAvailable() == true ) 
		{
			showSuccess("Success");
			return true; //auto gia ti setReserved antistoixo tou "return ok"
		}
		else
		{
			showFailure("Failure");
			return false; //auto gia ti setReserved antistoixo tou "return failed"
		}

	}


	public boolean isAvailable()
	{




	}


	public boolean onTopologyEdit(Bundle new_info)
	{

	//kalei tin validateData 


	}


	public boolean validateData(Bundle new_info)
	{

	//elegxei tin egkurotita tis allagis stin topologia

	if (new_info getString("is_new") == "free") //an to trapezi pou allazei-diagrafei einai elef8ero ton afinei
		{
			return true;
		}
	else  //an exei ekremotites den ton afinei
		{ 
		return false; 
		}

	}

}
