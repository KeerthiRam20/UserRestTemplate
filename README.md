# UserRestTemplate
 Rest template Consumer application 
 RestTemplate is a synchronous client to perform HTTP requests.
 RestTemplate provides higher-level methods for each of the HTTP methods which make it easy to invoke RESTful services.
 The names of most of the methods are based on a naming convention:
1.The first part in the name indicates the HTTP method being invoked
2.The second part in the name indicates returned element.

 In this application I am consuming the published department info using the resttemplate .
 @Bean
	    public RestTemplate restTemplate(){
	        return new RestTemplate();
	    }
     
In the serviceimplementation class I have used the url("http://localhost:8082/api/departments/" + user.getUserid()) which helps to communicate with the department application.

By retriving the information of user by id the corresponding department data a mapped with the user is also retrived.
