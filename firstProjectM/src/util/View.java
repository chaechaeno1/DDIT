package util;

public interface View {
	int HOME = 1;
	int MAIN = 11;

	int MEMBER = 2;
	int MEMBER_SIGNUP = 21;
	int MEMBER_LOGIN = 22;
	int MEMBER_RESIGN = 23;
	
	int TICKET = 3;
	int TICKET_SEARCHING = 31;
	int TICKET_SEARCHING_STATION = 32;
	int TICKET_SEARCHING_DATE = 33;
	int TICKET_SEARCHING_BUS_SEAT = 34;
	int TICKET_BUY = 35;
	
	int REFUND = 4;
	int REFUND_SEARCHING_TICKET = 41;
	int REFUND_TICKET = 42;

	int MANAGE = 5;
	int MANAGE_BUS = 51;
	int MANAGE_STATION = 52;
	int MANAGE_SERVICE = 53;
	int MANAGE_SALES = 54;
	
}

