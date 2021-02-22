// package com.taskassignment
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Iterator;
// import java.util.Set;
// import com.taskAssignment.Task
// import com.taskAssignment.Team
// import com.taskAssignment.TeamSkill
// import com.taskAssignment.AssignmentResult

// import grails.transaction.Transactional

// @Transactional
// class ProcessService {

//     def serviceMethod() {
        
//         def a = Task.get(1)
//         println(a)
//         for(int i = 1; i < alist.size(); i++ ){
//                 if( alist.get(i) < min ){
//                     min = alist.get(i)
//                 }
//             }

//             int max = alist.get(0)
//             for(int i = 1; i < alist.size(); i++ ){
//                 if( alist.get(i) > max ){
//                     max = alist.get(i)
//                 }
//             }
            
//             for(j in teamSkillList){
//                 def tmSkill = j.skill
//                 def tmId = j.teamId 
//                 // println(tmSkill)
//                 def c = Task.findBySkill(tmSkill)
                
//                 def skillTask = TeamSkill.where{skill == item.skill}.findAllByTeamId(j.teamId)
//                 println("tskskill "+ skillTask)    
                
//                 // log.info(`abd "${skillTask}`)

//                 // def b = T
                

//                 // def alist = [team1List.size(),team2List.size(),team3List.size(),team4List.size(),team5List.size()]
//                 // int min = alist.get(0)

//                 // for(int i = 1; i < alist.size(); i++ ){
//                 //     if( alist.get(i) < min ){
//                 //         min = alist.get(i)
//                 //     }
//                 // }
                
//                 // int max = alist.get(0)
//                 // for(int i = 1; i < alist.size(); i++ ){
//                 //     if( alist.get(i) > max ){
//                 //         max = alist.get(i)
//                 //     }
//                 // }
//                 if (tmSkill == taskill){
                    
                    
                                          
//                     // println(tmId)
//                     def teamQuery = TeamSkill.findAllByTeamId(tmId)
//                     // println("teamquery "+teamQuery)

                   



//                     if(tmId == "TEAM_01"){
//                         if(team1List.size()<= min){
//                             team1List.add(task)
                           
//                             break
//                         }else if((team1List.size() == team2List.size())|| (team1List.size() == team3List.size())|| (team1List.size() == team4List.size())|| (team1List.size() == team5List.size())){
//                             team1List.add(task)
//                             break
//                         }
//                     }else if(tmId == "TEAM_02"){
//                         if(team2List.size()<= min){
//                             team2List.add(task)
//                             break
//                         }else if ((team2List.size() == team1List.size())|| (team2List.size() == team3List.size())|| (team2List.size() == team5List.size())){
//                             team2List.add(task)
//                             break
//                         }
//                     }else if(tmId == "TEAM_03"){
//                         if(team3List.size()<= min){
//                             team3List.add(task)
//                             break
//                         }else if((team3List.size() == team1List.size())|| (team3List.size() == team2List.size())|| (team3List.size() == team5List.size())){
//                             team3List.add(task)
//                             break
//                         }
//                     }else if(tmId == "TEAM_04"){
//                         if(team4List.size()<= min){
//                             team4List.add(task)
//                             break
//                         }else if((team4List.size() == team1List.size())|| (team4List.size() == team5List.size())){
//                             team4List.add(task)
//                             break
//                         }
//                     }else if(tmId == "TEAM_05"){
//                         if(team5List.size()<= min){
//                             team5List.add(task)
//                             break
//                         }else if((team5List.size() == team1List.size())|| (team5List.size() == team2List.size())|| (team5List.size() == team3List.size())|| (team5List.size() == team4List.size())){
//                             team5List.add(task)
//                             break
//                         }else {
//                             team5List.add(task)
//                             break
//                         }
                    
//                     }
//                     // }else if(tmId == "TEAM_01"){
//                     //     if (team1List.size() > min){
//                     //         if (team1List.size < max){
//                     //             team1List.add(task)
//                     //             break
//                     //         }
//                     //     }
//                     // // } 
//                     // }else if(tmId == "TEAM_02" && team2List.size() > min && team2List.size < max){
//                     //     // team2List.size() + 1
//                     //     team2List.add(task)
//                     //         break
//                     // }else if(tmId == "TEAM_03" && team3List.size() > min && team3List.size < max){
//                     //     // team3List.size() + 1    
//                     //     team3List.add(task)
//                     //         break
//                     // }else if(tmId == "TEAM_04" && team4List.size() > min && team4List.size < max){
//                     //     // team4List.size() + 1    
//                     //     team4List.add(task)
//                     //         break
//                     // }else if((tmId == "TEAM_05") && (team5List.size() > min) && (team5List.size < max)){
//                     //     // team5List.size() + 1
//                     //     team5List.add(task)
//                     //         break
//                     // }


                       
                            

//                     // println("teamId: " + tmId + " taskId: " +  task)
//                     // if(tmId == "TEAM_01" && ((team1List.size()<=team2List.size())||(team1List.size()<=team3List.size())||(team1List.size()<=team4List.size())||(team1List.size()<=team5List.size()))){
//                     //     team1List.add(task)
//                     //     break
//                     // }else if(tmId == "TEAM_02" && ((team2List.size()<=team1List.size())||(team2List.size()<=team3List.size()) || (team2List.size()<=team4List.size())||(team2List.size()<=team5List.size()))){
//                     //     team2List.add(task)
//                     //     break
//                     // }else if(tmId == "TEAM_03" && ((team3List.size()<=team1List.size())||(team3List.size()<=team2List.size())|| (team3List.size()<=team4List.size())||(team3List.size()<=team5List.size()))){
//                     //     team3List.add(task)
//                     //     break
//                     // }else if(tmId == "TEAM_04" && ((team4List.size()<=team1List.size())||(team4List.size()<=team2List.size()) || (team4List.size()<=team3List.size())||(team4List.size()<=team5List.size()))){
//                     //     team4List.add(task)
//                     //     break
//                     // }else if(tmId == "TEAM_05" && ((team5List.size()<=team1List.size())||(team5List.size()<=team2List.size()) ||(team5List.size()<=team3List.size())||(team5List.size()<=team4List.size()))){
//                     //     team5List.add(task)
//                     //     break
//                     // }

//                 }
//                 // def empty = "NULL"
//                 // if (max != team2List.size()){
//                 //     def num = max - team2List.size()
//                 //     for(int i = 1; i < num; i++ ){
//                 //         team2List.add(empty)
//                 //         println(team2List)
//                 //     } 
//                 // }
                
//             }
//         }
//             // println(skill)
       
//         // for(int i = 1; i < alist.size(); i++ ){
            
//         //     }
//         // }
        
//         // combineList.each() {fields->
//         //   def assignmentresult = new AssignmentResult( team01: fields[0], team02: fields[1],team03: fields[2],team04: fields[3],team05: fields[4])
//         //   assignmentresult.save(flush: true)
//         // } 
            
//         // println("Team 1: " + team1List)
//         // println("Team 2: " + team2List)
//         // println("Team 3: " + team3List)
//         // println("Team 4: " + team4List)
//         // println("Team 5: " + team5List)
//         // println(combineList)



// //     }SELECT  team_skill.skill   AS SKILL,
//            team_skill.team_id AS TEAM,
//            Count(team_skill.team_id)
// FROM       task
// INNER JOIN team_skill
// ON         task.skill = team_skill.skill 
// GROUP BY task.skill, team_skill.team_id 
// HAVING 
// ORDER BY  team_skill.team_id,task.skill DESC; 
// }
