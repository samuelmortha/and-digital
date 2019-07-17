# and-digital
AND digital technical test

This is a Coding Challange exercise for AND digital technical interview.

Did develop a Java SpringBoot application which exposes the RESTful end points as API.

1. Used Maven as Project Management Tool.
2. Added and-digital-swagger.yaml for API specification of end points.
3. As mentioned in the specification, did not use database.
4. Wrote test cases according to the given specification and developed the code that passes the test cases.
5. Modeled PhoneNumber and Customer classes as basic POJOs.
6. URL to access the end points are as below :

	To get all PhoneNumbers in the system : HTTP-GET-REQUEST http://localhost:8080/api/phonenumbers
	
	To get all PhoneNumbers associated with a customer : HTTP-GET-REQUEST http://localhost:8080/api/phonenumbers/customer/{id}
	
	To activate a PhoneNumber : HTTP-POST-REQUEST http://localhost:8080/api/phonenumbers/activate
 