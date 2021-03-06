package kr.co.abandog.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="member")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Member extends BaseEntity{
	
	@Id
	@Column(name="member_email", length=30)
	private String member_email;
	
	@Column(name="member_pw", length=20, nullable= false)
	private String member_pw;
	
	@Column(name="member_name", length=30)
	private String member_name;
	
	@Column(name="member_age")
	private Integer member_age;
	
	@Column(name="member_gender", length=1, columnDefinition = "char")
	private String member_gender;
	
	@Column(name="member_phone", length=11)
	private String member_phone;
	
	@Column(name="member_address", length=30)
	private String member_address;
	
	@Column(name="admin_yn", length=1, nullable= false, columnDefinition = "char")
	private String admin_yn;

}
