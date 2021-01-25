package com.taskAssignment
import grails.rest.*

@Resource(uri='/task', formats=['json', 'xml'])
class Task {

    String taskId
    String skill
    
    static belongsTo = [skill: TeamSkill]
    static constraints = {
    }
}
