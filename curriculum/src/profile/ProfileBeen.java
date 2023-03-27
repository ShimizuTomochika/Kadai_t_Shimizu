package profile;

/*
 * [概要]テキストファイルから受け取った各情報を格納する処理
 * [詳細]テキストファイルから受け取ってきた情報を格納して取り出せるようにする
 */
public class ProfileBeen {
	private int id = 0;
	private String name = "";
	private int age = 0;
	private String seibetu = "";
	private double height = 0;
	private double weight = 0;
	private String hobby = "";
	private String tel = "";
	
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return seibetu
	 */
	public String getSeibetu() {
		return seibetu;
	}
	/**
	 * @param seibetu セットする seibetu
	 */
	public void setSeibetu(String seibetu) {
		this.seibetu = seibetu;
	}
	/**
	 * @return height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height セットする height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight セットする weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return hobby
	 */
	public String getHobby() {
		return hobby;
	}
	/**
	 * @param hobby セットする hobby
	 */
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	/**
	 * @return tel
	 */
	public String getTel() {
		return tel;
	}
	/**
	 * @param tel セットする tel
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}
}
