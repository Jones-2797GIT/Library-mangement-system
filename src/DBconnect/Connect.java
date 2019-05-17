package DBconnect;
import java.sql.*;
public class Connect {
    public static Connection con=null;
    public static Statement st=null;
    public static ResultSet rs=null;
    public static PreparedStatement Issue;
    public static PreparedStatement Return;
    
    static{
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/LibraryManagement","ram","123");
            st=con.createStatement();
            Issue=con.prepareStatement("insert into ISSUERETURN(Studentno,Bookno,Issuedby,Issuedate) values(?,?,?,?)");
            Return=con.prepareStatement("update ISSUERETURN set Returnto=?,Returndate=? where bookno=? and studentno=? and returnto is null");
            
            
            
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    public static void main(String...args){
            new Connect();
    }
}
