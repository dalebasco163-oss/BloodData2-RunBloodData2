package SetAndGet;
public class BloodData2 {
private String BloodType;
private String rhFactor;

public BloodData2(){
BloodType = "O";
rhFactor = "+";
}

public void setBloodType(String bt){
BloodType = bt;
}
public void setrhFactor(String rh){
rhFactor = rh;

}

public String getBloodType(){
return BloodType;

}

public String getrhFactor(){
return rhFactor;

}
}
