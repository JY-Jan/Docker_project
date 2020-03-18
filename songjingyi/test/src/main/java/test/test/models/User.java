/**
 * Copyrigt (2019, ) Institute of Software, Chinese Academy of Sciences
 */
package test.test.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import com.github.tools.annotations.api.FieldDescriber;
import com.github.tools.annotations.api.Required;
import com.github.tools.annotations.mysql.AutoIncrement;
import com.github.tools.annotations.mysql.DefaultValue;
import com.github.tools.annotations.mysql.JavaBean;
import com.github.tools.annotations.mysql.NotNull;
import com.github.tools.annotations.mysql.PrivateKey;

/**
 * @author wuheng@iscas.ac.cn
 * @since  2020.2.10
 *
 */

@JavaBean
public class User {

	@PrivateKey
	@AutoIncrement
	
	@FieldDescriber("用户的ID")
	private int id;

	@NotNull
	@Size(min = 10, max = 20, message = "{user.name.length.illegal}") 
	
	@FieldDescriber("用户名")
	@Required(true)
	private String name;

	@Size(min = 8, max = 20)
	@NotNull
	@FieldDescriber("用户密码")
	private String pwd;

	@DefaultValue("11")
	@Min(8)
	@Max(100)
	
	@FieldDescriber("用户年龄")
	private int age;

	@DefaultValue("baseball")
	@Size(max = 200)
	
	@FieldDescriber("用户爱好")
	@Required(false)
	private String habits;

	
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHabits() {
		return habits;
	}

	public void setHabits(String habits) {
		this.habits = habits;
	}

}