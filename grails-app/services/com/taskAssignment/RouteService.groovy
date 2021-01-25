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

        for (item in taskList ){
            
        }


            
          
        
        
        // def task_list = query.list()
        
        println("TS " + teamSkillList)
        println("TE " + teamList)
        println("TA " + taskList)



    }
}
