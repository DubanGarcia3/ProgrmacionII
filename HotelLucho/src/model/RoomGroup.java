package model;

public class RoomGroup {
	
	private Hotel[] hotelList;
	
	public RoomGroup() {
		hotelList = new Hotel[0];
	}
	
	public RoomGroup(Hotel[] hotelList){
		this.hotelList = hotelList;
	}

	public RoomGroup(RoomGroup roomGroup) {
		this.hotelList = roomGroup.getHotelList();
	}

	public Hotel[] getHotelList() {
		return hotelList;
	}
	
	public Hotel searchHotel( int code, int level){
		for (int i = 0; i < hotelList.length; i++) {
			if (hotelList != null) {
				if (hotelList[i].getLugar().getLevel() == level && hotelList[i].getLugar().getCode() == code) {
					return hotelList[i];
				}
			}
		}
		return null;
	}
}