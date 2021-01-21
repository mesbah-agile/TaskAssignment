class BootStrap {

    def grailsApplication

    def init = { servletContext ->
        def camelCtx = grailsApplication.mainContext.getBean('camelContext')
        //camelCtx.addRoutes(new ApplicationRoute())
        camelCtx.startRoute("myroute")
        // camelCtx.startAllRoutes()
        // def something = new ApplicationRoute()
        // log.info("@@ ${something}")
        // log.info("${camelCtx.getRoutes()}")
        log.info("Camel started")
        //camelCtx.stop()
    }
    def destroy = {
    }
}
