package javapro.interfaceEx;

public class DaoEx01 {

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}
  public static void dbWork(DataAccessObject dao) {
	  dao.select();
	  dao.insert();
	  dao.update();
	  dao.delete();
  }
}
