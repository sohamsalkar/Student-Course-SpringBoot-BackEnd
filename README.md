# Student-Course-SpringBoot-BackEnd
 backend application for Student project
 
Conversation opened. 1 read message.

Skip to content
Using Gmail with screen readers
Meet
New meeting
Join a meeting
Hangouts

4 of 9,281
(no subject)
Inbox

Riteshkumar Singh
Attachments
6:46 PM (1 hour ago)
to Salkarsoham2


Attachments area
spring boot layers
1.integration layer : linked with service.ts
2.data access layer
3.service layer

database layer integration using model class

--code files
 
application.prop
postmantool

1.model/entity class
2. repository interface
3.service interface and implementation class
4. rest controller


steps 1. application.properties
 server details
	server.port=
 connection details
	spring.datasource.driver-class-name=
	spring.datasource.url=
	spring.datasource.username=
	spring.datasource.password=
 jpa details 
	spring.jpa.show-sql=true
	spring.jpa.hibernate.ddl-auto=create
	spring.jpa.database-platform=org.hibernate.

step 2. create class with table name in .model package
 private Dtatype Name;
 @Data (take cares of getters and setters)
 @Entity
 @Table(name="table name")	
 @Id
 @GeneratedValue
 @Column(name="ColumnName")
step 3: create StudentRepository interface in .repo package
 extends JPArepository
step 4: create istudentservice  interface in .service  packege
 write all operations you need to perform  
step 5: create studentserviceimpl class in .service.impl package
 add istudentservice interface there
 @Service 
 @autowired
private studentrepository repo;

2 ways to use DRY!
1. add util class in .util package
@autowired
private StudentUtil util;
2. make util interface and method static and use it

step 6 : create restcontroller class in .rest
@RestController
@RequestMapping("/student")

@Autowired
private IstudentService service;

angular 
ng g class classname
ng g s name
ng g c comp name
sb.txt
Displaying sb.txt.
