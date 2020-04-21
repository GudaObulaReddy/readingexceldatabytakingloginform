package FirstMaven.readingexceldatanew;

public class ExcelUtility {

	public static void main(String[] args) 
	{
		Xls_Reader reader=new Xls_Reader("C:\\Users\\Ramakrishna\\eclipse-workspace\\readingexceldatanew\\Book 1.xlsx");
		String sheetName="Sheet1";
		String data=reader.getCellData(sheetName, 0, 2);
		System.out.println(data);
		int rowCount=reader.getRowCount(sheetName);
		System.out.println(rowCount);
		//reader.addColumn("Sheet1", "status");
        if(!reader.isSheetExist("Registration"))
        {
        	reader.addSheet("Registration");
        }
        else
        {
        	System.out.println("already this one is exists");
        }
       // reader.setCellData(sheetName, "status", 2, "PASS");
        System.out.println(reader.getCellData(sheetName,0,2));
        System.out.println(reader.getColumnCount(sheetName));
        //reader.removeColumn(sheetName, 4);
       //reader.setCellData("Sheet1", "status", 3, "9052525391");
      // reader.setCellData("Sheet1", "status", 4, "25");
       System.out.println(reader.getCellData(sheetName, 6, 3));
       System.out.println(reader.getCellData(sheetName, 6, 4));
        
        
        
        
	}

}
