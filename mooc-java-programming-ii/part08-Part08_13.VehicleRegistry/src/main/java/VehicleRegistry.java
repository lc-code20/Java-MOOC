
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lwych
 */
public class VehicleRegistry {
    private HashMap<LicensePlate, String> hashmap;

    public VehicleRegistry() {
        this.hashmap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        
        if (this.hashmap.containsKey(licensePlate)){
            return false;
        }
        
        this.hashmap.put(licensePlate, owner);
        
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        
        return this.hashmap.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        
        if (this.hashmap.containsKey(licensePlate)){
            this.hashmap.remove(licensePlate);  
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates(){
        
        for (LicensePlate lp : hashmap.keySet()){
            System.out.println(lp);
        }
        
    }
    
    public void printOwners(){
        
        ArrayList<String> owners = new ArrayList<>(); 
        
        for (LicensePlate lp : hashmap.keySet()){
            String owner = hashmap.get(lp);
            if (!owners.contains(owner)){
                owners.add(owner);
                System.out.println(owner);
            }
            
        }
        
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.hashmap);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VehicleRegistry other = (VehicleRegistry) obj;
        if (!Objects.equals(this.hashmap, other.hashmap)) {
            return false;
        }
        return true;
    }


    

   
    
    
}
