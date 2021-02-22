package com.taskAssignment
import grails.rest.*

@Resource(uri='/teamSkill', formats=['json', 'xml'])
class TeamSkill {

    String teamId
    String skill

    static belongsTo = Team
    static hasMany = [task: Task]
    static constraints = {
    }
}
