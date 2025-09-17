README

The ZBot application needs to run on the same server where the test-run result file is located. 
After installing ZBot, you can use it to automatically pick up the test-run result file, relay it back to the configured Zephyr for Jira instance which will create the corresponding test cases and set the test  execution results accordingly. 
ZBot can be downloaded directly from the Help menu located on all Zephyr-owned pages in Jira. Once you extract the ZIP file it would contain a ZBot jar file which is the  main application file. 
Run the application file as per the instructions below, this will also create the log and ZBot properties file.

Prerequisite : Java must be installed and configured  in the environment variables in your system.

Steps: 
1) To download the ZBot, simply click on the Help button that is located on all the Zephyr-owned pages in your Jira instance.
2) After navigating to the Help button, select the Download ZBot option, this will start a download process which will download a ZIP file to your system. 
3) Extract the ZIP file and run the jar file contained within on your terminal or command prompt. 
4)In your terminal or command prompt, enter in the command to run the ZBot jar file  EX:-  java -jar ZFJ-ServerZbot-1.0.jar
5) Provide the Server base URL on the terminal or command prompt, this consists of both the IP address of the Jira server (instance) and the port number, 
    please provide both to proceed.
6) Provide your server authentication credentials before proceeding.
7) Provide a user friendly name for your ZBot so you can identify your ZBot while configuring an ATOM task.
8) You now have the option to start, stop or kill your ZBot on the server. To perform any of the actions, simply enter in the commands into your terminal or command prompt.
9) Start, Stop and Kill the ZBot
    9.a) Start - Will register your ZBot.
    9.b) Stop - Will deregister your ZBot. After Stop you can restart ZBot using "Start".
    9.c) Kill - Will terminate the ZBot process. If you want to restart the process, repeat all the steps from step "4".

For further information on ZBot and its related configuration please refer the documentation link below based on your version of Zephyr For Jira below link : 
https://zephyrdocs.atlassian.net/wiki/spaces/ZFJ0400/pages/1402896448/Download+and+Use+the+ZBot (ZFJ version - 4.4.0)
https://zephyrdocs.atlassian.net/wiki/spaces/ZFJ0500/pages/1381531682/Download+and+Use+the+ZBot (ZFJ version - 5.5.0)

