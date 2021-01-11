import org.apache.camel.builder.RouteBuilder

class ApplicationRoute extends RouteBuilder {

  @Override
  void configure() {
      from("file:/home/mesbah/newFile?delete=true")
      .log("Processing")
      .to("file:/home/mesbah/workspace1/Task1/output")
  }

}