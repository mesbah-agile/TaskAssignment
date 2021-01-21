import org.apache.camel.Exchange
import org.apache.camel.Message
import org.apache.camel.Processor
import ApplicationRoute
import com.taskAssignment.Task
import com.taskAssignment.Team
import com.taskAssignment.TeamSkill



public class MyProcess implements Processor {
  public void process (Exchange exchange) {
    
    Message msg = exchange.getIn()
    
    String myFile = (String) msg.getHeader("CamelFileName")


    // def body = exchange.getBody(String.class)
    
    // def myFile = ("file.csv")
    //println(myFile)
    // if( myFile ==~ /(.*)\.*/){
    // def match = myFile.replace(/(.*)\.*/,'$1.$2')
    // def part = match.split(/\./,2)
    // fileName = part[0]

    def part = myFile.split(/\./, 2)
    def fileName = part[0]
    
    def body = msg.getBody(String.class)
    
  
    // def TASK_ID = Task.TASK_ID
    // def SKILL = Task.SKILL
    // List<FileData> data = (List<FileData>) msg.getBody();

    // GrailsDomainClass dc = grailsApplication.getDomainClass( 'com.taskAssignment' )
    // println(dc)

    //println("This is the filename " + fileName + " " + body)
    
    // BufferedReader br = new BufferedReader(new FileReader(file))
    // int iteration = 0;
    // while ((line = br.readLine()) != null) {
    // if(iteration == 0) {
    //     iteration++;  
    //     continue;

    def lineRange = 1..body.size()
    
    
    

    if (fileName == "task" ){
      body.eachLine{ line, lineNo ->
        if(lineRange.contains(lineNo)){
          // println(line)
          line.splitEachLine(",") {fields->
          def task = new Task( TASK_ID: fields[0].trim(), SKILL: fields[1].trim())
          task.save(flush: true , failOnError: true) 
          }
        }
      }
    
    }
    if (fileName == "team" ){
      body.eachLine{ line, lineNo ->
        if(lineRange.contains(lineNo)){
          // println(line)
          line.splitEachLine(",") {fields->
          def team = new Team( TEAM_ID: fields[0].trim())
          team.save(flush: true , failOnError: true) 
          }
        }
      }
    }
    if (fileName == "team_skill" ){
      body.eachLine{ line, lineNo ->
        if(lineRange.contains(lineNo)){
          // println(line)
          line.splitEachLine(",") {fields->
          def teamSkill = new TeamSkill( TEAM_ID: fields[0].trim(), SKILL: fields[1].trim())
          teamSkill.save(flush: true , failOnError: true) 
          }
        }
      }
    }else{
      log.info ("The table for that file do not exisit")
    }
    //   }
    // if (fileName == "task" ){
    //   body.splitEachLine(","){
    //   def task = new Task( TASK_ID: i[0].trim(), SKILL: i[1].trim())
      
    //   task.save(flush: true , failOnError: true) 
    //   }
      
    
    
    
    
    
  }
}