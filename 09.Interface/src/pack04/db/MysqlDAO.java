package pack04.db;

//A:MySql을 이용해서 database작업
public class MysqlDAO implements DataAccessObject{

	@Override
	public void select() {
		System.out.println(IP+"에 접근해서 MySql select");
		
	}

	@Override
	public void insert() {
		System.out.println(IP+"에 접근해서 MySql insert");
		
	}

	@Override
	public void update() {
		System.out.println(IP+"에 접근해서 MySql update");
		
	}

	@Override
	public void delete() {
		System.out.println(IP+"에 접근해서 MySql delete");
		
	}

}
