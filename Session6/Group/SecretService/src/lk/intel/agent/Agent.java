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
        this.realName=rn;
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
    	servicerecord.previousRanks.append(servicerecord.currentRank);
    	System.out.println("\nThe previous rank:"+ servicerecord.currentRank);
    	servicerecord.currentRank = rank;
        System.out.println("\nThe current rank:"+ servicerecord.currentRank);
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
