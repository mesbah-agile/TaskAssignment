class UrlMappings {

	static mappings = {

        // "/team"(resources: 'Team')
        // "/task"(resources: 'Task')
        // "/teamSkill"(resources: 'TeamSkill')
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
