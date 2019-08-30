package entity;

public class Type {

	private int id;
	private String name;
	private int sex;
	public static String[] sexs= {"²»ÏÞ","ÄÐ","Å®"};
	private int bookid;
	private String bookname;
	public Type() {
		
	}
	
	public Type(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getSexname() {
		return sexs[sex];
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

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	
}
