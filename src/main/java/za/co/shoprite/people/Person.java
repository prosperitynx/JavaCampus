package za.co.shoprite.people;

public abstract class Person{

private String name;
private String surname;
private  long idNum;
private long contactNum;
private String userPassword;
private String username;


public void setName(String name){
this.name = name;
}

public String getName(){
return this.name;
}

public void setSurname(String surname){
this.surname = surname;
}

public String getSurname(){
return this.surname;
}

public void setIdNum(long idNum){
this.idNum = idNum;
}

public long getIdNum(){
return this.idNum;
}

public void setContactNum(long contactNum){
this.contactNum = contactNum;
}

public long getContactNum(){
return this.contactNum;
}

public  void setPassword(String userPassword){
this .userPassword = userPassword;
}

public String getPassword(){
return this.userPassword;
}

public void  setUserName(String username){
this.userName = username;
}

public String getUserName(){
return this.username;

}
public void register( String name, String surname,
long idNum, long contactNum, long userPassword, String username){

	this.name = name;
	this.surname = surname;
	this.idNum = idNum;
	this.contactNum = contactNum;
	this.username = username;
return;	
}

public boolean login(String username,String userPassword ){

	if (userPassword.equals(getUserPassword()) && username.equals(getUserName)){
	return true;
		}
	else {return false
	}


	}



}

