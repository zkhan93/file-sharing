# file-sharing

It's a pretty simple Java code that takes a file and send it to other device over LAN

### Server
In order to use this we need to compile it, like any other java file.
first we are compiling [Server.java](Server.java) file on device which has the file we want to share.
`javac Server.java`

##### Server the file
Then we serve the file let's say `sharethisfile.txt` as follows
`java Server sharethisfile.txt`
oh yes, we have to pass the filename along with path(relative path) to the program

### Client
Now as our file(`sharethisfile.txt`) is ready to be received on other device we have to compile `Client.java` on client device and run it to get the file.
compile the code `javac Client.java`

##### Receive the file
to receive the file we have to run the following command in same place where we have compiled the source code.
`java Client <server IP>`
for example
`java Client 192.168.2.5`
and yes you need to have the IP address of the hosting server from which you have served the file.
