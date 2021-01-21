package com.taskAssignment
import grails.rest.*

@Resource(uri='/task', formats=['json', 'xml'])
class Task {

    String TASK_ID
    String SKILL

    static belongsTo = [SKILL: TeamSkill]
    static constraints = {
    }
}
