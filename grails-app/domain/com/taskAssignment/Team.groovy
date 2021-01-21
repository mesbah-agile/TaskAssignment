package com.taskAssignment
import grails.rest.*

@Resource(uri='/team', formats=['json', 'xml'])
class Team {

    String TEAM_ID
    
    static hasMany = [TEAM_ID: TeamSkill]
    static constraints = {
    }
}
