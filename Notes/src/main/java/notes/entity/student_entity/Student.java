/**@Title: Student.java 
 * @Package com.brt.license.entity 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author xwl 
 * @date 2019年4月12日 上午10:46:16 
 * @version V1.0   
 */

package notes.entity.student_entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @ClassName: Student
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xwl
 * @date 2019年4月12日 上午10:46:16
 */
@Entity
@Table(name = "T_STUDENT", schema = "BRTLIC")
public class Student {

	@Id
	@GeneratedValue(generator = "sequenceGenerator")
	@GenericGenerator(
			name = "sequenceGenerator",
			strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", 
			parameters = { @Parameter(name = "sequence_name", value = "SEQ_STUDENT") }
			)
	private Long id;
	private String name;

	private String address;

	private String tel;

	@OneToMany(
			cascade = CascadeType.REFRESH,
			fetch = FetchType.EAGER,
			mappedBy="student",
			targetEntity=Book.class)
	private Set<Book> books;
	
	@ManyToMany(fetch = FetchType.LAZY,mappedBy="students")
	private Set<Course> courses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
