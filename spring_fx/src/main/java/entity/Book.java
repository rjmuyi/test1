package entity;

public class Book {

	private Integer id;
	private String name;
	//״̬�У������ݱ���״̬��ʶ�����룩
	private Integer sex;
	public static String[] sexs= {"����","��","Ů"};
	public String getSexname() {
		return sexs[sex];
	}
	//����У������ݱ����������������չ������
	private Integer typeid;
	private String typename;
	
	public Book() {
		
	}
	
	public Book(String name) {
		super();
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}
	
}
