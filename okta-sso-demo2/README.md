To run:<br/>
Open a terminal and go to the directory <br/>
Set the following environment variables:<br/>
issuer (the authroization url, Okta -> API -> Authorization Servers -> copy issuer URI from default) <br/>
client-Id (Okta -> Applications -> Select Application -> General) <br/>
client-Secret (Okta -> Applications -> Select Application -> General) <br/>

./mvnw spring-boot:run