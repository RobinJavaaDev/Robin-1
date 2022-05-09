package co.edu.full;

public class HomeworkVO {
	private String todo;
	
	public HomeworkVO() {
		
	}

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	@Override
	public String toString() {
		return "HomeworkVO [todo=" + todo + "]";
	}

	public HomeworkVO(String todo) {
		super();
		this.todo = todo;
	}
	
	
}
