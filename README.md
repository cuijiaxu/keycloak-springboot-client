keycloak 3.4.3Final  Springboot1.5.9  

mainproperties:
			#keycloak
				keycloak.auth-server-url=http://localhost:8080/auth                //the keycloak  server url 
				keycloak.realm=dispatch-backend                                          //Realm
				keycloak.public-client=true
				keycloak.resource=dispatch-backend                                      //Client-id

				keycloak.security-constraints[0].authRoles[0]=dispatch_role_admin       //Role
				keycloak.security-constraints[0].securityCollections[0].patterns[0]=/*    //Resources need be protected
				
				
connect：cuijia_xu@sina.com