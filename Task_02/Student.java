import java.util.Objects;

public class Student {
	
	String name;
	int mark;

	public Student (String name, int mark) {
		this.name = name;
		this.mark = mark;
	}

	public String toString() {

		String info = name + " : " + mark;
		
		return info;

	}

	public boolean equals (Object o) {

		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Student student = (Student) o;

		return mark == student.mark && Objects.equals(name, student.name);

	}

	public int hashCode() {
        return Objects.hash(name, mark);
    }

}