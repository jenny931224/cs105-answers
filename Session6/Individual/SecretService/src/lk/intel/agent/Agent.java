/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.intel.agent;
import lk.intel.service_record.ServiceRecord;
/**
 *
 * @author Hp-Pc
 */
public class Agent {
    public String codeName;
    private String realName;
    private int idNumber;
    private ServiceRecord servicerecord;
    
    public Agent(String cn,String rn,int id){
        this.codeName=cn;
        this.realName=rn;
        this.idNumber=id;
    
    }
    
    public void setRealName(String rn){
	int length = String.valueof(rn).length();
	if(length<7){
		this.realName=rn;
	}
        
    }
    
    public String getRealName(){
        return realName;
    }
    
    public void setID(int id){
        this.idNumber=id;
    }
    
    public int getID(){
        return idNumber;
    }
    
    public void promote(String rank){
	int previousRankCount = servicerecord.previousRanks.length();
	if(servicerecord.getYearsOfService/10 > previousRankCount){
		servicerecord.previousRanks.append(servicerecord.currentRank);
        	System.out.println("\nThe previous rank:"+ servicerecord.currentRank);
		serviceRecord.currentRank = rank;
		System.out.println("\nThe previous rank:"+ servicerecord.currentRank);
	}
	

    }
    
    public void missionSuccess(){
        servicerecord.incrementSuccessfulMissionCount();
    }
    
    public void addExperience(){
        servicerecord.incrementYearsOfService();
    }
    
    public void printServiceRecord(){
        System.out.println("\nCode name:"+this.codeName);
        System.out.println("\nReal name:"+this.realName);
        System.out.println("\nID Number:"+this.idNumber);
        
    }
    
}
