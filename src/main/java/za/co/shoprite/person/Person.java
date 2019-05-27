package za.co.shoprite.person;

public class Person{

private String name;
private String secondName;
private String surname;
private  long idNum;
private long contactNum;
private long password;
private String emailAddress;
private long accountNum;

void login(){}
void regitration(){}
public void setName(String name){
this.name = name;
}

public String getName(){
return this.name;
}
public void setSecondName(String secondName){
this.secondName = secondName;
}

public String getSecondName(){
return this.secondName;
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

public  void setPassword(long password){
this .password = password;
}

public long getPassword(){
return this.password;
}

public void setEmailAddress(String emailAddress){
this.emailAddress = emailAddress;
}

public String getEmailAddress(){
return this.emailAddress;
}


public void setAccountNum(long accountNum){
this.accountNum = accountNum;
}


public long getAccountNum(){
return this.accountNum;

}


}
