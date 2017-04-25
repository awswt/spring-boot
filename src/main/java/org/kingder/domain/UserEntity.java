package org.kingder.domain;

import org.kingder.enums.UserSexEnum;

import java.io.Serializable;

/**
 * @Description
 * @Author jianda.deng
 * @Time 2017/4/19 16:48
 */
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	//@Column(name = "id", nullable = false)
	private Long id;
	private String userName;
	private String passWord;
	private UserSexEnum  userSex;
	private String nickName;

	public UserEntity() {
	}

	public UserEntity(String userName, String passWord, UserSexEnum userSex) {
		super();
		this.passWord = passWord;
		this.userName = userName;
		this.userSex = userSex;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public UserSexEnum getUser_sex() {
		return userSex;
	}

	public void setUser_sex(UserSexEnum userSex) {
		this.userSex = userSex;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "UserEntity{" +
				"id=" + id +
				", userName='" + userName + '\'' +
				", passWord='" + passWord + '\'' +
				", userSex='" + userSex + '\'' +
				", nickName='" + nickName + '\'' +
				'}';
	}
}
