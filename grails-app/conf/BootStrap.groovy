class BootStrap {

    def grailsApplication

    def init = { servletContext ->
        def camelCtx = grailsApplication.mainContext.getBean('camelContext')
        //camelCtx.addRoutes(new ApplicationRoute())
        camelCtx.startAllRoutes()
    }
    def destroy = {
    }
}
