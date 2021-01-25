package com.taskAssignment
import grails.rest.*


@Resource(uri='/assignmentresult', formats=['json', 'xml'])
class AssignmentResult {
    
    String teamId
    String skill
    String taskId

    static constraints = {
    }
}
