package UI.GUI;

public enum Months {
	
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	
	@Override
	public String toString() {
		String name = name().replaceAll("_", " ").toLowerCase();
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		return name;
	}
}
