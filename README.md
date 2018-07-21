# vaadin-mvn-electron

## What is it?
  It is a vaadin 8 spring boot based java web app. The application is wrapped via electron into a desktop application.
  The app shall help people start with vaadin in electron based on maven. If you will it is the maven version of this gradle based approach https://github.com/cuba-labs/java-electron-tutorial
  
  ## Install
  cd into the electron folder inside the electron module and call
  
  npm install electron --save-dev
  
  npm install minimal-request-promise
  
  npm install tree-kill


now run from the parent mvn clean install

## Run

After install cd into the electron folder inside the electron module and call

npx electron .

The tomcat will boot and the electron wrapper will appear.



 

