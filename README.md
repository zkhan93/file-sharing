# file-sharing

It's a pretty simple Java code that takes a file and send it to other device over LAN

### Server
In order to use this we need to compile it, like any other java file.
first we are compiling [Server.java](Server.java) file on device which has the file we want to share.
`javac Server.java`
please note that you need the IP address of this server machine- just make a note we will need this later.

##### Server the file
To serve a file let's say `sharethisfile.txt` type the following in the
we have to pass the filename along with path(relative path) to the program
`java Server ./sharethisfile.txt`


### Client
Now as our file(`sharethisfile.txt`) is ready to be received on other device we have to compile `Client.java` on client device and run it to get the file.
compile the code `javac Client.java`

##### Receive the file
to receive the file we have to run the following command in same place where we have compiled the source code.
`java Client <server IP>`
for example
`java Client 192.168.2.5`
