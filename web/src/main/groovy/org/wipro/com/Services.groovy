package org.wipro.com

 class Services {
	
	 static UserDetails login(UserDetails user){
		def firstname = user.getFirstName()
		def lastname = user.getLastName()
		
		user.setFirstName(firstname)
		user.setLastName(lastname)
		
		return user
		
	}
	
}

