package com.taskAssignment
import grails.rest.*

@Resource(uri='/teamSkill', formats=['json', 'xml'])
class TeamSkill {

    String TEAM_ID
    String SKILL
    static belongsTo = [TEAM_ID: Team]
    static hasMany = [SKILL: Task]
    static constraints = {
    }
}
