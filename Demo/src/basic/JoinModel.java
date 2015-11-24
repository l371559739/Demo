package basic;

public enum JoinModel {

	single(1, "单聚合"), multi(2, "多聚合"), all(3, "全聚合");

	private String name;

	private Integer value;

	private JoinModel(Integer value, String name) {
		this.value = value;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Integer getValue() {
		return value;
	}
}