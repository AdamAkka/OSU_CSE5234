package edu.osu.cse5234.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InventoryUpdater {
	
	public static void main(String[] args) {
		
		System.out.println("1. Starting inventory update Process ...");
		try {
			Connection conn = createConnection();
			Collection<Integer> newOrderIds = getNewOrders(conn);
			Map<Integer, Integer> orderedItems = getOrderedLineItems(newOrderIds, conn);
			udpateInventory(orderedItems, conn);
			udpateOrderStatus(newOrderIds, conn);
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Connection createConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:h2:C:/Users/212600883/git/OSU_CSE5234/h2db/BuckeyeSweetsDB;AUTO_SERVER=TRUE", "sa", "");
		return conn;
	}

	private static Collection<Integer> getNewOrders(Connection conn) throws SQLException {
		Collection<Integer> orderIds = new ArrayList<Integer>();
		ResultSet rset = conn.createStatement().executeQuery("select ID from CUSTOMER_ORDER where STATUS = 'New'");
		while (rset.next()) {
			orderIds.add(new Integer(rset.getInt("ID")));
		}
		return orderIds;
	}

	private static Map<Integer, Integer> getOrderedLineItems(Collection<Integer> newOrderIds, Connection conn)
			throws SQLException {
		System.out.println("2. Collecting ITEM IDs and Quantities from CUSTOMER_ORDER_LINE_ITEM table ...");

		Map<Integer, Integer> orderedItems = new HashMap<Integer, Integer>();

		String mySQLQuery = "SELECT Line.ITEM_NUMBER, SUM(Line.QUANTITY ) as QTY";
		mySQLQuery = mySQLQuery + " FROM CUSTOMER_ORDER_LINE_ITEM Line, CUSTOMER_ORDER CusOrder";
		mySQLQuery = mySQLQuery + " WHERE Line.CUSTOMER_ORDER_ID_FK = CusOrder.ID";
		mySQLQuery = mySQLQuery + " AND CusOrder.STATUS = 'New'";
		mySQLQuery = mySQLQuery + " GROUP BY Line.ITEM_NUMBER ORDER BY 1";
		
		ResultSet rset = conn.createStatement().executeQuery(mySQLQuery);
		
		while (rset.next()) {
			orderedItems.put(new Integer(rset.getInt("ITEM_NUMBER")), new Integer(rset.getInt("QTY")));		
		}
		
		return orderedItems;
	}

	private static void udpateInventory(Map<Integer, Integer> orderedItems, Connection conn) throws SQLException {

		System.out.println("3. Updating inventory in ITEM table ...");

		for (Map.Entry<Integer, Integer> entry : orderedItems.entrySet()) {
			
			String mySQLQuery = "UPDATE ITEM SET AVAILABLE_QUANTITY = AVAILABLE_QUANTITY - " + entry.getValue();
			mySQLQuery = mySQLQuery + " WHERE ITEM_NUMBER = " + entry.getKey();
			
			conn.createStatement().execute(mySQLQuery);
		}
	}

	private static void udpateOrderStatus(Collection<Integer> newOrderIds, Connection conn) throws SQLException {
		System.out.println("4. Updating CUSTOMER_ORDER status from 'New' to 'Processed' ...");
		
		for (Integer entry : newOrderIds) {
			String mySQLQuery = "UPDATE CUSTOMER_ORDER SET STATUS = 'Processed' WHERE ID = " + entry;
			conn.createStatement().execute(mySQLQuery);	
		}

		System.out.println("5. Inventory update process has been completed.");
	}
}