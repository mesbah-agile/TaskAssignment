package com.taskassignment
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import com.taskAssignment.Task
import com.taskAssignment.Team
import com.taskAssignment.TeamSkill
import com.taskAssignment.AssignmentResult

import grails.transaction.Transactional

@Transactional
class ProcessService {

    def serviceMethod() {
        
        def a = Task.get(1)
        println(a)






        // int count = 0 
        // // List skillList = ["SKILL_1"[],"SKILL_2"[],SKILL_3[]]
        // // List<String> skillList = new ArrayList<String>()
        // // skillList.add(TeamSkill.SKILL)
        // // println("${skillList}")
        // TeamSkill.getBody().eachLine {line -> 
        // // println(skillList)
        // HashMap<String, String> hmap = new HashMap<String, String>()
        // hmap.put("12", "Chaitanya")
        // hmap.put("2", "Rahul")
        // hmap.put("7", "Singh")
        // hmap.put("49", "Ajeet")
        // hmap.put("3", "Anuj")
        // Set set = hmap.entrySet();
        // Iterator iterator = set.iterator();
        // while(iterator.hasNext()) {
        //     Map.Entry mentry = (Map.Entry)iterator.next();
        //     System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
        //     System.out.println(mentry.getValue());
        // }
        
        
        // // }


        
        // for(int i = 0; i < TeamSkill.size(); i++) {
        //     skillList.add(TeamSkill.SKILL)
        //     skillList.unique()
        //     println (skillList)
        //     //skillList[Skill_1[team_1,team_2],Skill_2[team_1],Skill_3[team_3]]
        //     for(int j = 0; j < skillList.length(); i++){
        //         if (Team.TEAM_ID == Task.TEAM_ID && skillList[i]==TeamSkill.SKILL){
        //             SkillList[i[j]] = TeamSkill.TEAM_ID

        //         skillList[].add
        //         skillList
        //         if(skillList[TEAM_ID[]].contains(Task.SKILL) == false){
        //             skillList[TEAM_ID][].add(Task.SKILL)
        //         }
        //         }
        //     }
        // }
        // def result = new AssignmentResult()
        // taskList = []
        // Task.eachLine{line ->
        //     if(Task.SKILL == TeamSkill.SKILL ){
        //         if (TeamSkill.TEAM_ID.taskList == 0){
        //             result.TEAM_ID.add(Task.TASK_ID)
        //         }if else(TeamSkill.TEAM_ID.taskList ){

        //         }

                
        // }
        // for(int i = 0, i < Task.size(), i++){
            
        //     }
        //     int count = 0 

        // }
    }
}
