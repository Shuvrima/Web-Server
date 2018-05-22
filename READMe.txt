Name : Shuvrima Alam
Student ID: 1001085726
Course : CSE 4344-002

-------------------------
PROJECT DESCRIPTION
-------------------------

The project has been divided into 2 parts, the client and the server.


---------------
REFERENCE USED
---------------

For Eclipse IDE :
1)To run the server on eclipse import Main.java, Response.java, Request.java and RequestHandler.java
Then compile these files and run Main only. The main will run the server and if a browser like chrome
is used and http://localhost:8080/test.htm is type the browser will open the html file. If another tabs
are opened and same address is typed on searched then tabs will show the html page (hence showing
multithreading).
2) To run the web client run the HttpClient.java after running the Main.java and connecting server. The
HttpClient.java will show the html file contents on the shell/command prompt.

For Windows command prompt:

1) Compile the RequestHandler first using : javac ResquestHandler.java
2) Complile the Request.java as second step : javac Resquest.java
3) Step3: Compile Response.java by : javac Response.java Request.java
4) Step 4: Compile Connection.java by : javac Connection.java Response.java Request.java
5) Last step: Compile Main.java to run the server : javac Main.java  Connection.java Response.java Request.java RequestHandler.java// TA can try this line after setting path
6) Run command cd.. to go back to 1001085726_ShuvrimaAlam folder in cmd
7) From here run by using: java demo.Main //demo is my package name in eclipse and Main the Server class.

To run the HttpClient file:
1) Open another command prompt not closing the one before. Set path.
2)Find the directory where HttpClient. java
3)Compile: javac HttpClient.java Main.java  Connection.java Response.java Request.java RequestHandler.java
4)Run: first command cd.. to go back to 1001085726_ShuvrimaAlam folder
5)Then run by using : java demo.HttpClient //demo being my package.



the html file provided is test.htm. It is present in the root folder. It should be saved in C drive
as I have hard coded its path in my code.

Here are the list of the websites I referred to while I was doing this assignment.


1) http://cs.lmu.edu/~ray/notes/javanetexamples/
2) https://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html
3) Socket Communications from http://www.oracle.com/technetwork/java/socket-140484.html