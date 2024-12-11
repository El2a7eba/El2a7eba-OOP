package Hospital_Abdallah;
import java.util.ArrayList;
public class Room {
	
	private int roomNumber;
	private int floorNumber;
	private String floorType;
	private String roomType;
	
	ArrayList<Room> roomList = new ArrayList<Room>();
	
	public Room(int roomNumber, int floorNumber, String roomType) {
		if (floorNumber > 5 || floorNumber < 0) {
			throw new IllegalArgumentException("Floor number must be between 1 and 5.");
		}
		if(floorNumber == 0)
			this.floorType = "Xrays";
		else if(floorNumber == 1)
			this.floorType = "Reception";
		else if(floorNumber == 2)
			this.floorType = "Emergency";
		else if(floorNumber == 3)
			this.floorType = "Outsider Clinics";
		else if(floorNumber == 4)
			this.floorType = "Operations";

		this.roomNumber = roomNumber;
		this.floorNumber = floorNumber;
		this.roomType = roomType;

		}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	
	public String getFloorType() {
		return floorType;
	}

	public void setFloorType(String floorType) {
		this.floorType = floorType;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public ArrayList<Room> getRoomList() {
		return roomList;
	}

	public void setRoomList(ArrayList<Room> roomList) {
		this.roomList = roomList;
	}

	@Override
	public String toString() {
		return "Room1 [roomNumber=" + roomNumber + ", floorNumber=" + floorNumber + "]";
	}
}
