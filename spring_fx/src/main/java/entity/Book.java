package entity;

public class Book {

	private int id;
	private String name;
	//状态列（无数据表，列状态标识，翻译）
	private int sex;
	public static String[] sexs= {"不限","男","女"};
	public String getSexname() {
		return sexs[sex];
	}
	//外键列（有数据表，对象额外描述，扩展表述）
	private int typeid;
	private String typename;
	
	public Book() {
		
	}
	
	public Book(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}
	
}
