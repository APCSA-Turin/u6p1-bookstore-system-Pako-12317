package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    // //requires 1 private attribute String currentId. You must initialize it to 99
    private String currentId = "99";
    // //requires one empty constructor
    public IdGenerate(){}

    // public  getCurrentId(){}
    public String getCurrentId(){
        return currentId;
    }
    // public  reset(){} //must reset the currentId back to 99
    public void reset(){
        currentId = "99";
    }

    // public generateID(){} //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
    public void generateID(){
        Integer i = Integer.parseInt(currentId);
        i+=1;
        currentId = i.toString();
    }
}