package com.taskAssignment
import grails.rest.*


@Resource(uri='/assignmentresult', formats=['json', 'xml'])
class AssignmentResult {
    
    String taskId
    String teamId
    // Date   assignDate 
    // String endDate

    static constraints = {
    }
}
