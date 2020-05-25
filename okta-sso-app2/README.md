To run:<br/>
Open a terminal and go to the directory <br/>
Set the following environment variables using export/setenv or equivalent command:<br/>
issuer (the authroization url, Okta -> API -> Authorization Servers -> copy issuer URI from default) <br/>
clientId (Okta -> Applications -> Select Application -> General) <br/>
clientSecret (Okta -> Applications -> Select Application -> General) <br/>

./mvnw spring-boot:run
