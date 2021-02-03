package com.taskAssignment
import grails.rest.*


@Resource(uri='/assignmentresult', formats=['json', 'xml'])
class AssignmentResult {
    
    String team01
    String team02
    String team03
    String team04
    String team05
    

    static constraints = {
    }
}
