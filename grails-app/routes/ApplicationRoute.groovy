import org.apache.camel.builder.RouteBuilder
import MyProcess

class ApplicationRoute extends RouteBuilder {
  
  
  @Override
  void configure() {
      from("file:/home/mesbah/newFile")
      .routeId("myroute")
      // .unmarshal(csv)
      // .bindy(BindyType.Csv, FileData.class)
      .process(new MyProcess())
      .to("file:/home/mesbah/workspace1/Task1")    
  }
}