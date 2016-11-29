package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Users implements UsersInterface  {
	
	String name;
	int age;
	
	

	public Users(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public Object createUser()  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input user name");
		String name = null;
		try {
			name = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Input user age");
		int age = 0;
		try {
			age = reader.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Users(name,age);
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] showUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
