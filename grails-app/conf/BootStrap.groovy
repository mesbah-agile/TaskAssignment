class BootStrap {

    def grailsApplication

    def init = { servletContext ->
        def camelCtx = grailsApplication.mainContext.getBean('camelContext')
        camelCtx.addRoutes(new ApplicationRoute())
        camelCtx.start()
        log.info("Camel started")
    }
    def destroy = {
    }
}
