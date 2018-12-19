package task1;

public class QueryClass 
{
	static String Name;
	
	
	
	public static String getQueriesShowTables() {

		String showTable = "show tables;";// "insert into order" operations;
		
		return showTable;
	}

	public static String getQueriesSelect(String tableName) 
	{
	    Name=tableName;
       String SELECT = ("select * from "+ tableName +"");// "insert into order" operations;
		
		return SELECT;
	}
	public static String getQueriesInsert(String tableName) 
	{ 
		Name=tableName;
		String insert="";
       if (tableName.equalsIgnoreCase("trainee"))
       {

		 insert = " insert into trainee values (?,?,?,?,?)";// "insert into order" operations;
       }
       else if (tableName.equalsIgnoreCase("trainer"))
       {

    	   insert = "insert into trainer values (?,?,?,?,?,?,?) ";// "insert into order" operations;
       }
		return insert;
	}
	
	
	
}