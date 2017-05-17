package model;

public class GroupPlace {
	
	private Place []placeList;
	
	public GroupPlace() {
		placeList = new Place[0];
	}
	
	public GroupPlace(Place[] placeList) {
		this.placeList = placeList;
	}

	public Place[] getPlaceList() {
		return placeList;
	}
	
	public GroupPlace(GroupPlace groupPlace){
		this.placeList = groupPlace.getPlaceList();
	}

	public void setPlaceList(Place[] placeList) {
		this.placeList = placeList;
	}
	
	public void add(Place place){
		Place [] placeA = new Place[this.placeList.length+1];
		for (int i = 0; i < placeList.length; i++) {
			placeA[i] = this.placeList[i]; 
		}
		placeA[placeList.length -1] = place;
		this.placeList =placeA;
	}
}
