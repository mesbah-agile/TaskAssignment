package com.taskAssignment
import grails.rest.*

@Resource(uri='/team', formats=['json', 'xml'])
class Team {

    String teamId
    
    static hasMany = [teamId: TeamSkill, task: Task]
    static constraints = {
    }
}
