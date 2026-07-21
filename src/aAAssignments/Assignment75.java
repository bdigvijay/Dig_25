package aAAssignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assignment75 {

	public static void main(String[] args) {

        String[] strArr = {"Techno", "Soniya", "uma", "ashwini", "pooja" , "credits", "uma", "pooja", "rajesh"};
        
        Set<String> names = new LinkedHashSet<>();
        
        for(String name : strArr){
            names.add(name);
        }
        
        List<String> nameList = new ArrayList<>(names);
        System.out.println(nameList);
        System.out.println("First index value :" + nameList.get(0));
        System.out.println("Last index value :" + nameList.get(nameList.size()-1));
	}
	
}
