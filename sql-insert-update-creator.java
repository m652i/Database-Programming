package Practices;
import java.util.ArrayList;
import stdlib.StdIn;

public class Insert_for_SQL {

	
	public static void addMarks(ArrayList<String> list) {
		int i = 0;
		String supno = "";
		String partno = "";
		String prono = "";
		int t = 0;
		for(String a : list) {
			t++;
			
			if(i == 0) {
				//System.out.print("insert into Shipments values (");
				//System.out.print("Where SupplierNo = '" + a + "'");
				System.out.println("UPDATE Shipments");
				supno = "Where SupplierNo = '" + a + "'";
				i++;
			}
			else if(i == 1) {
				//System.out.print("AND PartNo = '" + a + "'");
				partno  = "AND PartNo = '" + a + "'";
				i++;
			}
			else if(i == 2) {
				//System.out.println("AND ProjectNo = '" + a + "'");
				prono = "AND ProjectNo = '" + a + "'";
				i++;
			}
			else if(i == 3) {
				System.out.print("SET Shipdate = TO_DATE('" + a + "','MM/DD/YY'),");
				i++;
			}
			else if(i == 4 ) {
				System.out.println("Arrivedate = TO_DATE('" + a + "','MM/DD/YY')");
				System.out.println(supno+partno+prono+";");
				i = 0;
			}
			/*else {
				System.out.print("'"+ a +"',");
				i++;
			}*/
		}
		System.out.println("Total lines : " + t);
	}
	
	
	public static void main (String[] args) {
		StdIn.fromFile("data/SQL Inserts.txt");
		ArrayList<String> list = new ArrayList();
		while(StdIn.hasNextLine()) {
			String currentline = StdIn.readLine();
			list.add(currentline);
		}
		addMarks(list);
	}
	
	
}
