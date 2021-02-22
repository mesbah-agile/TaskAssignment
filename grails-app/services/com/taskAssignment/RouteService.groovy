package com.taskAssignment
import gorm.recipes.*
import com.taskAssignment.Task
import com.taskAssignment.Team
import com.taskAssignment.TeamSkill


import grails.transaction.Transactional

@Transactional
class RouteService {

    def serviceMethod() {
        def tsk = 'TASK_01'
        def tm = "TEAM_01"
        def skill_1 = 'SKILL_1'
        def query = TeamSkill.findAllByTeamIdAndSkill(tm,skill_1)
        def teamSkillList = TeamSkill.getAll()
        def teamList = Team.getAll()
        def taskList = Task.getAll()
        def ateam = teamSkillList.teamId
        def tskill = taskList.skill
        def teSkills = teamSkillList.skill
        def 
        // println(teSkills)

        // println(ts)
        
        def skill = teamSkillList.skill
        // def teamnum = Team.findByTeamId(tm)
        // println(teamnum)
        def team1List = []
        def team2List = []
        def team3List = []
        def team4List = []
        def team5List = []
        def combineList = [team1List,team2List,team3List,team4List,team5List]
        
        // def counttask = Task.findAllSkill(skill)
        // println(counttask)

        for (item in taskList){
            def taskill = item.skill
            def task = item.taskId
            println(task)        
           
            for(j in teamSkillList){
                def tmSkill = j.skill
                def tmId = j.teamId 
                def c = Task.findBySkill(tmSkill)
                def temp = []
                if (taskill == tmSkill){
                    
                    def skillTask = TeamSkill.findByTeamId(tmId)
                    // println("tskskill "+ skillTask.teamId)
                    temp.add(skillTask.teamId)
                    def cnt = AssignmentResult.count()
                    
                    println(cnt)
                    println(temp)
                }
                // println(temp)

                // def skillTask = TeamSkill.where{skill == item.skill}.findByTeamId(j.teamId)
                // // println("tskskill "+ skillTask)    
                
                // if (tmSkill == taskill){
                           
                //     def teamQuery = TeamSkill.findAllByTeamId(tmId)
                //     // println("teamquery "+teamQuery)

                //     if(tmId == "TEAM_01"){
                //         if(team1List.size()<= min){
                //             team1List.add(task)
                           
                //             break
                //         }else if((team1List.size() == team2List.size())|| (team1List.size() == team3List.size())|| (team1List.size() == team4List.size())|| (team1List.size() == team5List.size())){
                //             team1List.add(task)
                //             break
                //         }
                //     }else if(tmId == "TEAM_02"){
                //         if(team2List.size()<= min){
                //             team2List.add(task)
                //             break
                //         }else if ((team2List.size() == team1List.size())|| (team2List.size() == team3List.size())|| (team2List.size() == team5List.size())){
                //             team2List.add(task)
                //             break
                //         }
                //     }else if(tmId == "TEAM_03"){
                //         if(team3List.size()<= min){
                //             team3List.add(task)
                //             break
                //         }else if((team3List.size() == team1List.size())|| (team3List.size() == team2List.size())|| (team3List.size() == team5List.size())){
                //             team3List.add(task)
                //             break
                //         }
                //     }else if(tmId == "TEAM_04"){
                //         if(team4List.size()<= min){
                //             team4List.add(task)
                //             break
                //         }else if((team4List.size() == team1List.size())|| (team4List.size() == team5List.size())){
                //             team4List.add(task)
                //             break
                //         }
                //     }else if(tmId == "TEAM_05"){
                //         if(team5List.size()<= min){
                //             team5List.add(task)
                //             break
                //         }else if((team5List.size() == team1List.size())|| (team5List.size() == team2List.size())|| (team5List.size() == team3List.size())|| (team5List.size() == team4List.size())){
                //             team5List.add(task)
                //             break
                //         }else {
                //             team5List.add(task)
                //             break
                //         }
                    
                    // }
                    // }else if(tmId == "TEAM_01"){
                    //     if (team1List.size() > min){
                    //         if (team1List.size < max){
                    //             team1List.add(task)
                    //             break
                    //         }
                    //     }
                    // // } 
                    // }else if(tmId == "TEAM_02" && team2List.size() > min && team2List.size < max){
                    //     // team2List.size() + 1
                    //     team2List.add(task)
                    //         break
                    // }else if(tmId == "TEAM_03" && team3List.size() > min && team3List.size < max){
                    //     // team3List.size() + 1    
                    //     team3List.add(task)
                    //         break
                    // }else if(tmId == "TEAM_04" && team4List.size() > min && team4List.size < max){
                    //     // team4List.size() + 1    
                    //     team4List.add(task)
                    //         break
                    // }else if((tmId == "TEAM_05") && (team5List.size() > min) && (team5List.size < max)){
                    //     // team5List.size() + 1
                    //     team5List.add(task)
                    //         break
                    // }


                       
                            

                    // println("teamId: " + tmId + " taskId: " +  task)
                    // if(tmId == "TEAM_01" && ((team1List.size()<=team2List.size())||(team1List.size()<=team3List.size())||(team1List.size()<=team4List.size())||(team1List.size()<=team5List.size()))){
                    //     team1List.add(task)
                    //     break
                    // }else if(tmId == "TEAM_02" && ((team2List.size()<=team1List.size())||(team2List.size()<=team3List.size()) || (team2List.size()<=team4List.size())||(team2List.size()<=team5List.size()))){
                    //     team2List.add(task)
                    //     break
                    // }else if(tmId == "TEAM_03" && ((team3List.size()<=team1List.size())||(team3List.size()<=team2List.size())|| (team3List.size()<=team4List.size())||(team3List.size()<=team5List.size()))){
                    //     team3List.add(task)
                    //     break
                    // }else if(tmId == "TEAM_04" && ((team4List.size()<=team1List.size())||(team4List.size()<=team2List.size()) || (team4List.size()<=team3List.size())||(team4List.size()<=team5List.size()))){
                    //     team4List.add(task)
                    //     break
                    // }else if(tmId == "TEAM_05" && ((team5List.size()<=team1List.size())||(team5List.size()<=team2List.size()) ||(team5List.size()<=team3List.size())||(team5List.size()<=team4List.size()))){
                    //     team5List.add(task)
                    //     break
                    // }

                // }
                // def empty = "NULL"
                // if (max != team2List.size()){
                //     def num = max - team2List.size()
                //     for(int i = 1; i < num; i++ ){
                //         team2List.add(empty)
                //         println(team2List)
                //     } 
                // }
                
            }
        }
            // println(skill)
       
        // for(int i = 1; i < alist.size(); i++ ){
            
        //     }
        // }
        
        // combineList.each() {fields->
        //   def assignmentresult = new AssignmentResult( team01: fields[0], team02: fields[1],team03: fields[2],team04: fields[3],team05: fields[4])
        //   assignmentresult.save(flush: true)
        // } 
            
        // println("Team 1: " + team1List)
        // println("Team 2: " + team2List)
        // println("Team 3: " + team3List)
        // println("Team 4: " + team4List)
        // println("Team 5: " + team5List)
        // println(combineList)
    }
}
